package com.mcore.hsbc.ecif.infrastructure.convert;

import com.mcore.hsbc.ecif.domain.aggregate.bom1967754384486551553.entity.CustAcctInfo;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po.CustAcctInfoPO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CustAcctInfoPOConvert {
    CustAcctInfoPOConvert INSTANCE = Mappers.getMapper(CustAcctInfoPOConvert.class);

    /**
     * custAcctInfo转po
     *
     * @param custAcctInfo
     * @return
     */
    CustAcctInfoPO covertToPO(CustAcctInfo custAcctInfo);

    /**
     * custAcctInfo转po  List
     *
     * @param custAcctInfoList
     * @return
     */
    List<CustAcctInfoPO> covertToPO(List<CustAcctInfo> custAcctInfoList);

    CustAcctInfo covertToCustAcctInfo(CustAcctInfoPO custAcctInfoPO);

    List<CustAcctInfo> covertToCustAcctInfo(List<CustAcctInfoPO> custAcctInfoPOS);
}
