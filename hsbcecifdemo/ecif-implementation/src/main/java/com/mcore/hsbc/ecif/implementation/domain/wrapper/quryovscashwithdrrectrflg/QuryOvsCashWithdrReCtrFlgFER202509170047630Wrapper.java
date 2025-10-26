package com.mcore.hsbc.ecif.implementation.domain.wrapper.quryovscashwithdrrectrflg;

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
 * <br>    功能及场景描述：根据报文头客户号，查询客户风险等级信息，获取客户境外取现控制标志，0-禁止取现，N-未控制
 * <br>    设计说明：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 *
 */

public class QuryOvsCashWithdrReCtrFlgFER202509170047630Wrapper implements WrapHandler {

    public static final Logger logger = LoggerFactory.getLogger(QuryOvsCashWithdrReCtrFlgFER202509170047630Wrapper.class);

    @Override
    public Object checkIn(String entry, Object currData) {
        return currData;
    }

    @Override
    public Object checkOut(Object nodeData, Object currData) {
        return currData;
    }
}
