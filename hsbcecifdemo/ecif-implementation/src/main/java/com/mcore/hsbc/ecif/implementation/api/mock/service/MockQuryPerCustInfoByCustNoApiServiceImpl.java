package com.mcore.hsbc.ecif.implementation.api.mock.service;

import com.mcore.hsbc.ecif.api.service.QuryPerCustInfoByCustNoApiService;
import com.mcore.hsbc.ecif.api.service.request.QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoRequest;
import com.mcore.hsbc.ecif.api.service.response.QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoResponse;
import com.mcore.hsbc.ecif.application.service.QuryPerCustInfoByCustNoApplicationService;
import com.mcore.hsbc.ecif.implementation.api.mock.listener.MockService;
import com.mcore.hsbc.ecif.implementation.api.service.QuryPerCustInfoByCustNoApiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：根据客户编号查询个人客户信息
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class MockQuryPerCustInfoByCustNoApiServiceImpl
    extends QuryPerCustInfoByCustNoApiServiceImpl
    implements QuryPerCustInfoByCustNoApiService
{
    @Autowired
    private QuryPerCustInfoByCustNoApplicationService quryPerCustInfoByCustNoApplicationService;
    @Autowired
    private MockService mockService;
    private static final String SERVICE_NAME = "quryPerCustInfoByCustNoApiService";
    private static final String INTERFACE_NAME = "QuryPerCustInfoByCustNoApiService";

    @Override
    public QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoResponse QuryPerCustInfoByCustNo(QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoRequest request) {
        String methodName;
        methodName = Thread.currentThread().getStackTrace()[ 1 ].getMethodName();
        if (mockService.isInBlackList(INTERFACE_NAME, methodName)) {
            return super.QuryPerCustInfoByCustNo(request);
        }
        com.mcore.hsbc.ecif.api.service.response.QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoResponse response = mockService.getMockData(SERVICE_NAME, methodName, request, com.mcore.hsbc.ecif.api.service.response.QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoResponse.class);
        if (response == null) {
            return super.QuryPerCustInfoByCustNo(request);
        }
        return response;
    }
}
