package com.mcore.hsbc.ecif.domain.repository;

import com.mcore.hsbc.ecif.domain.aggregate.bom1967754384486551553.entity.CustAcctInfo;

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
public interface CustAcctInfoRepo {

    int update(CustAcctInfo input);

    int save(CustAcctInfo c);

    int delete(CustAcctInfo custAcctInfo);

    /**
     * 查询有效的客户路由信息
     */
    List<CustAcctInfo> queryValidByCustNo(CustAcctInfo po);

    /**
     * 判断有效客户号是否已存在
     */
    boolean existsValidByCustNo(CustAcctInfo custAcctInfo);

    /**
     * 根据路由值、关联序号、路由类型查询有效的客户账户路由信息
     */
    List<CustAcctInfo> queryByRouteValRelaSeqNoRouteTypCd(CustAcctInfo custAcctInfo);

    boolean existsValidByRouteVal(CustAcctInfo custAcctInfo);

    /**
     * 根据客户编号、路由类型、状态查询客户账户路由信息
     *
     * @param custAcctInfo
     * @return
     */
    List<CustAcctInfo> queryByCustNoRouteTypCdValidFlg(CustAcctInfo custAcctInfo);


    boolean existsValidByRouteValList(String tenantNo, String uid, List<String> custAcctNoList);

    void consolidation(CustAcctInfo custAcctInfo, String mergeCustNo);

    void consolidationByCustAcctNo(String tenantNo, String uid, List<String> custAcctNoList, String routeTypCd, String mergeCustNo, String operTelrNo);
}
