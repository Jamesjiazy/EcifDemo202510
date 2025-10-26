package com.mcore.hsbc.ecif.implementation.domain.service.qurycustacctinfobycustno;

import com.mcore.hsbc.ecif.domain.aggregate.bom1967754384486551553.entity.CustAcctInfo;
import com.mcore.hsbc.ecif.domain.repository.CustAcctInfoRepo;
import com.mcore.hsbc.ecif.domain.service.qurycustacctinfobycustno.QuryCustAcctInfoByCustNoDomainService;
import com.mcore.hsbc.ecif.domain.service.qurycustacctinfobycustno.input.QuryCustAcctInfoByCustNoInputDTO;
import com.mcore.hsbc.ecif.domain.service.qurycustacctinfobycustno.output.QuryCustAcctInfoByCustNoOutputDTO;
import com.mcore.hsbc.ecif.implementation.convert.CustAcctInfoConvert;
import com.mcore.hsbc.ecif.implementation.domain.service.mgmtCustAcctInfo.MgmtCustAcctInfoDomainServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：查询客户路由信息
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：根据输入的客户编号、路由类型、状态查询客户账户路由信息
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 */
@Service
public class QuryCustAcctInfoByCustNoDomainServiceImpl
        implements QuryCustAcctInfoByCustNoDomainService {
    public static final Logger logger = LoggerFactory.getLogger(MgmtCustAcctInfoDomainServiceImpl.class);

    private final CustAcctInfoRepo custAcctInfoRepo;

    public QuryCustAcctInfoByCustNoDomainServiceImpl(CustAcctInfoRepo custAcctInfoRepo) {
        this.custAcctInfoRepo = custAcctInfoRepo;
    }

    /**
     * execute
     * 方法描述：根据输入的客户编号、路由类型、状态查询客户账户路由信息
     *
     * @param input
     * @return
     */
    @Override
    public QuryCustAcctInfoByCustNoOutputDTO execute(QuryCustAcctInfoByCustNoInputDTO input) {
        CustAcctInfo custAcctInfo = CustAcctInfoConvert.INSTANCE.covertInputDto(input);
        List<CustAcctInfo> custAcctInfos = custAcctInfoRepo.queryByCustNoRouteTypCdValidFlg(custAcctInfo);
        QuryCustAcctInfoByCustNoOutputDTO quryCustAcctInfoByCustNoOutputDTO = new QuryCustAcctInfoByCustNoOutputDTO();
        quryCustAcctInfoByCustNoOutputDTO.setCustAcctInfoList(custAcctInfos);
        return quryCustAcctInfoByCustNoOutputDTO;
    }
}
