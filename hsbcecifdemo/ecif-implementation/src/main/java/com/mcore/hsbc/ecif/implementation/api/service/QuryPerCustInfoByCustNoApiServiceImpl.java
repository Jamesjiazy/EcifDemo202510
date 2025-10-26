package com.mcore.hsbc.ecif.implementation.api.service;

import cn.hutool.extra.spring.SpringUtil;
import com.mcore.hsbc.ecif.api.service.QuryPerCustInfoByCustNoApiService;
import com.mcore.hsbc.ecif.api.service.request.QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoRequest;
import com.mcore.hsbc.ecif.api.service.response.QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoResponse;
import com.mcore.hsbc.ecif.application.service.QuryPerCustInfoByCustNoApplicationService;
import com.mcore.hsbc.ecif.infrastructure.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：根据客户编号查询个人客户信息
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class QuryPerCustInfoByCustNoApiServiceImpl
    implements QuryPerCustInfoByCustNoApiService
{
    @Autowired
    private QuryPerCustInfoByCustNoApplicationService quryPerCustInfoByCustNoApplicationService;

    /**
     * 根据客户编号查询个人客户信息
     * 
     * @param request
     * @return
     */
    @Override
    public QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoResponse QuryPerCustInfoByCustNo(QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoRequest request) {
        QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoResponse response = quryPerCustInfoByCustNoApplicationService.QuryPerCustInfoByCustNo(request);
        return response;
    }

    /**
     * 根据客户编号查询个人客户信息
     * 
     * @param object
     * @return
     */
    @Override
    public QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoResponse QuryPerCustInfoByCustNo(Object object) {
        QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoRequest request = CommonUtil.transJSONObject(object, QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoRequest.class);
        QuryPerCustInfoByCustNoApiService qurypercustinfobycustnoapiservice = SpringUtil.getBean(QuryPerCustInfoByCustNoApiService.class);
        QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoResponse response = qurypercustinfobycustnoapiservice.QuryPerCustInfoByCustNo(request);
        return response;
    }
}
