package com.mcore.hsbc.ecif.api.service.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号：head
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：客户账户路由信息
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class CustAcctRouteInfo
    implements Serializable
{
    /**
     * 状态代码
     */
    @JsonProperty("stusCd")
    private String stusCd;
    /**
     * 可售产品编号
     */
    @JsonProperty("afsProdtNo")
    private String afsProdtNo;
    /**
     * 关联序号
     */
    @JsonProperty("relaSeqNo")
    private String relaSeqNo;
    /**
     * 路由值
     */
    @JsonProperty("routeVal")
    private String routeVal;
    /**
     * 主账号
     */
    @JsonProperty("mainAcctNo")
    private String mainAcctNo;
    /**
     * 客户编号
     */
    @JsonProperty("custNo")
    private String custNo;
    /**
     * 客户账号
     */
    @JsonProperty("custAcctNo")
    private String custAcctNo;
    /**
     * 基础产品编号
     */
    @JsonProperty("baseProdtNo")
    private String baseProdtNo;

    public CustAcctRouteInfo() {
    }

    public void setStusCd(String stusCd) {
        this.stusCd = stusCd;
    }

    public String getStusCd() {
        return this.stusCd;
    }

    public void setAfsProdtNo(String afsProdtNo) {
        this.afsProdtNo = afsProdtNo;
    }

    public String getAfsProdtNo() {
        return this.afsProdtNo;
    }

    public void setRelaSeqNo(String relaSeqNo) {
        this.relaSeqNo = relaSeqNo;
    }

    public String getRelaSeqNo() {
        return this.relaSeqNo;
    }

    public void setRouteVal(String routeVal) {
        this.routeVal = routeVal;
    }

    public String getRouteVal() {
        return this.routeVal;
    }

    public void setMainAcctNo(String mainAcctNo) {
        this.mainAcctNo = mainAcctNo;
    }

    public String getMainAcctNo() {
        return this.mainAcctNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getCustNo() {
        return this.custNo;
    }

    public void setCustAcctNo(String custAcctNo) {
        this.custAcctNo = custAcctNo;
    }

    public String getCustAcctNo() {
        return this.custAcctNo;
    }

    public void setBaseProdtNo(String baseProdtNo) {
        this.baseProdtNo = baseProdtNo;
    }

    public String getBaseProdtNo() {
        return this.baseProdtNo;
    }

    @Override
    public String toString() {
        return "CustAcctRouteInfo{" +
				"stusCd='" + stusCd + '\'' +
				", afsProdtNo='" + afsProdtNo + '\'' +
				", relaSeqNo='" + relaSeqNo + '\'' +
				", routeVal='" + routeVal + '\'' +
				", mainAcctNo='" + mainAcctNo + '\'' +
				", custNo='" + custNo + '\'' +
				", custAcctNo='" + custAcctNo + '\'' +
				", baseProdtNo='" + baseProdtNo + '\'' +
				'}';
    }
}
