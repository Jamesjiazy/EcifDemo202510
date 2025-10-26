package com.mcore.hsbc.ecif.api.service.request;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mcore.base.header.CoreAppRequestHeader;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号：head
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：客户归并-单账号-入参
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class ConsolidationCustByAcctNoExecuteRequest
    extends CoreAppRequestHeader
{
    /**
     * 账号字符串集合
     */
    @JsonProperty("custAcctNoList")
    private List<String> custAcctNoList;
    /**
     * 并入客户编号
     */
    @JsonProperty("mergeCustNo")
    private String mergeCustNo;
    /**
     * 路由类型代码
     */
    @JsonProperty("routeTypCd")
    private String routeTypCd;

    public ConsolidationCustByAcctNoExecuteRequest() {
    }

    public void setCustAcctNoList(List<String> custAcctNoList) {
        this.custAcctNoList = custAcctNoList;
    }

    public List<String> getCustAcctNoList() {
        return this.custAcctNoList;
    }

    public void setMergeCustNo(String mergeCustNo) {
        this.mergeCustNo = mergeCustNo;
    }

    public String getMergeCustNo() {
        return this.mergeCustNo;
    }

    public void setRouteTypCd(String routeTypCd) {
        this.routeTypCd = routeTypCd;
    }

    public String getRouteTypCd() {
        return this.routeTypCd;
    }

    @Override
    public String toString() {
        return "ConsolidationCustByAcctNoConsolidationCustByAcctNoRequest{" +
				"custAcctNoList=" + custAcctNoList +
				", mergeCustNo='" + mergeCustNo + '\'' +
				", routeTypCd='" + routeTypCd + '\'' +
				'}';
    }
}
