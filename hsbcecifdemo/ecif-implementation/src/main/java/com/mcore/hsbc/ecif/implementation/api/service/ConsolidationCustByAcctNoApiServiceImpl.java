package com.mcore.hsbc.ecif.implementation.api.service;

import cn.hutool.extra.spring.SpringUtil;
import com.mcore.hsbc.ecif.api.service.ConsolidationCustByAcctNoApiService;
import com.mcore.hsbc.ecif.api.service.request.ConsolidationCustByAcctNoExecuteRequest;
import com.mcore.hsbc.ecif.api.service.response.ConsolidationCustByAcctNoExecuteResponse;
import com.mcore.hsbc.ecif.application.service.ConsolidationCustByAcctNoApplicationService;
import com.mcore.hsbc.ecif.infrastructure.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：客户归并-单账号
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class ConsolidationCustByAcctNoApiServiceImpl
    implements ConsolidationCustByAcctNoApiService
{
    @Autowired
    private ConsolidationCustByAcctNoApplicationService consolidationCustByAcctNoApplicationService;

    /**
     * 客户归并-单账号
     * 
     * @param request
     * @return
     */
    @Override
    public ConsolidationCustByAcctNoExecuteResponse execute(ConsolidationCustByAcctNoExecuteRequest request) {
        ConsolidationCustByAcctNoExecuteResponse response = consolidationCustByAcctNoApplicationService.execute(request);
        return response;
    }

    /**
     * 客户归并-单账号
     * 
     * @param object
     * @return
     */
    @Override
    public ConsolidationCustByAcctNoExecuteResponse execute(Object object) {
        ConsolidationCustByAcctNoExecuteRequest request = CommonUtil.transJSONObject(object, ConsolidationCustByAcctNoExecuteRequest.class);
        ConsolidationCustByAcctNoApiService consolidationcustbyacctnoapiservice = SpringUtil.getBean(ConsolidationCustByAcctNoApiService.class);
        ConsolidationCustByAcctNoExecuteResponse response = consolidationcustbyacctnoapiservice.execute(request);
        return response;
    }
}
