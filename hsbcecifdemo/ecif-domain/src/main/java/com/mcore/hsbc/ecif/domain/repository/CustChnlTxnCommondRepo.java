package com.mcore.hsbc.ecif.domain.repository;

import com.mcore.hsbc.ecif.domain.aggregate.bom1967754384486551553.entity.CustChnlTxnCommondInfo;

import java.util.List;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号：head
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:51
 * <br>    程序功能：客户信息-领域资源接口类
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * <br>    关联的表：THSBCECIF_CustInfo
 */
public interface CustChnlTxnCommondRepo {
    List<CustChnlTxnCommondInfo> queryByCustNo(CustChnlTxnCommondInfo custAcctInfo);
}
