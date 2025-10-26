package com.mcore.hsbc.ecif.implementation.api.service;

import cn.hutool.extra.spring.SpringUtil;
import com.mcore.hsbc.ecif.api.service.MgmtPerCustInfoApiService;
import com.mcore.hsbc.ecif.api.service.request.MgmtPerCustInfoMgmtPerCustInfoRequest;
import com.mcore.hsbc.ecif.api.service.response.MgmtPerCustInfoMgmtPerCustInfoResponse;
import com.mcore.hsbc.ecif.application.service.MgmtPerCustInfoApplicationService;
import com.mcore.hsbc.ecif.infrastructure.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：对私客户信息维护
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class MgmtPerCustInfoApiServiceImpl
    implements MgmtPerCustInfoApiService
{
    @Autowired
    private MgmtPerCustInfoApplicationService mgmtPerCustInfoApplicationService;

    /**
     * 对私客户信息维护
     * 
     * @param request
     * @return
     */
    @Override
    public MgmtPerCustInfoMgmtPerCustInfoResponse MgmtPerCustInfo(MgmtPerCustInfoMgmtPerCustInfoRequest request) {
        MgmtPerCustInfoMgmtPerCustInfoResponse response = mgmtPerCustInfoApplicationService.MgmtPerCustInfo(request);
        return response;
    }

    /**
     * 对私客户信息维护
     * 
     * @param object
     * @return
     */
    @Override
    public MgmtPerCustInfoMgmtPerCustInfoResponse MgmtPerCustInfo(Object object) {
        MgmtPerCustInfoMgmtPerCustInfoRequest request = CommonUtil.transJSONObject(object, MgmtPerCustInfoMgmtPerCustInfoRequest.class);
        MgmtPerCustInfoApiService mgmtpercustinfoapiservice = SpringUtil.getBean(MgmtPerCustInfoApiService.class);
        MgmtPerCustInfoMgmtPerCustInfoResponse response = mgmtpercustinfoapiservice.MgmtPerCustInfo(request);
        return response;
    }
}
