package com.mcore.hsbc.ecif.api.service.response;

import com.mcore.base.header.CoreAppResponseHeader;
import com.mcore.hsbc.ecif.api.service.model.CustAcctRouteInfo;

import java.util.List;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号：head
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：通过客户号查询客户账户路由信息-出参
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class QuryCustAcctInfoByCustAcctExecuteResponse
    extends CoreAppResponseHeader
{
    /**
     * 客户账户路由信息列表
     */
    private List<CustAcctRouteInfo> custAcctRouteInfoList;

    public QuryCustAcctInfoByCustAcctExecuteResponse() {
    }

    public void setCustAcctRouteInfoList(List<CustAcctRouteInfo> custAcctRouteInfoList) {
        this.custAcctRouteInfoList = custAcctRouteInfoList;
    }

    public List<CustAcctRouteInfo> getCustAcctRouteInfoList() {
        return this.custAcctRouteInfoList;
    }

    @Override
    public String toString() {
        return "QuryCustAcctInfoByCustAcctExecuteResponse{" +
                "custAcctRouteInfoList=" + custAcctRouteInfoList +
                '}';
    }
}
