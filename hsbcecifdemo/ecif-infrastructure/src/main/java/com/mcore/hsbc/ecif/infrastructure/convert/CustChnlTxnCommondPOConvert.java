package com.mcore.hsbc.ecif.infrastructure.convert;

import com.mcore.hsbc.ecif.domain.aggregate.bom1967754384486551553.entity.CustChnlTxnCommondInfo;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po.CustChnlTxnCommondPO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CustChnlTxnCommondPOConvert {
    CustChnlTxnCommondPOConvert INSTANCE = Mappers.getMapper(CustChnlTxnCommondPOConvert.class);

    CustChnlTxnCommondPO covertToPO(CustChnlTxnCommondInfo custChnlTxnCommondInfo);

    List<CustChnlTxnCommondInfo> covertToInfoList(List<CustChnlTxnCommondPO> custChnlTxnCommondPOList);

    CustChnlTxnCommondInfo covertToInfo(CustChnlTxnCommondPO custChnlTxnCommondPO);
}
