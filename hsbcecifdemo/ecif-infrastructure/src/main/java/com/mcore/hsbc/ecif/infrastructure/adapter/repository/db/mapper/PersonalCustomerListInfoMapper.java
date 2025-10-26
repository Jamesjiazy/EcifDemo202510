package com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.mapper;


import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po.PersonalCustomerListInfoPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PersonalCustomerListInfoMapper {

  /**
   * 根据客户编号查询
   * @param custNo 客户编号
   * @return 个人客户名单信息表
   */
  List<PersonalCustomerListInfoPO> selectByCustNo(@Param("custNo") String custNo);



}