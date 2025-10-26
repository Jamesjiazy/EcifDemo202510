package com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.mapper;


import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po.OvsCashWithdrBlkInfoPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OvsCashWithdrBlkInfoMapper {

  List<OvsCashWithdrBlkInfoPO> selectByCrtfInfo(@Param("crtfNo") String crtfNo, @Param("crtfTypCd") String crtfTypCd);

}