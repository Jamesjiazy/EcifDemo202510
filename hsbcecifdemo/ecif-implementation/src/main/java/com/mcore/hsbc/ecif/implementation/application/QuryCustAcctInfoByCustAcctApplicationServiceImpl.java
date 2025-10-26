package com.mcore.hsbc.ecif.implementation.application;

import com.mcore.hsbc.ecif.api.service.request.QuryCustAcctInfoByCustAcctExecuteRequest;
import com.mcore.hsbc.ecif.api.service.response.QuryCustAcctInfoByCustAcctExecuteResponse;
import com.mcore.hsbc.ecif.application.service.QuryCustAcctInfoByCustAcctApplicationService;
import com.mcore.hsbc.ecif.domain.service.qurycustacctinfobycustacct.QuryCustAcctInfoByCustAcctDomainService;
import com.mcore.hsbc.ecif.domain.service.qurycustacctinfobycustacct.input.QuryCustAcctInfoByCustAcctInputDTO;
import com.mcore.hsbc.ecif.domain.service.qurycustacctinfobycustacct.output.QuryCustAcctInfoByCustAcctOutputDTO;
import com.mcore.hsbc.ecif.implementation.convert.CustAcctInfoConvert;
import com.mcore.hsbc.ecif.infrastructure.util.CheckParaUtil;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：通过账号查询客户账户路由信息
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：根据路由值、关联序号、路由类型查询客户账户路由信息。
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 */
public class QuryCustAcctInfoByCustAcctApplicationServiceImpl
        implements QuryCustAcctInfoByCustAcctApplicationService {
    private final QuryCustAcctInfoByCustAcctDomainService quryCustAcctInfoByCustAcctDomainService;

    public QuryCustAcctInfoByCustAcctApplicationServiceImpl(QuryCustAcctInfoByCustAcctDomainService quryCustAcctInfoByCustAcctDomainService) {
        this.quryCustAcctInfoByCustAcctDomainService = quryCustAcctInfoByCustAcctDomainService;
    }


    /**
     * 通过账号查询客户账户路由信息
     * 根据路由值、关联序号、路由类型查询客户账户路由信息。
     *
     * @param request
     * @return
     */
    @Override
    public QuryCustAcctInfoByCustAcctExecuteResponse execute(QuryCustAcctInfoByCustAcctExecuteRequest request) {
        CheckParaUtil.checkInputForEmpty(request.getTenantNo(), "租户号");
        CheckParaUtil.checkInputForEmpty(request.getRouteVal(), "路由值");
        CheckParaUtil.checkInputForEmpty(request.getRouteTypCd(), "路由类型");
        // 关联序号为可选值
        QuryCustAcctInfoByCustAcctInputDTO inputDTO = CustAcctInfoConvert.INSTANCE.covertInputDto(request);
        QuryCustAcctInfoByCustAcctOutputDTO outputDTO = quryCustAcctInfoByCustAcctDomainService.execute(inputDTO);
        return CustAcctInfoConvert.INSTANCE.covertOutputDto(outputDTO);
    }
}
