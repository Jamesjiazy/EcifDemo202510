package com.mcore.hsbc.ecif.implementation.api.service;

import cn.hutool.extra.spring.SpringUtil;
import com.mcore.hsbc.ecif.api.service.ConsolidationCustApiService;
import com.mcore.hsbc.ecif.api.service.request.ConsolidationCustExecuteRequest;
import com.mcore.hsbc.ecif.api.service.response.ConsolidationCustExecuteResponse;
import com.mcore.hsbc.ecif.application.service.ConsolidationCustApplicationService;
import com.mcore.hsbc.ecif.infrastructure.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：客户归并
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class ConsolidationCustApiServiceImpl
    implements ConsolidationCustApiService
{
    @Autowired
    private ConsolidationCustApplicationService consolidationCustApplicationService;

    /**
     * 客户归并
     * 
     * @param request
     * @return
     */
    @Override
    public ConsolidationCustExecuteResponse execute(ConsolidationCustExecuteRequest request) {
        ConsolidationCustExecuteResponse response = consolidationCustApplicationService.execute(request);
        return response;
    }

    /**
     * 客户归并
     * 
     * @param object
     * @return
     */
    @Override
    public ConsolidationCustExecuteResponse execute(Object object) {
        ConsolidationCustExecuteRequest request = CommonUtil.transJSONObject(object, ConsolidationCustExecuteRequest.class);
        ConsolidationCustApiService consolidationcustapiservice = SpringUtil.getBean(ConsolidationCustApiService.class);
        ConsolidationCustExecuteResponse response = consolidationcustapiservice.execute(request);
        return response;
    }
}
