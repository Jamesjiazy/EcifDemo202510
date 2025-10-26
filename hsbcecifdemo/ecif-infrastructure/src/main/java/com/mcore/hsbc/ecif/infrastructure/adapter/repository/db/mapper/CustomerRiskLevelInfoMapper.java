package com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.mapper;


import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po.CustomerRiskLevelInfoPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CustomerRiskLevelInfoMapper {

  CustomerRiskLevelInfoPO selectByCustNoAndType(@Param("custNo") String custNo,
                                                @Param("custTypCd") String custTypCd);


}