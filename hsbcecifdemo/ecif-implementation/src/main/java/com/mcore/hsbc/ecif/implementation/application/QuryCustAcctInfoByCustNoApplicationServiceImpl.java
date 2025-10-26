package com.mcore.hsbc.ecif.implementation.application;

import com.mcore.hsbc.ecif.api.service.request.QuryCustAcctInfoByCustNoExecuteRequest;
import com.mcore.hsbc.ecif.api.service.response.QuryCustAcctInfoByCustNoExecuteResponse;
import com.mcore.hsbc.ecif.application.service.QuryCustAcctInfoByCustNoApplicationService;
import com.mcore.hsbc.ecif.domain.service.qurycustacctinfobycustno.QuryCustAcctInfoByCustNoDomainService;
import com.mcore.hsbc.ecif.domain.service.qurycustacctinfobycustno.input.QuryCustAcctInfoByCustNoInputDTO;
import com.mcore.hsbc.ecif.domain.service.qurycustacctinfobycustno.output.QuryCustAcctInfoByCustNoOutputDTO;
import com.mcore.hsbc.ecif.implementation.convert.CustAcctInfoConvert;
import com.mcore.hsbc.ecif.infrastructure.util.CheckParaUtil;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：通过客户号查询客户账户路由信息
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 */
public class QuryCustAcctInfoByCustNoApplicationServiceImpl
        implements QuryCustAcctInfoByCustNoApplicationService {

    private final QuryCustAcctInfoByCustNoDomainService quryCustAcctInfoByCustNoDomainService;

    public QuryCustAcctInfoByCustNoApplicationServiceImpl(QuryCustAcctInfoByCustNoDomainService quryCustAcctInfoByCustNoDomainService) {
        this.quryCustAcctInfoByCustNoDomainService = quryCustAcctInfoByCustNoDomainService;
    }

    /**
     * 通过客户号查询客户账户路由信息
     * 根据客户编号、路由类型、状态查询客户账户路由信息
     *
     * @param request
     * @return
     */
    @Override
    public QuryCustAcctInfoByCustNoExecuteResponse execute(QuryCustAcctInfoByCustNoExecuteRequest request) {
        CheckParaUtil.checkInputForEmpty(request.getTenantNo(), "租户号");
        CheckParaUtil.checkInputForEmpty(request.getCustNo(), "客户号");
        CheckParaUtil.checkInputForEmpty(request.getRouteTypCd(), "路由值类型");
        QuryCustAcctInfoByCustNoInputDTO inputDTO = CustAcctInfoConvert.INSTANCE.covertInputDto(request);
        QuryCustAcctInfoByCustNoOutputDTO outputDTO = quryCustAcctInfoByCustNoDomainService.execute(inputDTO);
        return CustAcctInfoConvert.INSTANCE.covertInputDto(outputDTO);
    }
}
