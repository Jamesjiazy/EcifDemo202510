package com.mcore.hsbc.ecif.implementation.api.service;

import cn.hutool.extra.spring.SpringUtil;
import com.mcore.hsbc.ecif.api.service.MgmtCustAcctInfoApiService;
import com.mcore.hsbc.ecif.api.service.request.MgmtCustAcctInfoExecuteRequest;
import com.mcore.hsbc.ecif.api.service.response.MgmtCustAcctInfoExecuteResponse;
import com.mcore.hsbc.ecif.application.service.MgmtCustAcctInfoApplicationService;
import com.mcore.hsbc.ecif.infrastructure.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：客户账户路由信息维护
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class MgmtCustAcctInfoApiServiceImpl
    implements MgmtCustAcctInfoApiService
{
    @Autowired
    private MgmtCustAcctInfoApplicationService mgmtCustAcctInfoApplicationService;

    /**
     * 客户账户路由信息维护
     * 
     * @param request
     * @return
     */
    @Override
    public MgmtCustAcctInfoExecuteResponse execute(MgmtCustAcctInfoExecuteRequest request) {
        MgmtCustAcctInfoExecuteResponse response = mgmtCustAcctInfoApplicationService.execute(request);
        return response;
    }

    /**
     * 客户账户路由信息维护
     * 
     * @param object
     * @return
     */
    @Override
    public MgmtCustAcctInfoExecuteResponse execute(Object object) {
        MgmtCustAcctInfoExecuteRequest request = CommonUtil.transJSONObject(object, MgmtCustAcctInfoExecuteRequest.class);
        MgmtCustAcctInfoApiService mgmtcustacctinfoapiservice = SpringUtil.getBean(MgmtCustAcctInfoApiService.class);
        MgmtCustAcctInfoExecuteResponse response = mgmtcustacctinfoapiservice.execute(request);
        return response;
    }
}
