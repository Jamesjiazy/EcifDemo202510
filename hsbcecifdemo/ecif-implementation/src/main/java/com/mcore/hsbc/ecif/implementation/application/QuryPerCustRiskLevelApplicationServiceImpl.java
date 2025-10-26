package com.mcore.hsbc.ecif.implementation.application;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollUtil;
import com.mcore.hsbc.ecif.api.service.request.QuryPerCustRiskLevelQuryPerCustRiskLevelRequest;
import com.mcore.hsbc.ecif.api.service.response.QuryPerCustRiskLevelQuryPerCustRiskLevelResponse;
import com.mcore.hsbc.ecif.application.service.QuryPerCustRiskLevelApplicationService;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.mapper.CustomerBasicInfoMapper;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.mapper.CustomerRiskLevelInfoMapper;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po.CustomerBasicInfoPO;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po.CustomerRiskLevelInfoPO;

import javax.annotation.Resource;
import java.util.List;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：对私客户风险等级信息查询
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class QuryPerCustRiskLevelApplicationServiceImpl
    implements QuryPerCustRiskLevelApplicationService
{

    @Resource
    private CustomerRiskLevelInfoMapper customerRiskLevelInfoMapper;

    @Resource
    private CustomerBasicInfoMapper customerBasicInfoMapper;

    /**
     * 对私客户风险等级信息查询
     * 
     * @param request
     * @return
     */
    @Override
    public QuryPerCustRiskLevelQuryPerCustRiskLevelResponse QuryPerCustRiskLevel(QuryPerCustRiskLevelQuryPerCustRiskLevelRequest request) {
        QuryPerCustRiskLevelQuryPerCustRiskLevelResponse response = new QuryPerCustRiskLevelQuryPerCustRiskLevelResponse();

        String custNo = request.getCustNo();
        List<CustomerBasicInfoPO> customerBasicInfoList = customerBasicInfoMapper.selectByCustNo(custNo);
        if (CollUtil.isEmpty(customerBasicInfoList)) {
            return response;
        }
        CustomerBasicInfoPO customerBasicInfoPO = CollUtil.getFirst(customerBasicInfoList);
        CustomerRiskLevelInfoPO customerRiskLevelInfoPO = customerRiskLevelInfoMapper.selectByCustNoAndType(customerBasicInfoPO.getCustNo(), customerBasicInfoPO.getCustTypCd());
        if (customerRiskLevelInfoPO == null) {
            return response;
        }
        BeanUtil.copyProperties(customerRiskLevelInfoPO, response);
        return response;
    }
}
