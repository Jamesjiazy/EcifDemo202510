package com.mcore.hsbc.ecif.implementation.application;

import com.mcore.hsbc.ecif.api.service.request.ConsolidationCustByAcctNoExecuteRequest;
import com.mcore.hsbc.ecif.api.service.response.ConsolidationCustByAcctNoExecuteResponse;
import com.mcore.hsbc.ecif.application.service.ConsolidationCustByAcctNoApplicationService;
import com.mcore.hsbc.ecif.domain.service.consolidationcustbyacctno.ConsolidationCustByAcctNoDomainService;
import com.mcore.hsbc.ecif.implementation.convert.CustAcctInfoConvert;
import com.mcore.hsbc.ecif.infrastructure.util.CheckParaUtil;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:51
 * <br>    程序功能：客户归并-单账号
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 */
public class ConsolidationCustByAcctNoApplicationServiceImpl
        implements ConsolidationCustByAcctNoApplicationService {
    private final ConsolidationCustByAcctNoDomainService consolidationCustByAcctNoDomainService;

    public ConsolidationCustByAcctNoApplicationServiceImpl(ConsolidationCustByAcctNoDomainService consolidationCustByAcctNoDomainService) {
        this.consolidationCustByAcctNoDomainService = consolidationCustByAcctNoDomainService;
    }

    /**
     * 客户归并-单账号
     *
     * @param request
     * @return
     */
    @Override
    public ConsolidationCustByAcctNoExecuteResponse execute(ConsolidationCustByAcctNoExecuteRequest request) {
        CheckParaUtil.checkInputForEmpty(request.getCustNo(), "并入客户号");
        CheckParaUtil.checkInputForEmpty(request.getMergeCustNo(), "并出客户号");
        CheckParaUtil.checkInputForEmpty(request.getCustAcctNoList(), "归并账号集合");
        CheckParaUtil.checkInputForEmpty(request.getRouteTypCd(), "归并账号类型");

        consolidationCustByAcctNoDomainService.execute(CustAcctInfoConvert.INSTANCE.covertInputDto(request));
        return new ConsolidationCustByAcctNoExecuteResponse();
    }
}
