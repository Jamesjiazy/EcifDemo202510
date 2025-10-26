package com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.mapper;

import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po.CustChnlTxnCommondPO;

import java.util.List;

/**
 * @description: THSBCECIF_CustInfo表对应的mapper类
 */
public interface CustChnlTxnCommondMapper {
    List<CustChnlTxnCommondPO> queryByCustNo(CustChnlTxnCommondPO custChnlTxnCommondPO);
}