package com.mcore.hsbc.ecif.implementation.application;

import cn.hutool.core.collection.CollUtil;
import com.mcore.hsbc.ecif.api.service.request.QuryOvsCashWithdrReCtrFlgQuryOvsCashWithdrReCtrFlgRequest;
import com.mcore.hsbc.ecif.api.service.response.QuryOvsCashWithdrReCtrFlgQuryOvsCashWithdrReCtrFlgResponse;
import com.mcore.hsbc.ecif.application.service.QuryOvsCashWithdrReCtrFlgApplicationService;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.mapper.CustomerBasicInfoMapper;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.mapper.OvsCashWithdrBlkInfoMapper;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po.CustomerBasicInfoPO;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po.OvsCashWithdrBlkInfoPO;
import com.mcore.hsbc.ecif.infrastructure.enums.ErrorCodeEnum;
import com.mcore.hsbc.ecif.infrastructure.exception.CustBizException;

import javax.annotation.Resource;
import java.util.List;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：查询境外取现控制标志
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class QuryOvsCashWithdrReCtrFlgApplicationServiceImpl
    implements QuryOvsCashWithdrReCtrFlgApplicationService
{

    @Resource
    private OvsCashWithdrBlkInfoMapper ovsCashWithdrBlkInfoMapper;

    @Resource
    private CustomerBasicInfoMapper customerBasicInfoMapper;

    /**
     * 查询境外取现控制标志
     * 
     * @param request
     * @return
     */
    @Override
    public QuryOvsCashWithdrReCtrFlgQuryOvsCashWithdrReCtrFlgResponse QuryOvsCashWithdrReCtrFlg(QuryOvsCashWithdrReCtrFlgQuryOvsCashWithdrReCtrFlgRequest request) {
        QuryOvsCashWithdrReCtrFlgQuryOvsCashWithdrReCtrFlgResponse response = new QuryOvsCashWithdrReCtrFlgQuryOvsCashWithdrReCtrFlgResponse();

        String custNo = request.getCustNo();
        List<CustomerBasicInfoPO> customerBasicInfoList = customerBasicInfoMapper.selectByCustNo(custNo);
        if (CollUtil.isEmpty(customerBasicInfoList)) {
            throw new CustBizException(ErrorCodeEnum.F20000);
        }
        CustomerBasicInfoPO customerBasicInfoPO = CollUtil.getFirst(customerBasicInfoList);
        List<OvsCashWithdrBlkInfoPO> ovsCashWithdrBlkInfoList = ovsCashWithdrBlkInfoMapper.selectByCrtfInfo(customerBasicInfoPO.getCrtfNo(),customerBasicInfoPO.getCrtfTypCd());
        if (CollUtil.isNotEmpty(ovsCashWithdrBlkInfoList)) {
            response.setBlklistCustFlg("0");
        } else {
            response.setBlklistCustFlg("N");
        }
        return response;
    }
}
