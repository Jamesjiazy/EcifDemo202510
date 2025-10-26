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
 * <br>    程序功能：客户名单信息
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class NameListInfoDO
    implements Serializable
{
    /**
     * 数据来源代码
     */
    @JsonProperty("dataSorcCd")
    private String dataSorcCd;
    /**
     * 名单类型代码
     */
    @JsonProperty("nmSnglTypCd")
    private String nmSnglTypCd;
    /**
     * 失效时间
     */
    @JsonProperty("invalidTm")
    @JsonDeserialize(using = DateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonSerialize(using = DateSerializer.class)
    private Date invalidTm;
    /**
     * 检查标志代码
     */
    @JsonProperty("chkFlgCd")
    private String chkFlgCd;
    /**
     * 失效日期
     */
    @JsonProperty("invalidDt")
    @JsonDeserialize(using = DateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonSerialize(using = DateSerializer.class)
    private Date invalidDt;
    /**
     * 生效日期
     */
    @JsonProperty("efftDt")
    @JsonDeserialize(using = DateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonSerialize(using = DateSerializer.class)
    private Date efftDt;
    /**
     * 客户编号
     */
    @JsonProperty("custNo")
    private String custNo;
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
     * 控制标志
     */
    @JsonProperty("ctrlFlg")
    private String ctrlFlg;
    /**
     * 生效时间
     */
    @JsonProperty("efftTm")
    @JsonDeserialize(using = DateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonSerialize(using = DateSerializer.class)
    private Date efftTm;
    /**
     * 机构区分编码
     */
    @JsonProperty("orgDismnCd")
    private String orgDismnCd;

    public NameListInfoDO() {
    }

    public void setDataSorcCd(String dataSorcCd) {
        this.dataSorcCd = dataSorcCd;
    }

    public String getDataSorcCd() {
        return this.dataSorcCd;
    }

    public void setNmSnglTypCd(String nmSnglTypCd) {
        this.nmSnglTypCd = nmSnglTypCd;
    }

    public String getNmSnglTypCd() {
        return this.nmSnglTypCd;
    }

    public void setInvalidTm(Date invalidTm) {
        this.invalidTm = invalidTm;
    }

    public Date getInvalidTm() {
        return this.invalidTm;
    }

    public void setChkFlgCd(String chkFlgCd) {
        this.chkFlgCd = chkFlgCd;
    }

    public String getChkFlgCd() {
        return this.chkFlgCd;
    }

    public void setInvalidDt(Date invalidDt) {
        this.invalidDt = invalidDt;
    }

    public Date getInvalidDt() {
        return this.invalidDt;
    }

    public void setEfftDt(Date efftDt) {
        this.efftDt = efftDt;
    }

    public Date getEfftDt() {
        return this.efftDt;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getCustNo() {
        return this.custNo;
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

    public void setCtrlFlg(String ctrlFlg) {
        this.ctrlFlg = ctrlFlg;
    }

    public String getCtrlFlg() {
        return this.ctrlFlg;
    }

    public void setEfftTm(Date efftTm) {
        this.efftTm = efftTm;
    }

    public Date getEfftTm() {
        return this.efftTm;
    }

    public void setOrgDismnCd(String orgDismnCd) {
        this.orgDismnCd = orgDismnCd;
    }

    public String getOrgDismnCd() {
        return this.orgDismnCd;
    }

    @Override
    public String toString() {
        return "NameListInfoDO{" +
				"dataSorcCd='" + dataSorcCd + '\'' +
				", nmSnglTypCd='" + nmSnglTypCd + '\'' +
				", invalidTm=" + invalidTm +
				", chkFlgCd='" + chkFlgCd + '\'' +
				", invalidDt=" + invalidDt +
				", efftDt=" + efftDt +
				", custNo='" + custNo + '\'' +
				", crtfNo='" + crtfNo + '\'' +
				", crtfTypCd='" + crtfTypCd + '\'' +
				", ctrlFlg='" + ctrlFlg + '\'' +
				", efftTm=" + efftTm +
				", orgDismnCd='" + orgDismnCd + '\'' +
				'}';
    }
}
