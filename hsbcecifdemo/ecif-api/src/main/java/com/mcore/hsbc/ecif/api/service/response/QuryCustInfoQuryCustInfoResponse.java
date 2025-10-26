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
 * <br>    程序功能：客户基本信息查询-出参
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class QuryCustInfoQuryCustInfoResponse
    extends CoreAppResponseHeader
{
    /**
     * 证件到期日期
     */
    private Date crtfMatrDt;
    /**
     * 证件号码
     */
    private String crtfNo;
    /**
     * 证件类型代码
     */
    private String crtfTypCd;
    /**
     * 客户关注程度代码
     */
    private String custAttnExttCd;
    /**
     * 客户名称
     */
    private String custNm;
    /**
     * 客户编号
     */
    private String custNo;
    /**
     * 客户类型代码
     */
    private String custTypCd;

    public QuryCustInfoQuryCustInfoResponse() {
    }

    public void setCrtfMatrDt(Date crtfMatrDt) {
        this.crtfMatrDt = crtfMatrDt;
    }

    public Date getCrtfMatrDt() {
        return this.crtfMatrDt;
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

    public void setCustAttnExttCd(String custAttnExttCd) {
        this.custAttnExttCd = custAttnExttCd;
    }

    public String getCustAttnExttCd() {
        return this.custAttnExttCd;
    }

    public void setCustNm(String custNm) {
        this.custNm = custNm;
    }

    public String getCustNm() {
        return this.custNm;
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

    @Override
    public String toString() {
        return "QuryCustInfoQuryCustInfoResponse{" +
				"crtfMatrDt=" + crtfMatrDt +
				", crtfNo='" + crtfNo + '\'' +
				", crtfTypCd='" + crtfTypCd + '\'' +
				", custAttnExttCd='" + custAttnExttCd + '\'' +
				", custNm='" + custNm + '\'' +
				", custNo='" + custNo + '\'' +
				", custTypCd='" + custTypCd + '\'' +
				'}';
    }
}
