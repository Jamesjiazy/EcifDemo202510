package com.mcore.hsbc.ecif.api.service.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mcore.base.header.CoreAppRequestHeader;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号：head
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：客户账户路由信息维护-入参
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class MgmtCustAcctInfoExecuteRequest
    extends CoreAppRequestHeader
{
    /**
     * 可售产品编号
     */
    @JsonProperty("afsProdtNo")
    private String afsProdtNo;
    /**
     * 主账号
     */
    @JsonProperty("mainAcctNo")
    private String mainAcctNo;
    /**
     * 操作类型代码
     */
    @JsonProperty("operTypCd")
    private String operTypCd;
    /**
     * 关联序号
     */
    @JsonProperty("relaSeqNo")
    private String relaSeqNo;
    /**
     * 路由类型代码
     */
    @JsonProperty("routeTypCd")
    private String routeTypCd;
    /**
     * 路由值
     */
    @JsonProperty("routeVal")
    private String routeVal;

    public MgmtCustAcctInfoExecuteRequest() {
    }

    public void setAfsProdtNo(String afsProdtNo) {
        this.afsProdtNo = afsProdtNo;
    }

    public String getAfsProdtNo() {
        return this.afsProdtNo;
    }

    public void setMainAcctNo(String mainAcctNo) {
        this.mainAcctNo = mainAcctNo;
    }

    public String getMainAcctNo() {
        return this.mainAcctNo;
    }

    public void setOperTypCd(String operTypCd) {
        this.operTypCd = operTypCd;
    }

    public String getOperTypCd() {
        return this.operTypCd;
    }

    public void setRelaSeqNo(String relaSeqNo) {
        this.relaSeqNo = relaSeqNo;
    }

    public String getRelaSeqNo() {
        return this.relaSeqNo;
    }

    public void setRouteTypCd(String routeTypCd) {
        this.routeTypCd = routeTypCd;
    }

    public String getRouteTypCd() {
        return this.routeTypCd;
    }

    public void setRouteVal(String routeVal) {
        this.routeVal = routeVal;
    }

    public String getRouteVal() {
        return this.routeVal;
    }

    @Override
    public String toString() {
        return "MgmtCustAcctInfoMgmtCustAcctInfoRequest{" +
				"afsProdtNo='" + afsProdtNo + '\'' +
				", mainAcctNo='" + mainAcctNo + '\'' +
				", operTypCd='" + operTypCd + '\'' +
				", relaSeqNo='" + relaSeqNo + '\'' +
				", routeTypCd='" + routeTypCd + '\'' +
				", routeVal='" + routeVal + '\'' +
				'}';
    }
}
