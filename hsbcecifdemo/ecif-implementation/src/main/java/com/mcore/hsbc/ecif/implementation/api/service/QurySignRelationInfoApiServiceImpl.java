package com.mcore.hsbc.ecif.implementation.api.service;

import cn.hutool.extra.spring.SpringUtil;
import com.mcore.hsbc.ecif.api.service.QurySignRelationInfoApiService;
import com.mcore.hsbc.ecif.api.service.request.QurySignRelationInfoExecuteRequest;
import com.mcore.hsbc.ecif.api.service.response.QurySignRelationInfoExecuteResponse;
import com.mcore.hsbc.ecif.application.service.QurySignRelationInfoApplicationService;
import com.mcore.hsbc.ecif.infrastructure.util.CommonUtil;
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
public class QurySignRelationInfoApiServiceImpl
    implements QurySignRelationInfoApiService
{
    @Autowired
    private QurySignRelationInfoApplicationService qurySignRelationInfoApplicationService;

    /**
     * 客户签约关系查询
     * 
     * @param request
     * @return
     */
    @Override
    public QurySignRelationInfoExecuteResponse execute(QurySignRelationInfoExecuteRequest request) {
        QurySignRelationInfoExecuteResponse response = qurySignRelationInfoApplicationService.QurySignRelationInfo(request);
        return response;
    }

    /**
     * 客户签约关系查询
     * 
     * @param object
     * @return
     */
    @Override
    public QurySignRelationInfoExecuteResponse execute(Object object) {
        QurySignRelationInfoExecuteRequest request = CommonUtil.transJSONObject(object, QurySignRelationInfoExecuteRequest.class);
        QurySignRelationInfoApiService qurysignrelationinfoapiservice = SpringUtil.getBean(QurySignRelationInfoApiService.class);
        QurySignRelationInfoExecuteResponse response = qurysignrelationinfoapiservice.execute(request);
        return response;
    }
}
