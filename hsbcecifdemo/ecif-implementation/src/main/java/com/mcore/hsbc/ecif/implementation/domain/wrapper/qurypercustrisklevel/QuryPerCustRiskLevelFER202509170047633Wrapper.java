package com.mcore.hsbc.ecif.implementation.domain.wrapper.qurypercustrisklevel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.mcore.plugin.tranflow.mflow.node.WrapHandler;

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

public class QuryPerCustRiskLevelFER202509170047633Wrapper implements WrapHandler {

    public static final Logger logger = LoggerFactory.getLogger(QuryPerCustRiskLevelFER202509170047633Wrapper.class);

    @Override
    public Object checkIn(String entry, Object currData) {
        return currData;
    }

    @Override
    public Object checkOut(Object nodeData, Object currData) {
        return currData;
    }
}
