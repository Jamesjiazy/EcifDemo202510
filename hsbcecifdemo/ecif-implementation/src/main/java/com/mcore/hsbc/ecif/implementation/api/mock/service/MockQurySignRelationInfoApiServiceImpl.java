package com.mcore.hsbc.ecif.implementation.api.mock.service;

import com.mcore.hsbc.ecif.api.service.QurySignRelationInfoApiService;
import com.mcore.hsbc.ecif.api.service.request.QurySignRelationInfoExecuteRequest;
import com.mcore.hsbc.ecif.api.service.response.QurySignRelationInfoExecuteResponse;
import com.mcore.hsbc.ecif.application.service.QurySignRelationInfoApplicationService;
import com.mcore.hsbc.ecif.implementation.api.mock.listener.MockService;
import com.mcore.hsbc.ecif.implementation.api.service.QurySignRelationInfoApiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：客户签约关系查询
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class MockQurySignRelationInfoApiServiceImpl
    extends QurySignRelationInfoApiServiceImpl
    implements QurySignRelationInfoApiService
{
    @Autowired
    private QurySignRelationInfoApplicationService qurySignRelationInfoApplicationService;
    @Autowired
    private MockService mockService;
    private static final String SERVICE_NAME = "qurySignRelationInfoApiService";
    private static final String INTERFACE_NAME = "QurySignRelationInfoApiService";

    @Override
    public QurySignRelationInfoExecuteResponse execute(QurySignRelationInfoExecuteRequest request) {
        String methodName;
        methodName = Thread.currentThread().getStackTrace()[ 1 ].getMethodName();
        if (mockService.isInBlackList(INTERFACE_NAME, methodName)) {
            return super.execute(request);
        }
        QurySignRelationInfoExecuteResponse response = mockService.getMockData(SERVICE_NAME, methodName, request, QurySignRelationInfoExecuteResponse.class);
        if (response == null) {
            return super.execute(request);
        }
        return response;
    }
}
