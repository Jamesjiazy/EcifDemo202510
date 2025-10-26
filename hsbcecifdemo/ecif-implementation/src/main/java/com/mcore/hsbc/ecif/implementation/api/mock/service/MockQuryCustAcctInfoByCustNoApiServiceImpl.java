package com.mcore.hsbc.ecif.implementation.api.mock.service;

import com.mcore.hsbc.ecif.api.service.QuryCustAcctInfoByCustNoApiService;
import com.mcore.hsbc.ecif.api.service.request.QuryCustAcctInfoByCustNoExecuteRequest;
import com.mcore.hsbc.ecif.api.service.response.QuryCustAcctInfoByCustNoExecuteResponse;
import com.mcore.hsbc.ecif.application.service.QuryCustAcctInfoByCustNoApplicationService;
import com.mcore.hsbc.ecif.implementation.api.mock.listener.MockService;
import com.mcore.hsbc.ecif.implementation.api.service.QuryCustAcctInfoByCustNoApiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：通过客户号查询客户账户路由信息
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 */
public class MockQuryCustAcctInfoByCustNoApiServiceImpl
        extends QuryCustAcctInfoByCustNoApiServiceImpl
        implements QuryCustAcctInfoByCustNoApiService {
    @Autowired
    private QuryCustAcctInfoByCustNoApplicationService quryCustAcctInfoByCustNoApplicationService;
    @Autowired
    private MockService mockService;
    private static final String SERVICE_NAME = "quryCustAcctInfoByCustNoApiService";
    private static final String INTERFACE_NAME = "QuryCustAcctInfoByCustNoApiService";

    @Override
    public QuryCustAcctInfoByCustNoExecuteResponse execute(QuryCustAcctInfoByCustNoExecuteRequest request) {
        String methodName;
        methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        if (mockService.isInBlackList(INTERFACE_NAME, methodName)) {
            return super.execute(request);
        }
        com.mcore.hsbc.ecif.api.service.response.QuryCustAcctInfoByCustNoExecuteResponse response = mockService.getMockData(SERVICE_NAME, methodName, request, com.mcore.hsbc.ecif.api.service.response.QuryCustAcctInfoByCustNoExecuteResponse.class);
        if (response == null) {
            return super.execute(request);
        }
        return response;
    }

    @Override
    public QuryCustAcctInfoByCustNoExecuteResponse execute(Object request) {
        String methodName;
        methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        if (mockService.isInBlackList(INTERFACE_NAME, methodName)) {
            return super.execute(request);
        }
        QuryCustAcctInfoByCustNoExecuteResponse response = mockService.getMockData(SERVICE_NAME, methodName, request, QuryCustAcctInfoByCustNoExecuteResponse.class);
        if (response == null) {
            return super.execute(request);
        }
        return response;
    }
}
