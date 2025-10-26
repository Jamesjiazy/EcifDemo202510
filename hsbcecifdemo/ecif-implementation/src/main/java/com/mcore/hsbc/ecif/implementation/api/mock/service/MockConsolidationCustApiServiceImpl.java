package com.mcore.hsbc.ecif.implementation.api.mock.service;

import com.mcore.hsbc.ecif.api.service.ConsolidationCustApiService;
import com.mcore.hsbc.ecif.api.service.request.ConsolidationCustExecuteRequest;
import com.mcore.hsbc.ecif.api.service.response.ConsolidationCustExecuteResponse;
import com.mcore.hsbc.ecif.application.service.ConsolidationCustApplicationService;
import com.mcore.hsbc.ecif.implementation.api.mock.listener.MockService;
import com.mcore.hsbc.ecif.implementation.api.service.ConsolidationCustApiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：客户归并
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class MockConsolidationCustApiServiceImpl
    extends ConsolidationCustApiServiceImpl
    implements ConsolidationCustApiService
{
    @Autowired
    private ConsolidationCustApplicationService consolidationCustApplicationService;
    @Autowired
    private MockService mockService;
    private static final String SERVICE_NAME = "consolidationCustApiService";
    private static final String INTERFACE_NAME = "ConsolidationCustApiService";

    @Override
    public ConsolidationCustExecuteResponse execute(ConsolidationCustExecuteRequest request) {
        String methodName;
        methodName = Thread.currentThread().getStackTrace()[ 1 ].getMethodName();
        if (mockService.isInBlackList(INTERFACE_NAME, methodName)) {
            return super.execute(request);
        }
        ConsolidationCustExecuteResponse response = mockService.getMockData(SERVICE_NAME, methodName, request, ConsolidationCustExecuteResponse.class);
        if (response == null) {
            return super.execute(request);
        }
        return response;
    }
}
