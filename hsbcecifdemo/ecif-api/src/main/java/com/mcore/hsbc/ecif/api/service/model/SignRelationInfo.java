package com.mcore.hsbc.ecif.api.service.model;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号：head
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：客户签约关系
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class SignRelationInfo
    implements Serializable
{
    /**
     * 签约机构编号
     */
    @JsonProperty("signOrgNo")
    private String signOrgNo;
    /**
     * 系统编号
     */
    @JsonProperty("sysNo")
    private String sysNo;
    /**
     * 主键编号
     */
    @JsonProperty("pkNo")
    private String pkNo;
    /**
     * 关联序号
     */
    @JsonProperty("relaSeqNo")
    private String relaSeqNo;
    /**
     * 生效标志
     */
    @JsonProperty("efftFlg")
    private String efftFlg;
    /**
     * 签约柜员号
     */
    @JsonProperty("signTelrNo")
    private String signTelrNo;
    /**
     * 签约小类类型代码
     */
    @JsonProperty("signSmltypTypCd")
    private String signSmltypTypCd;
    /**
     * 签约状态代码
     */
    @JsonProperty("signStusCd")
    private String signStusCd;
    /**
     * 签约日期
     */
    @JsonProperty("signDt")
    @JsonDeserialize(using = DateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonSerialize(using = DateSerializer.class)
    private Date signDt;
    /**
     * 核算账户序号
     */
    @JsonProperty("acctiAcctSeqNo")
    private Integer acctiAcctSeqNo;
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
     * 签约类型代码
     */
    @JsonProperty("signTypCd")
    private String signTypCd;
    /**
     * 解约日期
     */
    @JsonProperty("cancelContDt")
    @JsonDeserialize(using = DateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonSerialize(using = DateSerializer.class)
    private Date cancelContDt;
    /**
     * 电话号码
     */
    @JsonProperty("telNo")
    private String telNo;

    public SignRelationInfo() {
    }

    public void setSignOrgNo(String signOrgNo) {
        this.signOrgNo = signOrgNo;
    }

    public String getSignOrgNo() {
        return this.signOrgNo;
    }

    public void setSysNo(String sysNo) {
        this.sysNo = sysNo;
    }

    public String getSysNo() {
        return this.sysNo;
    }

    public void setPkNo(String pkNo) {
        this.pkNo = pkNo;
    }

    public String getPkNo() {
        return this.pkNo;
    }

    public void setRelaSeqNo(String relaSeqNo) {
        this.relaSeqNo = relaSeqNo;
    }

    public String getRelaSeqNo() {
        return this.relaSeqNo;
    }

    public void setEfftFlg(String efftFlg) {
        this.efftFlg = efftFlg;
    }

    public String getEfftFlg() {
        return this.efftFlg;
    }

    public void setSignTelrNo(String signTelrNo) {
        this.signTelrNo = signTelrNo;
    }

    public String getSignTelrNo() {
        return this.signTelrNo;
    }

    public void setSignSmltypTypCd(String signSmltypTypCd) {
        this.signSmltypTypCd = signSmltypTypCd;
    }

    public String getSignSmltypTypCd() {
        return this.signSmltypTypCd;
    }

    public void setSignStusCd(String signStusCd) {
        this.signStusCd = signStusCd;
    }

    public String getSignStusCd() {
        return this.signStusCd;
    }

    public void setSignDt(Date signDt) {
        this.signDt = signDt;
    }

    public Date getSignDt() {
        return this.signDt;
    }

    public void setAcctiAcctSeqNo(Integer acctiAcctSeqNo) {
        this.acctiAcctSeqNo = acctiAcctSeqNo;
    }

    public Integer getAcctiAcctSeqNo() {
        return this.acctiAcctSeqNo;
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

    public void setSignTypCd(String signTypCd) {
        this.signTypCd = signTypCd;
    }

    public String getSignTypCd() {
        return this.signTypCd;
    }

    public void setCancelContDt(Date cancelContDt) {
        this.cancelContDt = cancelContDt;
    }

    public Date getCancelContDt() {
        return this.cancelContDt;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getTelNo() {
        return this.telNo;
    }

    @Override
    public String toString() {
        return "SignRelationInfo{" +
				"signOrgNo='" + signOrgNo + '\'' +
				", sysNo='" + sysNo + '\'' +
				", pkNo='" + pkNo + '\'' +
				", relaSeqNo='" + relaSeqNo + '\'' +
				", efftFlg='" + efftFlg + '\'' +
				", signTelrNo='" + signTelrNo + '\'' +
				", signSmltypTypCd='" + signSmltypTypCd + '\'' +
				", signStusCd='" + signStusCd + '\'' +
				", signDt=" + signDt +
				", acctiAcctSeqNo=" + acctiAcctSeqNo +
				", custNo='" + custNo + '\'' +
				", custAcctNo='" + custAcctNo + '\'' +
				", signTypCd='" + signTypCd + '\'' +
				", cancelContDt=" + cancelContDt +
				", telNo='" + telNo + '\'' +
				'}';
    }
}
