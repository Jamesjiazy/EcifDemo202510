package com.mcore.hsbc.ecif.implementation.api.mock.service;

import com.mcore.hsbc.ecif.api.service.ConsolidationCustByAcctNoApiService;
import com.mcore.hsbc.ecif.api.service.request.ConsolidationCustByAcctNoExecuteRequest;
import com.mcore.hsbc.ecif.api.service.response.ConsolidationCustByAcctNoExecuteResponse;
import com.mcore.hsbc.ecif.application.service.ConsolidationCustByAcctNoApplicationService;
import com.mcore.hsbc.ecif.implementation.api.mock.listener.MockService;
import com.mcore.hsbc.ecif.implementation.api.service.ConsolidationCustByAcctNoApiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：客户归并-单账号
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class MockConsolidationCustByAcctNoApiServiceImpl
    extends ConsolidationCustByAcctNoApiServiceImpl
    implements ConsolidationCustByAcctNoApiService
{
    @Autowired
    private ConsolidationCustByAcctNoApplicationService consolidationCustByAcctNoApplicationService;
    @Autowired
    private MockService mockService;
    private static final String SERVICE_NAME = "consolidationCustByAcctNoApiService";
    private static final String INTERFACE_NAME = "ConsolidationCustByAcctNoApiService";

    @Override
    public ConsolidationCustByAcctNoExecuteResponse execute(ConsolidationCustByAcctNoExecuteRequest request) {
        String methodName;
        methodName = Thread.currentThread().getStackTrace()[ 1 ].getMethodName();
        if (mockService.isInBlackList(INTERFACE_NAME, methodName)) {
            return super.execute(request);
        }
        ConsolidationCustByAcctNoExecuteResponse response = mockService.getMockData(SERVICE_NAME, methodName, request, ConsolidationCustByAcctNoExecuteResponse.class);
        if (response == null) {
            return super.execute(request);
        }
        return response;
    }
}
