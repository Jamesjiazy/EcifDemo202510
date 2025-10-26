package com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.mapper;


import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po.CustomerBasicInfoPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CustomerBasicInfoMapper {

  /**
   * 根据客户编号查询
   * @param custNo 客户编号
   * @return 客户基本信息
   */
  List<CustomerBasicInfoPO> selectByCustNo(@Param("custNo") String custNo);

  /**
   * 更新客户基本信息
   * @param entity 客户基本信息
   * @return 影响行数
   */
  int update(CustomerBasicInfoPO entity);


  /**
   * 根据条件查询客户基本信息
   * @param custNo 客户编号
   * @param custNm 客户名称
   * @param crtfNo 证件号码
   * @param crtfTypCd 证件类型代码
   * @return 符合条件的客户列表
   */
  List<CustomerBasicInfoPO> selectByConditions(@Param("custNo") String custNo,
                                               @Param("custNm") String custNm,
                                               @Param("crtfNo") String crtfNo,
                                               @Param("crtfTypCd") String crtfTypCd);


  /**
   * 插入客户基本信息
   * @param customerBasicInfo 客户基本信息对象
   * @return 插入记录数
   */
  int insert(CustomerBasicInfoPO customerBasicInfo);

  /**
   * 根据证件类型和证件号码查询客户信息
   * @param crtfTypCd 证件类型代码
   * @param crtfNo 证件号码
   * @return 客户信息列表
   */
  List<CustomerBasicInfoPO> selectByCertInfo(@Param("crtfTypCd") String crtfTypCd,
                                           @Param("crtfNo") String crtfNo);

}