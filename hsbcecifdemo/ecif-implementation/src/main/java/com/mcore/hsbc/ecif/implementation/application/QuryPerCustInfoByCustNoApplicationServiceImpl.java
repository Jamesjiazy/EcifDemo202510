package com.mcore.hsbc.ecif.implementation.application;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollUtil;
import com.mcore.hsbc.ecif.api.service.request.QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoRequest;
import com.mcore.hsbc.ecif.api.service.response.QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoResponse;
import com.mcore.hsbc.ecif.application.service.QuryPerCustInfoByCustNoApplicationService;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.mapper.CustomerBasicInfoMapper;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.mapper.PersonalCustomerInfoMapper;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po.CustomerBasicInfoPO;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po.PersonalCustomerInfoPO;
import com.mcore.hsbc.ecif.infrastructure.enums.ErrorCodeEnum;
import com.mcore.hsbc.ecif.infrastructure.exception.CustBizException;
import com.mcore.hsbc.ecif.infrastructure.util.CheckParaUtil;

import javax.annotation.Resource;
import java.util.List;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：根据客户编号查询个人客户信息
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class QuryPerCustInfoByCustNoApplicationServiceImpl
    implements QuryPerCustInfoByCustNoApplicationService
{

    @Resource
    private CustomerBasicInfoMapper customerBasicInfoMapper;

    @Resource
    private PersonalCustomerInfoMapper personalCustomerInfoMapper;

    /**
     * 根据客户编号查询个人客户信息
     * 
     * @param request
     * @return
     */
    @Override
    public QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoResponse QuryPerCustInfoByCustNo(QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoRequest request) {
        QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoResponse response = new QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoResponse();

        String custNo = request.getCustNo();
        CheckParaUtil.checkInputForEmpty(custNo, "客户编号");

        List<CustomerBasicInfoPO> customerBasicInfoList = customerBasicInfoMapper.selectByCustNo(custNo);
        if (CollUtil.isEmpty(customerBasicInfoList)) {
            throw new CustBizException(ErrorCodeEnum.F20000);
        }
        List<PersonalCustomerInfoPO> personalCustomerInfoPOList = personalCustomerInfoMapper.selectByCustNo(custNo);
        if (CollUtil.isEmpty(personalCustomerInfoPOList)) {
            throw new CustBizException(ErrorCodeEnum.F20001);
        }

        CustomerBasicInfoPO customerBasicInfoPO = CollUtil.getFirst(customerBasicInfoList);
        PersonalCustomerInfoPO personalCustomerInfoPO = CollUtil.getFirst(personalCustomerInfoPOList);

        BeanUtil.copyProperties(customerBasicInfoPO, response);
        BeanUtil.copyProperties(personalCustomerInfoPO, response);

        return response;
    }
}
