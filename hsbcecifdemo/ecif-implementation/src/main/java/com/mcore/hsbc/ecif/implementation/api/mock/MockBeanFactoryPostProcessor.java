package com.mcore.hsbc.ecif.implementation.api.mock;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class MockBeanFactoryPostProcessor implements BeanFactoryPostProcessor, EnvironmentAware {

    private Environment environment;

    private static final Map<String, String> mockBeanMap = new HashMap<>();

    static {
        mockBeanMap.put("quryCustAcctInfoByCustAcctApiService", "com.mcore.hsbc.ecif.implementation.api.mock.service.MockQuryCustAcctInfoByCustAcctApiServiceImpl");
        mockBeanMap.put("quryPerCustChnlTxnCommondApiService", "com.mcore.hsbc.ecif.implementation.api.mock.service.MockQuryPerCustChnlTxnCommondApiServiceImpl");
        mockBeanMap.put("quryOvsCashWithdrReCtrFlgApiService", "com.mcore.hsbc.ecif.implementation.api.mock.service.MockQuryOvsCashWithdrReCtrFlgApiServiceImpl");
        mockBeanMap.put("quryPerCustRiskLevelApiService", "com.mcore.hsbc.ecif.implementation.api.mock.service.MockQuryPerCustRiskLevelApiServiceImpl");
        mockBeanMap.put("mgmtPerCustInfoApiService", "com.mcore.hsbc.ecif.implementation.api.mock.service.MockMgmtPerCustInfoApiServiceImpl");
        mockBeanMap.put("crtPerCustInfoApiService", "com.mcore.hsbc.ecif.implementation.api.mock.service.MockCrtPerCustInfoApiServiceImpl");
        mockBeanMap.put("createPerCustInfoApiService", "com.mcore.hsbc.ecif.implementation.api.mock.service.MockCreatePerCustInfoApiServiceImpl");
        mockBeanMap.put("quryCustInfoApiService", "com.mcore.hsbc.ecif.implementation.api.mock.service.MockQuryCustInfoApiServiceImpl");
        mockBeanMap.put("quryCustTypeApiService", "com.mcore.hsbc.ecif.implementation.api.mock.service.MockQuryCustTypeApiServiceImpl");
        mockBeanMap.put("consolidationCustApiService", "com.mcore.hsbc.ecif.implementation.api.mock.service.MockConsolidationCustApiServiceImpl");
        mockBeanMap.put("mgmtCustAcctInfoApiService", "com.mcore.hsbc.ecif.implementation.api.mock.service.MockMgmtCustAcctInfoApiServiceImpl");
        mockBeanMap.put("quryCustAcctInfoByCustNoApiService", "com.mcore.hsbc.ecif.implementation.api.mock.service.MockQuryCustAcctInfoByCustNoApiServiceImpl");
        mockBeanMap.put("consolidationCustByAcctNoApiService", "com.mcore.hsbc.ecif.implementation.api.mock.service.MockConsolidationCustByAcctNoApiServiceImpl");
        mockBeanMap.put("quryPerCustInfoByCustNoApiService", "com.mcore.hsbc.ecif.implementation.api.mock.service.MockQuryPerCustInfoByCustNoApiServiceImpl");
        mockBeanMap.put("quryPerCustNameListInfoByCustNoApiService", "com.mcore.hsbc.ecif.implementation.api.mock.service.MockQuryPerCustNameListInfoByCustNoApiServiceImpl");
        mockBeanMap.put("qurySignRelationInfoApiService", "com.mcore.hsbc.ecif.implementation.api.mock.service.MockQurySignRelationInfoApiServiceImpl");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        boolean mockEnable = Boolean.TRUE.equals(environment.getProperty("api.mock.enable", Boolean.TYPE));
        if (!mockEnable) {
            log.info("挡板开关关闭，不处理挡板类");
            return;
        }
        log.info("挡板开关开启，开始处理挡板类");
        for (String beanId : mockBeanMap.keySet()) {
            BeanDefinition db = beanFactory.getBeanDefinition(beanId);
            db.setBeanClassName(mockBeanMap.get(beanId));
        }
        log.info("挡板开关开启，结束处理挡板类");
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
