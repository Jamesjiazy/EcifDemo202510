package com.mcore.hsbc.ecif.implementation.application;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import com.mcore.hsbc.ecif.api.service.request.MgmtPerCustInfoMgmtPerCustInfoRequest;
import com.mcore.hsbc.ecif.api.service.response.MgmtPerCustInfoMgmtPerCustInfoResponse;
import com.mcore.hsbc.ecif.application.service.MgmtPerCustInfoApplicationService;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.mapper.CustomerBasicInfoMapper;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.mapper.PersonalCustomerInfoMapper;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.mapper.ThsbcecifCustinfoMapper;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po.CustomerBasicInfoPO;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po.PersonalCustomerInfoPO;
import com.mcore.hsbc.ecif.infrastructure.enums.ErrorCodeEnum;
import com.mcore.hsbc.ecif.infrastructure.exception.CustBizException;
import com.mcore.hsbc.ecif.infrastructure.util.CommonUtil;

import javax.annotation.Resource;
import java.util.List;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：对私客户信息维护
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class MgmtPerCustInfoApplicationServiceImpl
    implements MgmtPerCustInfoApplicationService
{

    @Resource
    private CustomerBasicInfoMapper customerBasicInfoMapper;

    @Resource
    private PersonalCustomerInfoMapper personalCustomerInfoMapper;

    /**
     * 对私客户信息维护
     * 
     * @param request
     * @return
     */
    @Override
    public MgmtPerCustInfoMgmtPerCustInfoResponse MgmtPerCustInfo(MgmtPerCustInfoMgmtPerCustInfoRequest request) {
        MgmtPerCustInfoMgmtPerCustInfoResponse response = new MgmtPerCustInfoMgmtPerCustInfoResponse();

        String custNo = request.getCustNo();
        List<CustomerBasicInfoPO> customerBasicInfoList = customerBasicInfoMapper.selectByCustNo(custNo);
        List<PersonalCustomerInfoPO> personalCustomerInfoList = personalCustomerInfoMapper.selectByCustNo(custNo);

        if (CollUtil.isEmpty(customerBasicInfoList)) {
            throw new CustBizException(ErrorCodeEnum.F20000);
        }
        if (CollUtil.isEmpty(personalCustomerInfoList)) {
            throw new CustBizException(ErrorCodeEnum.F20001);
        }
        CustomerBasicInfoPO customerBasicInfoPO = customerBasicInfoList.get(0);
        PersonalCustomerInfoPO personalCustomerInfoPO = personalCustomerInfoList.get(0);

        if (!StrUtil.equals("0",customerBasicInfoPO.getCustTypCd())) {
            throw new CustBizException(ErrorCodeEnum.F20002);
        }

        CustomerBasicInfoPO customerBasicInfoInput = new CustomerBasicInfoPO();
        BeanUtil.copyProperties(request, customerBasicInfoInput);
        boolean isSameForCust = CommonUtil.isSameByNonNullFields(customerBasicInfoPO, customerBasicInfoInput);
        if (!isSameForCust) {
            BeanUtil.copyProperties(customerBasicInfoInput, customerBasicInfoPO, CopyOptions.create().setIgnoreNullValue(true));
            customerBasicInfoMapper.update(customerBasicInfoPO);
        }

        PersonalCustomerInfoPO personalCustomerInfoInput = new PersonalCustomerInfoPO();
        BeanUtil.copyProperties(request, personalCustomerInfoInput);
        boolean isSameForPer = CommonUtil.isSameByNonNullFields(personalCustomerInfoPO, personalCustomerInfoInput);
        if (!isSameForPer) {
            BeanUtil.copyProperties(personalCustomerInfoInput, personalCustomerInfoPO, CopyOptions.create().setIgnoreNullValue(true));
            personalCustomerInfoMapper.update(personalCustomerInfoPO);
        }


        return response;
    }
}
