package com.mcore.hsbc.ecif.implementation.application;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import com.mcore.hsbc.ecif.api.service.request.CrtPerCustInfoCrtPerCustInfoRequest;
import com.mcore.hsbc.ecif.api.service.response.CrtPerCustInfoCrtPerCustInfoResponse;
import com.mcore.hsbc.ecif.application.service.CrtPerCustInfoApplicationService;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.mapper.CustomerBasicInfoMapper;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.mapper.PersonalCustomerInfoMapper;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po.CustomerBasicInfoPO;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po.PersonalCustomerInfoPO;
import com.mcore.hsbc.ecif.infrastructure.enums.ErrorCodeEnum;
import com.mcore.hsbc.ecif.infrastructure.exception.CustBizException;
import com.mcore.hsbc.ecif.infrastructure.util.CheckParaUtil;
import com.mcore.hsbc.ecif.infrastructure.util.CommonUtil;
import com.mcore.hsbc.ecif.infrastructure.util.CustomerNoUtil;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：对私客户信息开立
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class CrtPerCustInfoApplicationServiceImpl
    implements CrtPerCustInfoApplicationService
{

    @Resource
    private CustomerBasicInfoMapper customerBasicInfoMapper;

    @Resource
    private PersonalCustomerInfoMapper personalCustomerInfoMapper;

    /**
     * 对私客户信息开立
     * 
     * @param request
     * @return
     */
    @Override
    public CrtPerCustInfoCrtPerCustInfoResponse CrtPerCustInfo(CrtPerCustInfoCrtPerCustInfoRequest request) {
        CrtPerCustInfoCrtPerCustInfoResponse response = new CrtPerCustInfoCrtPerCustInfoResponse();

        CheckParaUtil.checkInputForEmpty(request.getCrtfTypCd(),"证件类型代码");
        CheckParaUtil.checkInputForEmpty(request.getCrtfNo(),"证件号码");
        CheckParaUtil.checkInputForEmpty(request.getCustNm(),"客户名称");
        CheckParaUtil.checkInputForEmpty(request.getGenderCd(),"性别代码");
        CheckParaUtil.checkInputForEmpty(request.getStateAndRgnCd(),"国家和地区代码");
        CheckParaUtil.checkInputForEmpty(request.getCrtfGrantDt(),"证件发放日期");
        CheckParaUtil.checkInputForEmpty(request.getCrtfMatrDt(),"证件到期日期");
        CheckParaUtil.checkInputForEmpty(request.getCareerTypCd(),"职业类型代码");
        CheckParaUtil.checkInputForEmpty(request.getAddr(),"地址");
        CheckParaUtil.checkInputForEmpty(request.getRsvdMobileNo(),"预留手机号码");

        List<CustomerBasicInfoPO> customerBasicInfoPOList = customerBasicInfoMapper.selectByCertInfo(request.getCrtfTypCd(), request.getCrtfTypCd());
        if (CollUtil.isNotEmpty(customerBasicInfoPOList)) {
            throw new CustBizException(ErrorCodeEnum.F20006);
        }

        CustomerBasicInfoPO customerBasicInfoPO = new CustomerBasicInfoPO();
        PersonalCustomerInfoPO personalCustomerInfoPO = new PersonalCustomerInfoPO();
        BeanUtil.copyProperties(request, customerBasicInfoPO);
        BeanUtil.copyProperties(request, personalCustomerInfoPO);

        setDefaultValuesForCustomerBasicInfo(customerBasicInfoPO);
        setDefaultValuesForPersonalCustomerInfo(personalCustomerInfoPO);

        personalCustomerInfoPO.setCustNo(customerBasicInfoPO.getCustNo());

        customerBasicInfoMapper.insert(customerBasicInfoPO);
        personalCustomerInfoMapper.insert(personalCustomerInfoPO);

        //针对返回这两个字段，设置到request里才会生效；也许是原架构的思路
        request.setTenantNo(customerBasicInfoPO.getTenantNo());
        request.setCustNo(customerBasicInfoPO.getCustNo());

        return response;
    }

    /**
     * 设置客户基本信息默认值
     * @param entity 客户基本信息对象
     */
    private void setDefaultValuesForCustomerBasicInfo(CustomerBasicInfoPO entity) {
        if (entity == null) {
            return;
        }

        // 租户编号（必填）
        if (StrUtil.isBlank(entity.getTenantNo())) {
            entity.setTenantNo("001");
        }

        // 客户编号（必填）
        if (StrUtil.isBlank(entity.getCustNo())) {
            entity.setCustNo(CustomerNoUtil.getInstance().generateCustomerNo());
        }

        // 客户级别代码
        if (StrUtil.isBlank(entity.getCustTypCd())) {
            entity.setCustLvlCd("1");
        }

        // 客户类型代码
        if (StrUtil.isBlank(entity.getCustTypCd())) {
            entity.setCustTypCd("0");
        }

        // 默认有效标志 = "1"
        if (StrUtil.isBlank(entity.getValidFlg())) {
            entity.setValidFlg("1");
        }

        // 如果创建时间为空，设置为当前时间
        if (entity.getCrtTm() == null) {
            entity.setCrtTm(LocalDateTime.now());
        }

        // 如果更新时间为空，设置为当前时间
        if (entity.getUpdTm() == null) {
            entity.setUpdTm(LocalDateTime.now());
        }
    }

    /**
     * 设置客户基本信息默认值
     * @param entity 客户基本信息对象
     */
    private void setDefaultValuesForPersonalCustomerInfo(PersonalCustomerInfoPO entity) {
        if (entity == null) {
            return;
        }

        // 租户编号（必填）
        if (StrUtil.isBlank(entity.getTenantNo())) {
            entity.setTenantNo("001");
        }

        // 默认有效标志 = "1"
        if (StrUtil.isBlank(entity.getValidFlg())) {
            entity.setValidFlg("1");
        }

        // 如果创建时间为空，设置为当前时间
        if (entity.getCrtTm() == null) {
            entity.setCrtTm(LocalDateTime.now());
        }

        // 如果更新时间为空，设置为当前时间
        if (entity.getUpdTm() == null) {
            entity.setUpdTm(LocalDateTime.now());
        }
    }

}
