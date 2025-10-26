package com.mcore.hsbc.ecif.implementation.api.mock.listener;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.mvel2.MVEL;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import java.util.*;
import org.apache.commons.lang3.StringUtils;
import com.mcore.base.header.validate.jsonschema.ValidateUtil;
import com.mcore.base.header.CoreAppResponseHeader;
import com.mcore.base.config.ApiConfig;
import org.springframework.beans.factory.annotation.Value;
import com.mcore.hsbc.ecif.infrastructure.constants.CommonConstant;
import com.mcore.hsbc.ecif.infrastructure.constants.SymbolConstant;
import com.mcore.hsbc.ecif.implementation.api.mock.listener.MockInfo;


@Service
@Slf4j
public class MockService {

     /**
     * 挡板方法黑名单，在此黑名单的方法不会返回挡板数据
     */
    private final Set<String> skipMethodBlacklistSet = new HashSet<>();

    /**
     * mock数据，key：serviceName-methodName，value：不同条件下的mock数据
     */
    private final Map<String, List<MockInfo>> mockInfoMap = new HashMap<>();

    @Value("${api.mock.validation.enable}")
    private boolean apiMockValidate;

    public void initMockData(MockInfo mockInfo) {
        String key = mockInfo.getService() + "-" + mockInfo.getMethod();
        if (mockInfoMap.containsKey(key)) {
            List<MockInfo> mockInfos = mockInfoMap.get(key);
            mockInfos.add(mockInfo);
        } else {
            List<MockInfo> mockInfos = new ArrayList<>(Collections.singletonList(mockInfo));
            mockInfoMap.put(key, mockInfos);
        }
    }

    public void initSkipMethodBlackList(String[] skipMethodBlacklist) {
        if (skipMethodBlacklist == null) {
            return;
        }
        skipMethodBlacklistSet.addAll(Arrays.asList(skipMethodBlacklist));
    }

    public boolean isInBlackList(String interfaceName, String methodName) {
        String key = interfaceName + "." + methodName;
        return skipMethodBlacklistSet.contains(key);
    }

    public <T, V> T getMockData(String service, String method, V request, Class<T> clazz) {
        log.info("服务：{}，方法：{}，获取挡板数据", service, method);
        if (apiMockValidate) {
            CoreAppResponseHeader coreAppResponseHeader = validateMockRequest(service, method, request);
            if (!StringUtils.equals(coreAppResponseHeader.getRspndCd(), CommonConstant.DEFAULT_RESPONSE_CODE)) {
                return JSON.parseObject(JSONObject.toJSONString(coreAppResponseHeader),clazz);
            }
        }
        List<MockInfo> mockInfos = mockInfoMap.get(appendKey(service, method));
        if (CollectionUtils.isEmpty(mockInfos)) {
            return null;
        }
        for (MockInfo mockInfo : mockInfos) {
            Object obj = MVEL.eval(mockInfo.getMvelExp(), request);
            if (Objects.equals(obj, Boolean.TRUE)) {
                return JSON.parseObject(mockInfo.getData(), clazz);
            }
        }
        return null;
    }

    public String appendKey(String service, String method) {
        StringBuilder sbd = new StringBuilder();
        sbd.append(service);
        sbd.append(SymbolConstant.ROD_SYMBOL);
        sbd.append(method);
        return sbd.toString();
    }

    private CoreAppResponseHeader validateMockRequest(String service, String method, Object request) {
        log.info("mock校验开关已开启");
        CoreAppResponseHeader coreAppResponseHeader = new CoreAppResponseHeader();
        coreAppResponseHeader.setRspndCd(CommonConstant.DEFAULT_RESPONSE_CODE);
        try {
            ValidateUtil.validate(request, captureName(service.replace("ApiService", SymbolConstant.EMPTY_SYMBOL)).concat(captureName(method)));
        } catch (Exception e) {
            log.error(String.format("验证挡板请求异常,微服务接口:%s,接口方法:%s", service, method), e);
            if (e.getMessage().contains(SymbolConstant.VERTICAL_SYMBOL)) {
                coreAppResponseHeader.setRspndCd(buildRspndCd(service, method,e.getMessage().split(SymbolConstant.VERTICAL_SYMBOL)[CommonConstant.DEFAULT_ZERO_INT]));
                coreAppResponseHeader.setRspndInfo(e.getMessage().split(SymbolConstant.VERTICAL_SYMBOL)[CommonConstant.DEFAULT_ONE_INT]);
            }
        }
        return coreAppResponseHeader;
    }

    private String captureName(String str) {
        // 进行字母的ascii编码前移，效率要高于截取字符串进行转换的操作
        char[] cs = str.toCharArray();
        cs[0] -= 32;
        return String.valueOf(cs);
    }

    private String buildRspndCd(String service, String method, String appRspCd) {
        if (appRspCd.length() == 19) {
           return appRspCd;
        }
        String functionCode = captureName(service.replace("ApiService", SymbolConstant.EMPTY_SYMBOL)).concat(captureName(method)).concat("FunctionCode");
        functionCode = StringUtils.defaultIfBlank(ApiConfig.apiMap.get(functionCode), CommonConstant.DEFAULT_FUNCTION_CODE);
        return System.getProperty("spring.application.code", System.getenv("spring.application.code")).concat(functionCode).concat(appRspCd);
    }
}