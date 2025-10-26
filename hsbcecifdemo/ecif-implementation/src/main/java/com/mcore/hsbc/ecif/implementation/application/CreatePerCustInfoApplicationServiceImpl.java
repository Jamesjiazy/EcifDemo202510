package com.mcore.hsbc.ecif.implementation.application;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.IdcardUtil;
import cn.hutool.core.util.StrUtil;
import com.mcore.hsbc.ecif.api.service.request.CreatePerCustInfoCreatePerCustInfoRequest;
import com.mcore.hsbc.ecif.api.service.response.CreatePerCustInfoCreatePerCustInfoResponse;
import com.mcore.hsbc.ecif.application.service.CreatePerCustInfoApplicationService;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.mapper.CustomerBasicInfoMapper;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.mapper.PersonalCustomerInfoMapper;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po.CustomerBasicInfoPO;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po.PersonalCustomerInfoPO;
import com.mcore.hsbc.ecif.infrastructure.enums.ErrorCodeEnum;
import com.mcore.hsbc.ecif.infrastructure.exception.CustBizException;
import com.mcore.hsbc.ecif.infrastructure.util.CommonUtil;
import com.mcore.hsbc.ecif.infrastructure.util.CustomerNoUtil;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：对私三要素开立客户
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class CreatePerCustInfoApplicationServiceImpl
    implements CreatePerCustInfoApplicationService
{

    @Resource
    private CustomerBasicInfoMapper customerBasicInfoMapper;

    @Resource
    private PersonalCustomerInfoMapper personalCustomerInfoMapper;

    /**
     * 对私三要素开立客户
     * 
     * @param request
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public CreatePerCustInfoCreatePerCustInfoResponse CreatePerCustInfo(CreatePerCustInfoCreatePerCustInfoRequest request) {
        CreatePerCustInfoCreatePerCustInfoResponse response = new CreatePerCustInfoCreatePerCustInfoResponse();

        String crtfNo = request.getCrtfNo();
        String crtfTypCd = request.getCrtfTypCd();
        String custNm = request.getCustNm();
        if (StrUtil.isBlank(crtfNo)) {
            throw new CustBizException(ErrorCodeEnum.F20005);
        }
        if (StrUtil.isBlank(crtfTypCd)) {
            throw new CustBizException(ErrorCodeEnum.F20004);
        }
        if (StrUtil.isBlank(custNm)) {
            throw new CustBizException(ErrorCodeEnum.F20007);
        }

        List<CustomerBasicInfoPO> customerBasicInfoList = customerBasicInfoMapper.selectByCertInfo(crtfTypCd, crtfNo);
        if (CollUtil.isNotEmpty(customerBasicInfoList)) {

            CustomerBasicInfoPO customerBasicInfoPO = CollUtil.getFirst(customerBasicInfoList);
            if (StrUtil.equals(customerBasicInfoPO.getCustNm(), custNm)) {
                //针对返回这两个字段，设置到request里才会生效；也许是原架构的思路
                request.setTenantNo(customerBasicInfoPO.getTenantNo());
                request.setCustNo(customerBasicInfoPO.getCustNo());
                return response;
            } else {
                throw new CustBizException(ErrorCodeEnum.F20008);
            }
        }

        CustomerBasicInfoPO customerBasicInfoPO = new CustomerBasicInfoPO();
        PersonalCustomerInfoPO personalCustomerInfoPO = new PersonalCustomerInfoPO();
        BeanUtil.copyProperties(request, customerBasicInfoPO);
        BeanUtil.copyProperties(request, personalCustomerInfoPO);

        setDefaultValuesForCustomerBasicInfo(customerBasicInfoPO);
        setDefaultValuesForPersonalCustomerInfo(personalCustomerInfoPO);
        setValueByIDCard(crtfNo,personalCustomerInfoPO);

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

    /**
     * 根据身份证号设置：性别，生日
     */
    private void setValueByIDCard(String crtfNo, PersonalCustomerInfoPO personalCustomerInfoPO) {

        boolean isIDCard = IdcardUtil.isValidCard(crtfNo);
        if (!isIDCard) {
            return;
        }

        String birth = IdcardUtil.getBirth(crtfNo);
        LocalDate birthDt = LocalDate.parse(birth, DateTimeFormatter.ofPattern("yyyyMMdd"));
        personalCustomerInfoPO.setBirthDt(birthDt);

        int genderByIdCard = IdcardUtil.getGenderByIdCard(crtfNo);
        personalCustomerInfoPO.setGenderCd(String.valueOf(genderByIdCard));
    }

}
