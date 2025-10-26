package com.mcore.hsbc.ecif.api.service;

import com.mcore.hsbc.ecif.api.service.request.QuryPerCustRiskLevelQuryPerCustRiskLevelRequest;
import com.mcore.hsbc.ecif.api.service.response.QuryPerCustRiskLevelQuryPerCustRiskLevelResponse;


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
public interface QuryPerCustRiskLevelApiService {

    /**
     * 对私客户风险等级信息查询
     * 
     * @param request
     * @return
     */
    QuryPerCustRiskLevelQuryPerCustRiskLevelResponse QuryPerCustRiskLevel(QuryPerCustRiskLevelQuryPerCustRiskLevelRequest request);

    /**
     * 对私客户风险等级信息查询
     * 
     * @param object
     * @return
     */
    QuryPerCustRiskLevelQuryPerCustRiskLevelResponse QuryPerCustRiskLevel(Object object);
}
