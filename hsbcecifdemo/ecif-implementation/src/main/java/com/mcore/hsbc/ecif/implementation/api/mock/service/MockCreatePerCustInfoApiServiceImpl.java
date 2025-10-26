package com.mcore.hsbc.ecif.implementation.api.mock.service;

import com.mcore.hsbc.ecif.api.service.CreatePerCustInfoApiService;
import com.mcore.hsbc.ecif.api.service.request.CreatePerCustInfoCreatePerCustInfoRequest;
import com.mcore.hsbc.ecif.api.service.response.CreatePerCustInfoCreatePerCustInfoResponse;
import com.mcore.hsbc.ecif.application.service.CreatePerCustInfoApplicationService;
import com.mcore.hsbc.ecif.implementation.api.mock.listener.MockService;
import com.mcore.hsbc.ecif.implementation.api.service.CreatePerCustInfoApiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：对私三要素开立客户
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class MockCreatePerCustInfoApiServiceImpl
    extends CreatePerCustInfoApiServiceImpl
    implements CreatePerCustInfoApiService
{
    @Autowired
    private CreatePerCustInfoApplicationService createPerCustInfoApplicationService;
    @Autowired
    private MockService mockService;
    private static final String SERVICE_NAME = "createPerCustInfoApiService";
    private static final String INTERFACE_NAME = "CreatePerCustInfoApiService";

    @Override
    public CreatePerCustInfoCreatePerCustInfoResponse CreatePerCustInfo(CreatePerCustInfoCreatePerCustInfoRequest request) {
        String methodName;
        methodName = Thread.currentThread().getStackTrace()[ 1 ].getMethodName();
        if (mockService.isInBlackList(INTERFACE_NAME, methodName)) {
            return super.CreatePerCustInfo(request);
        }
        com.mcore.hsbc.ecif.api.service.response.CreatePerCustInfoCreatePerCustInfoResponse response = mockService.getMockData(SERVICE_NAME, methodName, request, com.mcore.hsbc.ecif.api.service.response.CreatePerCustInfoCreatePerCustInfoResponse.class);
        if (response == null) {
            return super.CreatePerCustInfo(request);
        }
        return response;
    }
}
