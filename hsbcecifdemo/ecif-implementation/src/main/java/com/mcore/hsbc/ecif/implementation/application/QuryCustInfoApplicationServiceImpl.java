package com.mcore.hsbc.ecif.implementation.application;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import com.mcore.hsbc.ecif.api.service.request.QuryCustInfoQuryCustInfoRequest;
import com.mcore.hsbc.ecif.api.service.response.QuryCustInfoQuryCustInfoResponse;
import com.mcore.hsbc.ecif.application.service.QuryCustInfoApplicationService;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.mapper.CustomerBasicInfoMapper;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.mapper.CustomerRiskLevelInfoMapper;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po.CustomerBasicInfoPO;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po.CustomerRiskLevelInfoPO;
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
 * <br>    程序功能：客户基本信息查询
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class QuryCustInfoApplicationServiceImpl
    implements QuryCustInfoApplicationService
{

    @Resource
    private CustomerBasicInfoMapper customerBasicInfoMapper;

    @Resource
    private CustomerRiskLevelInfoMapper customerRiskLevelInfoMapper;

    /**
     * 客户基本信息查询
     * 
     * @param request
     * @return
     */
    @Override
    public QuryCustInfoQuryCustInfoResponse QuryCustInfo(QuryCustInfoQuryCustInfoRequest request) {
        QuryCustInfoQuryCustInfoResponse response = new QuryCustInfoQuryCustInfoResponse();

        String custNo = request.getCustNo();
        String custNm = request.getCustNm();
        String crtfNo = request.getCrtfNo();
        String crtfTypCd = request.getCrtfTypCd();

        //1、报文头客户号为空时，检查是否录入证件类型，未录入报错阻断：证件类型输入为空
        if (StrUtil.isBlank(custNo) && StrUtil.isBlank(crtfTypCd)) {
            throw new CustBizException(ErrorCodeEnum.F20004);
        }
        //2、报文头客户号为空时，检查是否录入证件号码，未录入报错阻断：证件号码输入为空
        if (StrUtil.isBlank(custNo) && StrUtil.isBlank(crtfNo)) {
            throw new CustBizException(ErrorCodeEnum.F20005);
        }

        List<CustomerBasicInfoPO> customerBasicInfoList = customerBasicInfoMapper.selectByConditions(custNo, custNm, crtfNo, crtfTypCd);
        if (CollUtil.isEmpty(customerBasicInfoList)) {
            throw new CustBizException(ErrorCodeEnum.F20000);
        }

        CustomerBasicInfoPO customerBasicInfoPO = CollUtil.getFirst(customerBasicInfoList);
        CustomerRiskLevelInfoPO customerRiskLevelInfoPO = customerRiskLevelInfoMapper.selectByCustNoAndType(customerBasicInfoPO.getCustNo(), customerBasicInfoPO.getCustTypCd());

        BeanUtil.copyProperties(customerBasicInfoPO, response);
        BeanUtil.copyProperties(customerRiskLevelInfoPO, response);
        return response;
    }
}
