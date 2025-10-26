package com.mcore.hsbc.ecif.implementation.controller;

import cn.hutool.core.util.StrUtil;
import cn.hutool.extra.spring.SpringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Map;
import com.mcore.hsbc.ecif.infrastructure.util.CommonUtil;

/**
* *********************************************************************************************************************
* <br>    系统名称：外网通用分布式核心
* <br>    微服务名称：HSBC ECIF DEMO
* <br>    版本号：head
* <br>    创建者：zj_zengq
* <br>    创建日期：2025-09-19 14:45:52
* <br>    程序功能：
* <br> ----------------------------------------------------------------------------------------------------------------
* <br>    功能及场景描述：
* <br> ----------------------------------------------------------------------------------------------------------------
* <br>    修改说明：
* <br>    日期   修改人    修改说明
* <br> ----------------------------------------------------------------------------------------------------------------
* <br>
*
*/
@RestController
@RequestMapping({"/app"})
public class AppDispatcherController {
   private static final Logger logger = LoggerFactory.getLogger(AppDispatcherController.class);

    @PostMapping({"/execute"})
    @Transactional(rollbackFor = Exception.class)
    public Object execute(HttpServletRequest request) {
        Map<String, Object> requsetMap = CommonUtil.buildRestRequest(request);
        String serviceId = String.valueOf(requsetMap.get("serviceId"));
        String action = String.valueOf(requsetMap.get("action"));
        requsetMap.remove("serviceId");
        requsetMap.remove("action");
        if (requsetMap.get("page") != null) {
            requsetMap.put("pageNumber", requsetMap.get("page"));
            requsetMap.remove("page");
        }
        Object bean = SpringUtil.getBean(StrUtil.lowerFirst(serviceId));
        if (bean == null) {
            throw new IllegalArgumentException("service未匹配");
        }
        Object invoke;
        try {
            Method method = bean.getClass().getDeclaredMethod(action, Object.class);
            invoke = method.invoke(bean, requsetMap);
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("method未匹配");
        } catch (Exception e) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            logger.error("发生异常：{}", e);
            throw new RuntimeException(e);
        }
        return invoke;
    }
}
