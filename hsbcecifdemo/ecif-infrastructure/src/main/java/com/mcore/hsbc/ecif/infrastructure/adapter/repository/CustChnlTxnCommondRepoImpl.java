package com.mcore.hsbc.ecif.infrastructure.adapter.repository;

import com.mcore.hsbc.ecif.domain.aggregate.bom1967754384486551553.entity.CustChnlTxnCommondInfo;
import com.mcore.hsbc.ecif.domain.repository.CustChnlTxnCommondRepo;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.mapper.CustChnlTxnCommondMapper;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po.CustChnlTxnCommondPO;
import com.mcore.hsbc.ecif.infrastructure.convert.CustChnlTxnCommondPOConvert;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号：head
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：渠道交易控制信息-领域资源接口实现类
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * <br>    关联的表：customer_channel_txn_control_info
 */
@Service
public class CustChnlTxnCommondRepoImpl
        implements CustChnlTxnCommondRepo {

    @Resource
    private CustChnlTxnCommondMapper custChnlTxnCommondMapper;

    @Override
    public List<CustChnlTxnCommondInfo> queryByCustNo(CustChnlTxnCommondInfo custChnlTxnCommondInfo) {
        CustChnlTxnCommondPO custChnlTxnCommondPO = CustChnlTxnCommondPOConvert.INSTANCE.covertToPO(custChnlTxnCommondInfo);
        List<CustChnlTxnCommondPO> custAcctInfoPOS = custChnlTxnCommondMapper.queryByCustNo(custChnlTxnCommondPO);
        return CustChnlTxnCommondPOConvert.INSTANCE.covertToInfoList(custAcctInfoPOS);
    }

}
