package com.mcore.hsbc.ecif.implementation.api.mock.service;

import com.mcore.hsbc.ecif.api.service.QuryCustAcctInfoByCustAcctApiService;
import com.mcore.hsbc.ecif.application.service.QuryCustAcctInfoByCustAcctApplicationService;
import com.mcore.hsbc.ecif.implementation.api.mock.listener.MockService;
import com.mcore.hsbc.ecif.implementation.api.service.QuryCustAcctInfoByCustAcctApiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：通过账号查询客户账户路由信息
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class MockQuryCustAcctInfoByCustAcctApiServiceImpl
    extends QuryCustAcctInfoByCustAcctApiServiceImpl
    implements QuryCustAcctInfoByCustAcctApiService
{
    @Autowired
    private QuryCustAcctInfoByCustAcctApplicationService quryCustAcctInfoByCustAcctApplicationService;
    @Autowired
    private MockService mockService;
    private static final String SERVICE_NAME = "quryCustAcctInfoByCustAcctApiService";
    private static final String INTERFACE_NAME = "QuryCustAcctInfoByCustAcctApiService";
}
