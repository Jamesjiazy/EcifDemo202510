package com.mcore.hsbc.ecif.implementation.application;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.collection.CollectionUtil;
import com.mcore.hsbc.ecif.api.service.model.NameListInfoDO;
import com.mcore.hsbc.ecif.api.service.request.QuryPerCustNameListInfoByCustNoQuryPerCustNameListInfoByCustNoRequest;
import com.mcore.hsbc.ecif.api.service.response.QuryPerCustNameListInfoByCustNoQuryPerCustNameListInfoByCustNoResponse;
import com.mcore.hsbc.ecif.application.service.QuryPerCustNameListInfoByCustNoApplicationService;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.mapper.PersonalCustomerListInfoMapper;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po.PersonalCustomerListInfoPO;
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
 * <br>    程序功能：对私客户名单信息查询
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class QuryPerCustNameListInfoByCustNoApplicationServiceImpl
    implements QuryPerCustNameListInfoByCustNoApplicationService
{

    @Resource
    private PersonalCustomerListInfoMapper personalCustomerListInfoMapper;

    /**
     * 对私客户名单信息查询
     * 
     * @param request
     * @return
     */
    @Override
    public QuryPerCustNameListInfoByCustNoQuryPerCustNameListInfoByCustNoResponse QuryPerCustNameListInfoByCustNo(QuryPerCustNameListInfoByCustNoQuryPerCustNameListInfoByCustNoRequest request) {
        QuryPerCustNameListInfoByCustNoQuryPerCustNameListInfoByCustNoResponse response = new QuryPerCustNameListInfoByCustNoQuryPerCustNameListInfoByCustNoResponse();

        String custNo = request.getCustNo();
        List<PersonalCustomerListInfoPO> personalCustomerListInfoPOList = personalCustomerListInfoMapper.selectByCustNo(custNo);
        if (CollUtil.isEmpty(personalCustomerListInfoPOList)) {
            throw new CustBizException(ErrorCodeEnum.F20003);
        }
        List<NameListInfoDO> nameListInfo = CommonUtil.copyList(personalCustomerListInfoPOList, NameListInfoDO.class);
        response.setNameListInfo(nameListInfo);
        return response;
    }
}
