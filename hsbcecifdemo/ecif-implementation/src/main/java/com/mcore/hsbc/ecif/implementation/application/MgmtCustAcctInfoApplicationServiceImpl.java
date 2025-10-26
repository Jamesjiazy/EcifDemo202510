package com.mcore.hsbc.ecif.implementation.application;

import com.mcore.hsbc.ecif.api.service.request.MgmtCustAcctInfoExecuteRequest;
import com.mcore.hsbc.ecif.api.service.response.MgmtCustAcctInfoExecuteResponse;
import com.mcore.hsbc.ecif.application.service.MgmtCustAcctInfoApplicationService;
import com.mcore.hsbc.ecif.domain.service.mgmtCustAcctInfo.MgmtCustAcctInfoDomainService;
import com.mcore.hsbc.ecif.implementation.convert.CustAcctInfoConvert;
import com.mcore.hsbc.ecif.infrastructure.enums.ErrorCodeEnum;
import com.mcore.hsbc.ecif.infrastructure.enums.RouteOperTypCdEnum;
import com.mcore.hsbc.ecif.infrastructure.exception.ECIFException;
import com.mcore.hsbc.ecif.infrastructure.util.CheckParaUtil;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：客户账户路由信息维护
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 */
public class MgmtCustAcctInfoApplicationServiceImpl
        implements MgmtCustAcctInfoApplicationService {

    private final MgmtCustAcctInfoDomainService mgmtCustAcctInfoDomainService;

    public MgmtCustAcctInfoApplicationServiceImpl(MgmtCustAcctInfoDomainService mgmtCustAcctInfoDomainService) {
        this.mgmtCustAcctInfoDomainService = mgmtCustAcctInfoDomainService;
    }

    /**
     * 客户账户路由信息维护
     *
     * @param request
     * @return
     */
    @Override
    public MgmtCustAcctInfoExecuteResponse execute(MgmtCustAcctInfoExecuteRequest request) {
        CheckParaUtil.checkInputForEmpty(request.getTenantNo(), "租户号");
        CheckParaUtil.checkInputForEmpty(request.getCustNo(), "客户编号");
        CheckParaUtil.checkInputForEmpty(request.getRouteVal(), "路由值");
        CheckParaUtil.checkInputForEmpty(request.getRouteTypCd(), "路由类型");
        CheckParaUtil.checkInputForEmpty(request.getOperTypCd(), "操作类型");
        switch (RouteOperTypCdEnum.of(request.getOperTypCd())) {
            case ADD:
                mgmtCustAcctInfoDomainService.save(CustAcctInfoConvert.INSTANCE.covertInputDto(request));
                break;
            case MOD:
                mgmtCustAcctInfoDomainService.update(CustAcctInfoConvert.INSTANCE.covertInputDto(request));
                break;
            case DEL:
                mgmtCustAcctInfoDomainService.delete(CustAcctInfoConvert.INSTANCE.covertInputDto(request));
                break;
            default:
                throw new ECIFException(ErrorCodeEnum.E12196, "非法操作标志");
        }
        return new MgmtCustAcctInfoExecuteResponse();
    }
}
