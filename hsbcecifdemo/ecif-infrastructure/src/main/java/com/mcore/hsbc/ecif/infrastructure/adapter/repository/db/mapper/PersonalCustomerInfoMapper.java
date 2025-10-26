package com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.mapper;


import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po.PersonalCustomerInfoPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PersonalCustomerInfoMapper {

  /**
   * 根据客户编号查询
   * @param custNo 客户编号
   * @return 客户基本信息
   */
  List<PersonalCustomerInfoPO> selectByCustNo(@Param("custNo") String custNo);

  /**
   * 更新客户基本信息
   * @param entity 客户基本信息
   * @return 影响行数
   */
  int update(PersonalCustomerInfoPO entity);


  /**
   * 插入个人客户信息
   * @param personalCustomerInfo 个人客户信息实体
   * @return 插入的行数
   */
  int insert(PersonalCustomerInfoPO personalCustomerInfo);

}