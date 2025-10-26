package com.mcore.hsbc.ecif.implementation.api.service;

import cn.hutool.extra.spring.SpringUtil;
import com.mcore.hsbc.ecif.api.service.CrtPerCustInfoApiService;
import com.mcore.hsbc.ecif.api.service.request.CrtPerCustInfoCrtPerCustInfoRequest;
import com.mcore.hsbc.ecif.api.service.response.CrtPerCustInfoCrtPerCustInfoResponse;
import com.mcore.hsbc.ecif.application.service.CrtPerCustInfoApplicationService;
import com.mcore.hsbc.ecif.infrastructure.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：对私客户信息开立
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class CrtPerCustInfoApiServiceImpl
    implements CrtPerCustInfoApiService
{
    @Autowired
    private CrtPerCustInfoApplicationService crtPerCustInfoApplicationService;

    /**
     * 对私客户信息开立
     * 
     * @param request
     * @return
     */
    @Override
    public CrtPerCustInfoCrtPerCustInfoResponse CrtPerCustInfo(CrtPerCustInfoCrtPerCustInfoRequest request) {
        CrtPerCustInfoCrtPerCustInfoResponse response = crtPerCustInfoApplicationService.CrtPerCustInfo(request);
        return response;
    }

    /**
     * 对私客户信息开立
     * 
     * @param object
     * @return
     */
    @Override
    public CrtPerCustInfoCrtPerCustInfoResponse CrtPerCustInfo(Object object) {
        CrtPerCustInfoCrtPerCustInfoRequest request = CommonUtil.transJSONObject(object, CrtPerCustInfoCrtPerCustInfoRequest.class);
        CrtPerCustInfoApiService crtpercustinfoapiservice = SpringUtil.getBean(CrtPerCustInfoApiService.class);
        CrtPerCustInfoCrtPerCustInfoResponse response = crtpercustinfoapiservice.CrtPerCustInfo(request);
        return response;
    }
}
