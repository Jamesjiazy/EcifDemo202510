package com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.mapper;

import java.util.List;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po.ThsbcecifCustinfoPO;

import org.apache.ibatis.annotations.Param;
/**
 * @description: THSBCECIF_CustInfo表对应的mapper类
 */
public interface ThsbcecifCustinfoMapper {

  /**
  *新增
  * @param thsbcecifCustinfoPO
  * @return
  */
  
  public int insert(ThsbcecifCustinfoPO  thsbcecifCustinfoPO);
  /**
  *新增
  * @param thsbcecifCustinfoPO
  * @return
  */
  
  public int insertSelective(ThsbcecifCustinfoPO  thsbcecifCustinfoPO);
  /**
  *批量新增
  * @param list
  * @return
  */
  
  public int batchInsert(List<ThsbcecifCustinfoPO>  list);
  /**
  *修改
  * @param updateThsbcecifCustinfoPO
  * @param whereThsbcecifCustinfoPO
  * @return
  */
  
  public int update(@Param("updateThsbcecifCustinfoPO") ThsbcecifCustinfoPO  updateThsbcecifCustinfoPO,@Param("whereThsbcecifCustinfoPO") ThsbcecifCustinfoPO  whereThsbcecifCustinfoPO);

  /**
  *删除
  * @param thsbcecifCustinfoPO
  * @return
  */
  
  public int delete(ThsbcecifCustinfoPO  thsbcecifCustinfoPO);
  /**
  *获取条数
  * @param thsbcecifCustinfoPO
  * @return
  */
  
  public int count(ThsbcecifCustinfoPO  thsbcecifCustinfoPO);

  /**
  *查询单条
  * @param thsbcecifCustinfoPO
  * @return
  */
  
  public ThsbcecifCustinfoPO selectOne(ThsbcecifCustinfoPO  thsbcecifCustinfoPO);
  /**
  *查询集合
  * @param thsbcecifCustinfoPO
  * @return
  */
  
  public List<ThsbcecifCustinfoPO> selectList(ThsbcecifCustinfoPO  thsbcecifCustinfoPO);
  /**
  *查询用于更新
  * @param thsbcecifCustinfoPO
  * @return
  */
  
  public ThsbcecifCustinfoPO selectForUpdate(ThsbcecifCustinfoPO  thsbcecifCustinfoPO);

}