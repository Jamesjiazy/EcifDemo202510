package com.mcore.hsbc.ecif.api.service;

import com.mcore.hsbc.ecif.api.service.request.CreatePerCustInfoCreatePerCustInfoRequest;
import com.mcore.hsbc.ecif.api.service.response.CreatePerCustInfoCreatePerCustInfoResponse;


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
public interface CreatePerCustInfoApiService {

    /**
     * 对私三要素开立客户
     * 
     * @param request
     * @return
     */
    CreatePerCustInfoCreatePerCustInfoResponse CreatePerCustInfo(CreatePerCustInfoCreatePerCustInfoRequest request);

    /**
     * 对私三要素开立客户
     * 
     * @param object
     * @return
     */
    CreatePerCustInfoCreatePerCustInfoResponse CreatePerCustInfo(Object object);
}
