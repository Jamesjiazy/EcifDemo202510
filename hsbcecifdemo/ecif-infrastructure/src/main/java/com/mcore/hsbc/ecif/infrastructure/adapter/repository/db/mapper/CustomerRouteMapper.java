package com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.mapper;

import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po.CustAcctInfoPO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description: THSBCECIF_CustInfo表对应的mapper类
 */
public interface CustomerRouteMapper {
    int save(CustAcctInfoPO custAcctInfoPO);

    int update(CustAcctInfoPO custAcctInfoPO);

    int deleteByCustNo(String tenantNo, String custNo);

    int delete(CustAcctInfoPO custAcctInfoPO);

    /**
     * 查询有效的客户路由信息
     */
    List<CustAcctInfoPO> queryValidByCustNo(CustAcctInfoPO po);

    /**
     * 判断有效客户号是否已存在
     */
    boolean existsValidByCustNo(CustAcctInfoPO po);

    /**
     * 根据路由值、关联序号、路由类型查询有效的客户账户路由信息
     */
    List<CustAcctInfoPO> queryByRouteValRelaSeqNoRouteTypCd(CustAcctInfoPO po);

    /**
     * 根据客户编号、路由类型、状态查询客户账户路由信息
     *
     * @param po
     * @return
     */
    List<CustAcctInfoPO> queryByCustNoRouteTypCdValidFlg(CustAcctInfoPO po);

    boolean existsValidByRouteVal(CustAcctInfoPO custAcctInfoPO);

    boolean existsValidByRouteValList(@Param("tenantNo") String tenantNo, @Param("uid") String uid, @Param("custAcctNoList") List<String> custAcctNoList);

    int consolidation(@Param("custAcctInfoPO") CustAcctInfoPO custAcctInfoPO,
                      @Param("mergeCustNo") String mergeCustNo);

    int consolidationByCustAcctNo(@Param("tenantNo") String tenantNo,
                                  @Param("uid") String uid,
                                  @Param("custAcctNoList") List<String> custAcctNoList,
                                  @Param("routeTypCd") String routeTypCd,
                                  @Param("mergeCustNo") String mergeCustNo,
                                  @Param("operTelrNo") String operTelrNo);
}