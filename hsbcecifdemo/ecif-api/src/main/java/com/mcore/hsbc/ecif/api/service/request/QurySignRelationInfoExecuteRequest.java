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
 * <br>    程序功能：客户签约关系查询-入参
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class QurySignRelationInfoExecuteRequest
    extends CoreAppRequestHeader
{
    /**
     * 证件号码
     */
    @JsonProperty("crtfNo")
    private String crtfNo;
    /**
     * 证件类型代码
     */
    @JsonProperty("crtfTypCd")
    private String crtfTypCd;
    /**
     * 客户账号
     */
    @JsonProperty("custAcctNo")
    private String custAcctNo;
    /**
     * 客户名称
     */
    @JsonProperty("custNm")
    private String custNm;
    /**
     * 签约小类类型代码
     */
    @JsonProperty("signSmltypTypCd")
    private String signSmltypTypCd;

    public QurySignRelationInfoExecuteRequest() {
    }

    public void setCrtfNo(String crtfNo) {
        this.crtfNo = crtfNo;
    }

    public String getCrtfNo() {
        return this.crtfNo;
    }

    public void setCrtfTypCd(String crtfTypCd) {
        this.crtfTypCd = crtfTypCd;
    }

    public String getCrtfTypCd() {
        return this.crtfTypCd;
    }

    public void setCustAcctNo(String custAcctNo) {
        this.custAcctNo = custAcctNo;
    }

    public String getCustAcctNo() {
        return this.custAcctNo;
    }

    public void setCustNm(String custNm) {
        this.custNm = custNm;
    }

    public String getCustNm() {
        return this.custNm;
    }

    public void setSignSmltypTypCd(String signSmltypTypCd) {
        this.signSmltypTypCd = signSmltypTypCd;
    }

    public String getSignSmltypTypCd() {
        return this.signSmltypTypCd;
    }

    @Override
    public String toString() {
        return "QurySignRelationInfoQurySignRelationInfoRequest{" +
				"crtfNo='" + crtfNo + '\'' +
				", crtfTypCd='" + crtfTypCd + '\'' +
				", custAcctNo='" + custAcctNo + '\'' +
				", custNm='" + custNm + '\'' +
				", signSmltypTypCd='" + signSmltypTypCd + '\'' +
				'}';
    }
}
