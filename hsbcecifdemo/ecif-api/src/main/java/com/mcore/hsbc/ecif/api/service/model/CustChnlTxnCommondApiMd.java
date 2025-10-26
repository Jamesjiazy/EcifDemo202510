package com.mcore.hsbc.ecif.api.service.model;

import java.io.Serializable;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号：head
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：客户交易渠道限制信息
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class CustChnlTxnCommondApiMd
    implements Serializable
{
    /**
     * 年累计最大交易金额
     */
    @JsonProperty("yrAccmMaxTxAmt")
    private BigDecimal yrAccmMaxTxAmt;
    /**
     * 月累计最大交易金额
     */
    @JsonProperty("monAccmMaxTxAmt")
    private BigDecimal monAccmMaxTxAmt;
    /**
     * 允许终端类型代码
     */
    @JsonProperty("pmitTerminalTypCd")
    private String pmitTerminalTypCd;
    /**
     * 限额类型代码
     */
    @JsonProperty("lmtTypCd")
    private String lmtTypCd;
    /**
     * 日累计最大交易金额
     */
    @JsonProperty("dayAccmMaxTxAmt")
    private BigDecimal dayAccmMaxTxAmt;
    /**
     * 月累计最大交易笔数
     */
    @JsonProperty("monAccmMaxTxStkcnt")
    private Integer monAccmMaxTxStkcnt;
    /**
     * 日累计最大交易笔数
     */
    @JsonProperty("dayAccmMaxTxStkcnt")
    private Integer dayAccmMaxTxStkcnt;
    /**
     * 年累计最大交易笔数
     */
    @JsonProperty("yrAccmMaxTxStkcnt")
    private Integer yrAccmMaxTxStkcnt;
    /**
     * 单笔交易最高金额
     */
    @JsonProperty("sglTxHighAmt")
    private BigDecimal sglTxHighAmt;
    /**
     * 单笔交易最低金额
     */
    @JsonProperty("sglTxLowestAmt")
    private BigDecimal sglTxLowestAmt;
    /**
     * 季累计最大交易笔数
     */
    @JsonProperty("qtAccmMaxTxStkcnt")
    private Integer qtAccmMaxTxStkcnt;
    /**
     * 季累计最大交易金额
     */
    @JsonProperty("qtAccmMaxTxAmt")
    private BigDecimal qtAccmMaxTxAmt;
    /**
     * 客户编号
     */
    @JsonProperty("custNo")
    private String custNo;
    /**
     * 原因
     */
    @JsonProperty("rsn")
    private String rsn;

    public CustChnlTxnCommondApiMd() {
    }

    public void setYrAccmMaxTxAmt(BigDecimal yrAccmMaxTxAmt) {
        this.yrAccmMaxTxAmt = yrAccmMaxTxAmt;
    }

    public BigDecimal getYrAccmMaxTxAmt() {
        return this.yrAccmMaxTxAmt;
    }

    public void setMonAccmMaxTxAmt(BigDecimal monAccmMaxTxAmt) {
        this.monAccmMaxTxAmt = monAccmMaxTxAmt;
    }

    public BigDecimal getMonAccmMaxTxAmt() {
        return this.monAccmMaxTxAmt;
    }

    public void setPmitTerminalTypCd(String pmitTerminalTypCd) {
        this.pmitTerminalTypCd = pmitTerminalTypCd;
    }

    public String getPmitTerminalTypCd() {
        return this.pmitTerminalTypCd;
    }

    public void setLmtTypCd(String lmtTypCd) {
        this.lmtTypCd = lmtTypCd;
    }

    public String getLmtTypCd() {
        return this.lmtTypCd;
    }

    public void setDayAccmMaxTxAmt(BigDecimal dayAccmMaxTxAmt) {
        this.dayAccmMaxTxAmt = dayAccmMaxTxAmt;
    }

    public BigDecimal getDayAccmMaxTxAmt() {
        return this.dayAccmMaxTxAmt;
    }

    public void setMonAccmMaxTxStkcnt(Integer monAccmMaxTxStkcnt) {
        this.monAccmMaxTxStkcnt = monAccmMaxTxStkcnt;
    }

    public Integer getMonAccmMaxTxStkcnt() {
        return this.monAccmMaxTxStkcnt;
    }

    public void setDayAccmMaxTxStkcnt(Integer dayAccmMaxTxStkcnt) {
        this.dayAccmMaxTxStkcnt = dayAccmMaxTxStkcnt;
    }

    public Integer getDayAccmMaxTxStkcnt() {
        return this.dayAccmMaxTxStkcnt;
    }

    public void setYrAccmMaxTxStkcnt(Integer yrAccmMaxTxStkcnt) {
        this.yrAccmMaxTxStkcnt = yrAccmMaxTxStkcnt;
    }

    public Integer getYrAccmMaxTxStkcnt() {
        return this.yrAccmMaxTxStkcnt;
    }

    public void setSglTxHighAmt(BigDecimal sglTxHighAmt) {
        this.sglTxHighAmt = sglTxHighAmt;
    }

    public BigDecimal getSglTxHighAmt() {
        return this.sglTxHighAmt;
    }

    public void setSglTxLowestAmt(BigDecimal sglTxLowestAmt) {
        this.sglTxLowestAmt = sglTxLowestAmt;
    }

    public BigDecimal getSglTxLowestAmt() {
        return this.sglTxLowestAmt;
    }

    public void setQtAccmMaxTxStkcnt(Integer qtAccmMaxTxStkcnt) {
        this.qtAccmMaxTxStkcnt = qtAccmMaxTxStkcnt;
    }

    public Integer getQtAccmMaxTxStkcnt() {
        return this.qtAccmMaxTxStkcnt;
    }

    public void setQtAccmMaxTxAmt(BigDecimal qtAccmMaxTxAmt) {
        this.qtAccmMaxTxAmt = qtAccmMaxTxAmt;
    }

    public BigDecimal getQtAccmMaxTxAmt() {
        return this.qtAccmMaxTxAmt;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getCustNo() {
        return this.custNo;
    }

    public void setRsn(String rsn) {
        this.rsn = rsn;
    }

    public String getRsn() {
        return this.rsn;
    }

    @Override
    public String toString() {
        return "CustChnlTxnCommondApiMd{" +
				"yrAccmMaxTxAmt=" + yrAccmMaxTxAmt +
				", monAccmMaxTxAmt=" + monAccmMaxTxAmt +
				", pmitTerminalTypCd='" + pmitTerminalTypCd + '\'' +
				", lmtTypCd='" + lmtTypCd + '\'' +
				", dayAccmMaxTxAmt=" + dayAccmMaxTxAmt +
				", monAccmMaxTxStkcnt=" + monAccmMaxTxStkcnt +
				", dayAccmMaxTxStkcnt=" + dayAccmMaxTxStkcnt +
				", yrAccmMaxTxStkcnt=" + yrAccmMaxTxStkcnt +
				", sglTxHighAmt=" + sglTxHighAmt +
				", sglTxLowestAmt=" + sglTxLowestAmt +
				", qtAccmMaxTxStkcnt=" + qtAccmMaxTxStkcnt +
				", qtAccmMaxTxAmt=" + qtAccmMaxTxAmt +
				", custNo='" + custNo + '\'' +
				", rsn='" + rsn + '\'' +
				'}';
    }
}
