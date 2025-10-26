package com.mcore.hsbc.ecif.api.service;

import com.mcore.hsbc.ecif.api.service.request.MgmtPerCustInfoMgmtPerCustInfoRequest;
import com.mcore.hsbc.ecif.api.service.response.MgmtPerCustInfoMgmtPerCustInfoResponse;


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
public interface MgmtPerCustInfoApiService {

    /**
     * 对私客户信息维护
     * 
     * @param request
     * @return
     */
    MgmtPerCustInfoMgmtPerCustInfoResponse MgmtPerCustInfo(MgmtPerCustInfoMgmtPerCustInfoRequest request);

    /**
     * 对私客户信息维护
     * 
     * @param object
     * @return
     */
    MgmtPerCustInfoMgmtPerCustInfoResponse MgmtPerCustInfo(Object object);
}
