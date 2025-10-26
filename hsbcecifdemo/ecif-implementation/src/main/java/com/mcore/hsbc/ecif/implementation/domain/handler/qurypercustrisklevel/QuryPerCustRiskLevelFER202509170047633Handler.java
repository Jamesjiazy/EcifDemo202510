package com.mcore.hsbc.ecif.implementation.domain.handler.qurypercustrisklevel;

import org.springframework.beans.factory.annotation.Autowired;
import com.mcore.plugin.tranflow.mflow.node.BaseHandler;
import com.mcore.base.intf.tranflow.ProcessHandler;
import com.mcore.hsbc.ecif.domain.service.qurypercustrisklevel.input.QuryPerCustRiskLevelFER202509170047633ExecuteInputDTO;
import com.mcore.hsbc.ecif.domain.service.qurypercustrisklevel.QuryPerCustRiskLevelFER202509170047633Service;

/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号：head
 * <br>    创建者：zj_zengq
 * <br>    创建日期：2025-09-19 14:45:52
 * <br>    程序功能：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：根据客户号（报文头获取）查询客户风险等级信息，获取客户关注程度代码（01-新客户02-低风险客户03-关注04-重点关注05-黑名单）、评定日期、评定依据说明等信息
 * <br>    设计说明：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 *
 */

public class QuryPerCustRiskLevelFER202509170047633Handler extends BaseHandler implements ProcessHandler {

    @Autowired
    private QuryPerCustRiskLevelFER202509170047633Service quryPerCustRiskLevelFER202509170047633Service;

    /**
     * process
     * 方法描述：根据客户号（报文头获取）查询客户风险等级信息，获取客户关注程度代码（01-新客户02-低风险客户03-关注04-重点关注05-黑名单）、评定日期、评定依据说明等信息
     *
     * @param entry
     * @param data
     * @param e
     * @return
     */
    @Override
    public Object process(String entry, Object data, Throwable e) {
        QuryPerCustRiskLevelFER202509170047633ExecuteInputDTO request = (QuryPerCustRiskLevelFER202509170047633ExecuteInputDTO)data;
        return quryPerCustRiskLevelFER202509170047633Service.execute(request);
    }
}