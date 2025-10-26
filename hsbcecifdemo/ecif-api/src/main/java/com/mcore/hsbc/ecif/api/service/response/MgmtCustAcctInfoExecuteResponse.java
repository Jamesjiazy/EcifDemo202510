package com.mcore.hsbc.ecif.api.service.response;

import com.mcore.base.header.CoreAppResponseHeader;
import com.mcore.hsbc.ecif.api.service.model.CustAcctRouteInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号：head
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：客户账户路由信息维护-出参
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class MgmtCustAcctInfoExecuteResponse
        extends CoreAppResponseHeader {
    private List<CustAcctRouteInfo> custAcctRouteInfoList;
}
