package com.mcore.hsbc.ecif.api.service.response;

import java.util.Date;
import com.mcore.base.header.CoreAppResponseHeader;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号：head
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：对私客户风险等级信息查询-出参
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class QuryPerCustRiskLevelQuryPerCustRiskLevelResponse
    extends CoreAppResponseHeader
{
    /**
     * 客户关注程度代码
     */
    private String custAttnExttCd;
    /**
     * 客户编号
     */
    private String custNo;
    /**
     * 客户类型代码
     */
    private String custTypCd;
    /**
     * 评定依据说明
     */
    private String evaltAcrdgasComnt;
    /**
     * 评定日期
     */
    private Date evaltDt;
    /**
     * 发布日期
     */
    private Date relsDt;
    /**
     * 发布或签发机构号
     */
    private String relsOrIsuOrgNo;

    public QuryPerCustRiskLevelQuryPerCustRiskLevelResponse() {
    }

    public void setCustAttnExttCd(String custAttnExttCd) {
        this.custAttnExttCd = custAttnExttCd;
    }

    public String getCustAttnExttCd() {
        return this.custAttnExttCd;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getCustNo() {
        return this.custNo;
    }

    public void setCustTypCd(String custTypCd) {
        this.custTypCd = custTypCd;
    }

    public String getCustTypCd() {
        return this.custTypCd;
    }

    public void setEvaltAcrdgasComnt(String evaltAcrdgasComnt) {
        this.evaltAcrdgasComnt = evaltAcrdgasComnt;
    }

    public String getEvaltAcrdgasComnt() {
        return this.evaltAcrdgasComnt;
    }

    public void setEvaltDt(Date evaltDt) {
        this.evaltDt = evaltDt;
    }

    public Date getEvaltDt() {
        return this.evaltDt;
    }

    public void setRelsDt(Date relsDt) {
        this.relsDt = relsDt;
    }

    public Date getRelsDt() {
        return this.relsDt;
    }

    public void setRelsOrIsuOrgNo(String relsOrIsuOrgNo) {
        this.relsOrIsuOrgNo = relsOrIsuOrgNo;
    }

    public String getRelsOrIsuOrgNo() {
        return this.relsOrIsuOrgNo;
    }

    @Override
    public String toString() {
        return "QuryPerCustRiskLevelQuryPerCustRiskLevelResponse{" +
				"custAttnExttCd='" + custAttnExttCd + '\'' +
				", custNo='" + custNo + '\'' +
				", custTypCd='" + custTypCd + '\'' +
				", evaltAcrdgasComnt='" + evaltAcrdgasComnt + '\'' +
				", evaltDt=" + evaltDt +
				", relsDt=" + relsDt +
				", relsOrIsuOrgNo='" + relsOrIsuOrgNo + '\'' +
				'}';
    }
}
