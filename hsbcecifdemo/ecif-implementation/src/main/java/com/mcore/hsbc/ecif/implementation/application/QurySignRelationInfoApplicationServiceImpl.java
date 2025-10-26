package com.mcore.hsbc.ecif.implementation.application;

import com.mcore.hsbc.ecif.api.service.request.QurySignRelationInfoExecuteRequest;
import com.mcore.hsbc.ecif.api.service.response.QurySignRelationInfoExecuteResponse;
import com.mcore.hsbc.ecif.application.service.QurySignRelationInfoApplicationService;
import com.mcore.hsbc.ecif.domain.service.qurysignrelationinfo.QurySignRelationInfoDomainService;
import com.mcore.hsbc.ecif.domain.service.qurysignrelationinfo.input.QurySignRelationInfoInputDTO;
import com.mcore.hsbc.ecif.domain.service.qurysignrelationinfo.output.QurySignRelationInfoOutputDTO;
import com.mcore.hsbc.ecif.implementation.convert.SignRelationInfoConvert;


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
public class QurySignRelationInfoApplicationServiceImpl
    implements QurySignRelationInfoApplicationService
{
    private final QurySignRelationInfoDomainService qurySignRelationInfoDomainService;

    public QurySignRelationInfoApplicationServiceImpl(QurySignRelationInfoDomainService qurySignRelationInfoDomainService) {
        this.qurySignRelationInfoDomainService = qurySignRelationInfoDomainService;
    }

    /**
     * 客户签约关系查询
     * 
     * @param request
     * @return
     */
    @Override
    public QurySignRelationInfoExecuteResponse QurySignRelationInfo(QurySignRelationInfoExecuteRequest request) {
        QurySignRelationInfoOutputDTO execute = qurySignRelationInfoDomainService.execute(new QurySignRelationInfoInputDTO());
        return SignRelationInfoConvert.INSTANCE.convertToResponse(execute);
    }
}
