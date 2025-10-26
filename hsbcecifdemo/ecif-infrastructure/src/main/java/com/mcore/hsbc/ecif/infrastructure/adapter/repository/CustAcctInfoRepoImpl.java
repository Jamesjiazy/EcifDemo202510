package com.mcore.hsbc.ecif.infrastructure.adapter.repository;

import com.mcore.hsbc.ecif.domain.aggregate.bom1967754384486551553.entity.CustAcctInfo;
import com.mcore.hsbc.ecif.domain.repository.CustAcctInfoRepo;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.mapper.CustomerRouteMapper;
import com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po.CustAcctInfoPO;
import com.mcore.hsbc.ecif.infrastructure.convert.CustAcctInfoPOConvert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号：head
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：客户信息-领域资源接口实现类
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * <br>    关联的表：THSBCECIF_CustInfo
 */
public class CustAcctInfoRepoImpl
        implements CustAcctInfoRepo {
    private final static Logger logger = LoggerFactory.getLogger(CustAcctInfoRepoImpl.class);

    @Autowired
    private CustomerRouteMapper customerRouteMapper;

    @Override
    public int update(CustAcctInfo custAcctInfo) {
        return customerRouteMapper.update(CustAcctInfoPOConvert.INSTANCE.covertToPO(custAcctInfo));
    }

    @Override
    public int save(CustAcctInfo custAcctInfo) {
        return customerRouteMapper.save(CustAcctInfoPOConvert.INSTANCE.covertToPO(custAcctInfo));
    }

    @Override
    public int delete(CustAcctInfo custAcctInfo) {
        return customerRouteMapper.delete((CustAcctInfoPOConvert.INSTANCE.covertToPO(custAcctInfo)));
    }

    /**
     * 查询有效的客户路由信息
     */
    @Override
    public List<CustAcctInfo> queryValidByCustNo(CustAcctInfo custAcctInfo) {
        CustAcctInfoPO custAcctInfoPO = CustAcctInfoPOConvert.INSTANCE.covertToPO(custAcctInfo);
        List<CustAcctInfoPO> custAcctInfoPOS = customerRouteMapper.queryValidByCustNo(custAcctInfoPO);
        return CustAcctInfoPOConvert.INSTANCE.covertToCustAcctInfo(custAcctInfoPOS);
    }

    /**
     * 判断有效客户号是否已存在
     */
    @Override
    public boolean existsValidByCustNo(CustAcctInfo custAcctInfo) {
        CustAcctInfoPO custAcctInfoPO = CustAcctInfoPOConvert.INSTANCE.covertToPO(custAcctInfo);
        return customerRouteMapper.existsValidByCustNo(custAcctInfoPO);
    }

    /**
     * 判断有效路由值是否已存在
     */
    @Override
    public boolean existsValidByRouteVal(CustAcctInfo custAcctInfo) {
        CustAcctInfoPO custAcctInfoPO = CustAcctInfoPOConvert.INSTANCE.covertToPO(custAcctInfo);
        return customerRouteMapper.existsValidByRouteVal(custAcctInfoPO);
    }

    @Override
    public List<CustAcctInfo> queryByCustNoRouteTypCdValidFlg(CustAcctInfo custAcctInfo) {
        CustAcctInfoPO custAcctInfoPO = CustAcctInfoPOConvert.INSTANCE.covertToPO(custAcctInfo);
        List<CustAcctInfoPO> custAcctInfoPOS = customerRouteMapper.queryByCustNoRouteTypCdValidFlg(custAcctInfoPO);
        return CustAcctInfoPOConvert.INSTANCE.covertToCustAcctInfo(custAcctInfoPOS);
    }

    @Override
    public List<CustAcctInfo> queryByRouteValRelaSeqNoRouteTypCd(CustAcctInfo custAcctInfo) {
        CustAcctInfoPO custAcctInfoPO = CustAcctInfoPOConvert.INSTANCE.covertToPO(custAcctInfo);
        List<CustAcctInfoPO> custAcctInfoPOS = customerRouteMapper.queryByRouteValRelaSeqNoRouteTypCd(custAcctInfoPO);
        return CustAcctInfoPOConvert.INSTANCE.covertToCustAcctInfo(custAcctInfoPOS);
    }

    @Override
    public boolean existsValidByRouteValList(String tenantNo, String uid, List<String> custAcctNoList) {
        return customerRouteMapper.existsValidByRouteValList(tenantNo, uid, custAcctNoList);
    }

    @Override
    public void consolidation(CustAcctInfo custAcctInfo, String mergeCustNo) {
        CustAcctInfoPO custAcctInfoPO = CustAcctInfoPOConvert.INSTANCE.covertToPO(custAcctInfo);
        int count = customerRouteMapper.consolidation(custAcctInfoPO, mergeCustNo);
        logger.info("并出客户：{}并入客户：{}数据：{}条", custAcctInfo.getCustNo(), mergeCustNo, count);
    }

    @Override
    public void consolidationByCustAcctNo(String tenantNo, String uid, List<String> custAcctNoList, String routeTypCd, String mergeCustNo, String operTelrNo) {
        int count = customerRouteMapper.consolidationByCustAcctNo(tenantNo, uid, custAcctNoList, routeTypCd, mergeCustNo, operTelrNo);
        logger.info("并出账号：{}并入客户：{}数据：{}条", custAcctNoList, mergeCustNo, count);
    }
}
