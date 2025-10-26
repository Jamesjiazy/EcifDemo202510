package com.mcore.hsbc.ecif.implementation.api.mock.service;

import com.mcore.hsbc.ecif.api.service.QuryPerCustNameListInfoByCustNoApiService;
import com.mcore.hsbc.ecif.api.service.request.QuryPerCustNameListInfoByCustNoQuryPerCustNameListInfoByCustNoRequest;
import com.mcore.hsbc.ecif.api.service.response.QuryPerCustNameListInfoByCustNoQuryPerCustNameListInfoByCustNoResponse;
import com.mcore.hsbc.ecif.application.service.QuryPerCustNameListInfoByCustNoApplicationService;
import com.mcore.hsbc.ecif.implementation.api.mock.listener.MockService;
import com.mcore.hsbc.ecif.implementation.api.service.QuryPerCustNameListInfoByCustNoApiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：对私客户名单信息查询
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class MockQuryPerCustNameListInfoByCustNoApiServiceImpl
    extends QuryPerCustNameListInfoByCustNoApiServiceImpl
    implements QuryPerCustNameListInfoByCustNoApiService
{
    @Autowired
    private QuryPerCustNameListInfoByCustNoApplicationService quryPerCustNameListInfoByCustNoApplicationService;
    @Autowired
    private MockService mockService;
    private static final String SERVICE_NAME = "quryPerCustNameListInfoByCustNoApiService";
    private static final String INTERFACE_NAME = "QuryPerCustNameListInfoByCustNoApiService";

    @Override
    public QuryPerCustNameListInfoByCustNoQuryPerCustNameListInfoByCustNoResponse QuryPerCustNameListInfoByCustNo(QuryPerCustNameListInfoByCustNoQuryPerCustNameListInfoByCustNoRequest request) {
        String methodName;
        methodName = Thread.currentThread().getStackTrace()[ 1 ].getMethodName();
        if (mockService.isInBlackList(INTERFACE_NAME, methodName)) {
            return super.QuryPerCustNameListInfoByCustNo(request);
        }
        com.mcore.hsbc.ecif.api.service.response.QuryPerCustNameListInfoByCustNoQuryPerCustNameListInfoByCustNoResponse response = mockService.getMockData(SERVICE_NAME, methodName, request, com.mcore.hsbc.ecif.api.service.response.QuryPerCustNameListInfoByCustNoQuryPerCustNameListInfoByCustNoResponse.class);
        if (response == null) {
            return super.QuryPerCustNameListInfoByCustNo(request);
        }
        return response;
    }
}
