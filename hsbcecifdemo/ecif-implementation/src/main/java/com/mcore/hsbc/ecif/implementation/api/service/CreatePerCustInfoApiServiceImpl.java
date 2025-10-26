package com.mcore.hsbc.ecif.implementation.api.service;

import cn.hutool.extra.spring.SpringUtil;
import com.mcore.hsbc.ecif.api.service.CreatePerCustInfoApiService;
import com.mcore.hsbc.ecif.api.service.request.CreatePerCustInfoCreatePerCustInfoRequest;
import com.mcore.hsbc.ecif.api.service.response.CreatePerCustInfoCreatePerCustInfoResponse;
import com.mcore.hsbc.ecif.application.service.CreatePerCustInfoApplicationService;
import com.mcore.hsbc.ecif.infrastructure.util.CommonUtil;
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
public class CreatePerCustInfoApiServiceImpl
    implements CreatePerCustInfoApiService
{
    @Autowired
    private CreatePerCustInfoApplicationService createPerCustInfoApplicationService;

    /**
     * 对私三要素开立客户
     * 
     * @param request
     * @return
     */
    @Override
    public CreatePerCustInfoCreatePerCustInfoResponse CreatePerCustInfo(CreatePerCustInfoCreatePerCustInfoRequest request) {
        CreatePerCustInfoCreatePerCustInfoResponse response = createPerCustInfoApplicationService.CreatePerCustInfo(request);
        return response;
    }

    /**
     * 对私三要素开立客户
     * 
     * @param object
     * @return
     */
    @Override
    public CreatePerCustInfoCreatePerCustInfoResponse CreatePerCustInfo(Object object) {
        CreatePerCustInfoCreatePerCustInfoRequest request = CommonUtil.transJSONObject(object, CreatePerCustInfoCreatePerCustInfoRequest.class);
        CreatePerCustInfoApiService createpercustinfoapiservice = SpringUtil.getBean(CreatePerCustInfoApiService.class);
        CreatePerCustInfoCreatePerCustInfoResponse response = createpercustinfoapiservice.CreatePerCustInfo(request);
        return response;
    }
}
