package com.mcore.hsbc.ecif.implementation.api.service;

import cn.hutool.extra.spring.SpringUtil;
import com.mcore.hsbc.ecif.api.service.QuryPerCustRiskLevelApiService;
import com.mcore.hsbc.ecif.api.service.request.QuryPerCustRiskLevelQuryPerCustRiskLevelRequest;
import com.mcore.hsbc.ecif.api.service.response.QuryPerCustRiskLevelQuryPerCustRiskLevelResponse;
import com.mcore.hsbc.ecif.application.service.QuryPerCustRiskLevelApplicationService;
import com.mcore.hsbc.ecif.infrastructure.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：对私客户风险等级信息查询
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class QuryPerCustRiskLevelApiServiceImpl
    implements QuryPerCustRiskLevelApiService
{
    @Autowired
    private QuryPerCustRiskLevelApplicationService quryPerCustRiskLevelApplicationService;

    /**
     * 对私客户风险等级信息查询
     * 
     * @param request
     * @return
     */
    @Override
    public QuryPerCustRiskLevelQuryPerCustRiskLevelResponse QuryPerCustRiskLevel(QuryPerCustRiskLevelQuryPerCustRiskLevelRequest request) {
        QuryPerCustRiskLevelQuryPerCustRiskLevelResponse response = quryPerCustRiskLevelApplicationService.QuryPerCustRiskLevel(request);
        return response;
    }

    /**
     * 对私客户风险等级信息查询
     * 
     * @param object
     * @return
     */
    @Override
    public QuryPerCustRiskLevelQuryPerCustRiskLevelResponse QuryPerCustRiskLevel(Object object) {
        QuryPerCustRiskLevelQuryPerCustRiskLevelRequest request = CommonUtil.transJSONObject(object, QuryPerCustRiskLevelQuryPerCustRiskLevelRequest.class);
        QuryPerCustRiskLevelApiService qurypercustrisklevelapiservice = SpringUtil.getBean(QuryPerCustRiskLevelApiService.class);
        QuryPerCustRiskLevelQuryPerCustRiskLevelResponse response = qurypercustrisklevelapiservice.QuryPerCustRiskLevel(request);
        return response;
    }
}
