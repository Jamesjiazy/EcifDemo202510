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
 * <br>    程序功能：根据客户编号查询个人客户信息-出参
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoResponse
    extends CoreAppResponseHeader
{
    /**
     * 地址
     */
    private String addr;
    /**
     * 行政区划代码
     */
    private String adminCmprmntCd;
    /**
     * 职业类型代码
     */
    private String careerTypCd;
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
     * 境内外标志代码
     */
    private String domOversFlgCd;
    /**
     * 员工标志
     */
    private String emplyFlg;
    /**
     * 民族代码
     */
    private String ethnicCd;
    /**
     * 性别代码
     */
    private String genderCd;
    /**
     * 身份证类型代码
     */
    private String idCardTypCd;
    /**
     * 预留手机号码
     */
    private String rsvdMobileNo;
    /**
     * 配偶证件号码
     */
    private String spsCrtfNo;
    /**
     * 配偶证件类型代码
     */
    private String spsCrtfTypCd;
    /**
     * 配偶姓名
     */
    private String spsName;
    /**
     * 配偶电话号码
     */
    private String spsTelNo;
    /**
     * 国家和地区代码
     */
    private String stateAndRgnCd;

    public QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoResponse() {
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getAddr() {
        return this.addr;
    }

    public void setAdminCmprmntCd(String adminCmprmntCd) {
        this.adminCmprmntCd = adminCmprmntCd;
    }

    public String getAdminCmprmntCd() {
        return this.adminCmprmntCd;
    }

    public void setCareerTypCd(String careerTypCd) {
        this.careerTypCd = careerTypCd;
    }

    public String getCareerTypCd() {
        return this.careerTypCd;
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

    public void setDomOversFlgCd(String domOversFlgCd) {
        this.domOversFlgCd = domOversFlgCd;
    }

    public String getDomOversFlgCd() {
        return this.domOversFlgCd;
    }

    public void setEmplyFlg(String emplyFlg) {
        this.emplyFlg = emplyFlg;
    }

    public String getEmplyFlg() {
        return this.emplyFlg;
    }

    public void setEthnicCd(String ethnicCd) {
        this.ethnicCd = ethnicCd;
    }

    public String getEthnicCd() {
        return this.ethnicCd;
    }

    public void setGenderCd(String genderCd) {
        this.genderCd = genderCd;
    }

    public String getGenderCd() {
        return this.genderCd;
    }

    public void setIdCardTypCd(String idCardTypCd) {
        this.idCardTypCd = idCardTypCd;
    }

    public String getIdCardTypCd() {
        return this.idCardTypCd;
    }

    public void setRsvdMobileNo(String rsvdMobileNo) {
        this.rsvdMobileNo = rsvdMobileNo;
    }

    public String getRsvdMobileNo() {
        return this.rsvdMobileNo;
    }

    public void setSpsCrtfNo(String spsCrtfNo) {
        this.spsCrtfNo = spsCrtfNo;
    }

    public String getSpsCrtfNo() {
        return this.spsCrtfNo;
    }

    public void setSpsCrtfTypCd(String spsCrtfTypCd) {
        this.spsCrtfTypCd = spsCrtfTypCd;
    }

    public String getSpsCrtfTypCd() {
        return this.spsCrtfTypCd;
    }

    public void setSpsName(String spsName) {
        this.spsName = spsName;
    }

    public String getSpsName() {
        return this.spsName;
    }

    public void setSpsTelNo(String spsTelNo) {
        this.spsTelNo = spsTelNo;
    }

    public String getSpsTelNo() {
        return this.spsTelNo;
    }

    public void setStateAndRgnCd(String stateAndRgnCd) {
        this.stateAndRgnCd = stateAndRgnCd;
    }

    public String getStateAndRgnCd() {
        return this.stateAndRgnCd;
    }

    @Override
    public String toString() {
        return "QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoResponse{" +
				"addr='" + addr + '\'' +
				", adminCmprmntCd='" + adminCmprmntCd + '\'' +
				", careerTypCd='" + careerTypCd + '\'' +
				", crtfMatrDt=" + crtfMatrDt +
				", crtfNo='" + crtfNo + '\'' +
				", crtfTypCd='" + crtfTypCd + '\'' +
				", custAttnExttCd='" + custAttnExttCd + '\'' +
				", custNm='" + custNm + '\'' +
				", custNo='" + custNo + '\'' +
				", domOversFlgCd='" + domOversFlgCd + '\'' +
				", emplyFlg='" + emplyFlg + '\'' +
				", ethnicCd='" + ethnicCd + '\'' +
				", genderCd='" + genderCd + '\'' +
				", idCardTypCd='" + idCardTypCd + '\'' +
				", rsvdMobileNo='" + rsvdMobileNo + '\'' +
				", spsCrtfNo='" + spsCrtfNo + '\'' +
				", spsCrtfTypCd='" + spsCrtfTypCd + '\'' +
				", spsName='" + spsName + '\'' +
				", spsTelNo='" + spsTelNo + '\'' +
				", stateAndRgnCd='" + stateAndRgnCd + '\'' +
				'}';
    }
}
