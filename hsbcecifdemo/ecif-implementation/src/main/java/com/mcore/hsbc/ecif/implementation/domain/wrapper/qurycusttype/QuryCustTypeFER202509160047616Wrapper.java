package com.mcore.hsbc.ecif.implementation.domain.wrapper.qurycusttype;

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
 * <br>    功能及场景描述：根据客户号查询客户基本信息，获取客户类型0-对私，1-对公，2-金融
检查：查询不到信息报错阻断：客户信息不存在
 * <br>    设计说明：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 *
 */

public class QuryCustTypeFER202509160047616Wrapper implements WrapHandler {

    public static final Logger logger = LoggerFactory.getLogger(QuryCustTypeFER202509160047616Wrapper.class);

    @Override
    public Object checkIn(String entry, Object currData) {
        return currData;
    }

    @Override
    public Object checkOut(Object nodeData, Object currData) {
        return currData;
    }
}
