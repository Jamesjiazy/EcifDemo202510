package com.mcore.hsbc.ecif.api.service.request;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.mcore.base.header.CoreAppRequestHeader;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号：head
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：对私客户信息维护-入参
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class MgmtPerCustInfoMgmtPerCustInfoRequest
    extends CoreAppRequestHeader
{
    /**
     * 学位代码
     */
    @JsonProperty("aceDegreeCd")
    private String aceDegreeCd;
    /**
     * 地址
     */
    @JsonProperty("addr")
    private String addr;
    /**
     * 行政区划代码
     */
    @JsonProperty("adminCmprmntCd")
    private String adminCmprmntCd;
    /**
     * 出生日期
     */
    @JsonProperty("birthDt")
    @JsonDeserialize(using = DateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonSerialize(using = DateSerializer.class)
    private Date birthDt;
    /**
     * 职业类型代码
     */
    @JsonProperty("careerTypCd")
    private String careerTypCd;
    /**
     * 证件到期日期
     */
    @JsonProperty("crtfMatrDt")
    @JsonDeserialize(using = DateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonSerialize(using = DateSerializer.class)
    private Date crtfMatrDt;
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
     * 客户英文名称
     */
    @JsonProperty("custEngNm")
    private String custEngNm;
    /**
     * 客户级别代码
     */
    @JsonProperty("custLvlCd")
    private String custLvlCd;
    /**
     * 客户经理员工号
     */
    @JsonProperty("custMgrEmpnbr")
    private String custMgrEmpnbr;
    /**
     * 客户名称
     */
    @JsonProperty("custNm")
    private String custNm;
    /**
     * 境内外标志代码
     */
    @JsonProperty("domOversFlgCd")
    private String domOversFlgCd;
    /**
     * 电子邮箱
     */
    @JsonProperty("eMail")
    private String eMail;
    /**
     * 学历代码
     */
    @JsonProperty("edctbkgCd")
    private String edctbkgCd;
    /**
     * 员工标志
     */
    @JsonProperty("emplyFlg")
    private String emplyFlg;
    /**
     * 民族代码
     */
    @JsonProperty("ethnicCd")
    private String ethnicCd;
    /**
     * 性别代码
     */
    @JsonProperty("genderCd")
    private String genderCd;
    /**
     * 发证机关名称
     */
    @JsonProperty("grntcrtfInstnNm")
    private String grntcrtfInstnNm;
    /**
     * 户籍地址
     */
    @JsonProperty("housdRgstAddr")
    private String housdRgstAddr;
    /**
     * 身份证类型代码
     */
    @JsonProperty("idCardTypCd")
    private String idCardTypCd;
    /**
     * 婚姻状况代码
     */
    @JsonProperty("marrgSituationCd")
    private String marrgSituationCd;
    /**
     * 手机号码
     */
    @JsonProperty("mobileNo")
    private String mobileNo;
    /**
     * 曾用名
     */
    @JsonProperty("nmUsed")
    private String nmUsed;
    /**
     * 股东标志
     */
    @JsonProperty("shrhdFlg")
    private String shrhdFlg;
    /**
     * 配偶证件号码
     */
    @JsonProperty("spsCrtfNo")
    private String spsCrtfNo;
    /**
     * 配偶证件类型代码
     */
    @JsonProperty("spsCrtfTypCd")
    private String spsCrtfTypCd;
    /**
     * 配偶英文姓名
     */
    @JsonProperty("spsEngName")
    private String spsEngName;
    /**
     * 配偶姓名
     */
    @JsonProperty("spsName")
    private String spsName;
    /**
     * 配偶电话号码
     */
    @JsonProperty("spsTelNo")
    private String spsTelNo;
    /**
     * 配偶工作单位名称
     */
    @JsonProperty("spsWorkUnitNm")
    private String spsWorkUnitNm;
    /**
     * 国家和地区代码
     */
    @JsonProperty("stateAndRgnCd")
    private String stateAndRgnCd;
    /**
     * 工作单位地址
     */
    @JsonProperty("workUnitAddr")
    private String workUnitAddr;
    /**
     * 工作单位名称
     */
    @JsonProperty("workUnitNm")
    private String workUnitNm;

    public MgmtPerCustInfoMgmtPerCustInfoRequest() {
    }

    public void setAceDegreeCd(String aceDegreeCd) {
        this.aceDegreeCd = aceDegreeCd;
    }

    public String getAceDegreeCd() {
        return this.aceDegreeCd;
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

    public void setBirthDt(Date birthDt) {
        this.birthDt = birthDt;
    }

    public Date getBirthDt() {
        return this.birthDt;
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

    public void setCustEngNm(String custEngNm) {
        this.custEngNm = custEngNm;
    }

    public String getCustEngNm() {
        return this.custEngNm;
    }

    public void setCustLvlCd(String custLvlCd) {
        this.custLvlCd = custLvlCd;
    }

    public String getCustLvlCd() {
        return this.custLvlCd;
    }

    public void setCustMgrEmpnbr(String custMgrEmpnbr) {
        this.custMgrEmpnbr = custMgrEmpnbr;
    }

    public String getCustMgrEmpnbr() {
        return this.custMgrEmpnbr;
    }

    public void setCustNm(String custNm) {
        this.custNm = custNm;
    }

    public String getCustNm() {
        return this.custNm;
    }

    public void setDomOversFlgCd(String domOversFlgCd) {
        this.domOversFlgCd = domOversFlgCd;
    }

    public String getDomOversFlgCd() {
        return this.domOversFlgCd;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getEMail() {
        return this.eMail;
    }

    public void setEdctbkgCd(String edctbkgCd) {
        this.edctbkgCd = edctbkgCd;
    }

    public String getEdctbkgCd() {
        return this.edctbkgCd;
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

    public void setGrntcrtfInstnNm(String grntcrtfInstnNm) {
        this.grntcrtfInstnNm = grntcrtfInstnNm;
    }

    public String getGrntcrtfInstnNm() {
        return this.grntcrtfInstnNm;
    }

    public void setHousdRgstAddr(String housdRgstAddr) {
        this.housdRgstAddr = housdRgstAddr;
    }

    public String getHousdRgstAddr() {
        return this.housdRgstAddr;
    }

    public void setIdCardTypCd(String idCardTypCd) {
        this.idCardTypCd = idCardTypCd;
    }

    public String getIdCardTypCd() {
        return this.idCardTypCd;
    }

    public void setMarrgSituationCd(String marrgSituationCd) {
        this.marrgSituationCd = marrgSituationCd;
    }

    public String getMarrgSituationCd() {
        return this.marrgSituationCd;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getMobileNo() {
        return this.mobileNo;
    }

    public void setNmUsed(String nmUsed) {
        this.nmUsed = nmUsed;
    }

    public String getNmUsed() {
        return this.nmUsed;
    }

    public void setShrhdFlg(String shrhdFlg) {
        this.shrhdFlg = shrhdFlg;
    }

    public String getShrhdFlg() {
        return this.shrhdFlg;
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

    public void setSpsEngName(String spsEngName) {
        this.spsEngName = spsEngName;
    }

    public String getSpsEngName() {
        return this.spsEngName;
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

    public void setSpsWorkUnitNm(String spsWorkUnitNm) {
        this.spsWorkUnitNm = spsWorkUnitNm;
    }

    public String getSpsWorkUnitNm() {
        return this.spsWorkUnitNm;
    }

    public void setStateAndRgnCd(String stateAndRgnCd) {
        this.stateAndRgnCd = stateAndRgnCd;
    }

    public String getStateAndRgnCd() {
        return this.stateAndRgnCd;
    }

    public void setWorkUnitAddr(String workUnitAddr) {
        this.workUnitAddr = workUnitAddr;
    }

    public String getWorkUnitAddr() {
        return this.workUnitAddr;
    }

    public void setWorkUnitNm(String workUnitNm) {
        this.workUnitNm = workUnitNm;
    }

    public String getWorkUnitNm() {
        return this.workUnitNm;
    }

    @Override
    public String toString() {
        return "MgmtPerCustInfoMgmtPerCustInfoRequest{" +
				"aceDegreeCd='" + aceDegreeCd + '\'' +
				", addr='" + addr + '\'' +
				", adminCmprmntCd='" + adminCmprmntCd + '\'' +
				", birthDt=" + birthDt +
				", careerTypCd='" + careerTypCd + '\'' +
				", crtfMatrDt=" + crtfMatrDt +
				", crtfNo='" + crtfNo + '\'' +
				", crtfTypCd='" + crtfTypCd + '\'' +
				", custEngNm='" + custEngNm + '\'' +
				", custLvlCd='" + custLvlCd + '\'' +
				", custMgrEmpnbr='" + custMgrEmpnbr + '\'' +
				", custNm='" + custNm + '\'' +
				", domOversFlgCd='" + domOversFlgCd + '\'' +
				", eMail='" + eMail + '\'' +
				", edctbkgCd='" + edctbkgCd + '\'' +
				", emplyFlg='" + emplyFlg + '\'' +
				", ethnicCd='" + ethnicCd + '\'' +
				", genderCd='" + genderCd + '\'' +
				", grntcrtfInstnNm='" + grntcrtfInstnNm + '\'' +
				", housdRgstAddr='" + housdRgstAddr + '\'' +
				", idCardTypCd='" + idCardTypCd + '\'' +
				", marrgSituationCd='" + marrgSituationCd + '\'' +
				", mobileNo='" + mobileNo + '\'' +
				", nmUsed='" + nmUsed + '\'' +
				", shrhdFlg='" + shrhdFlg + '\'' +
				", spsCrtfNo='" + spsCrtfNo + '\'' +
				", spsCrtfTypCd='" + spsCrtfTypCd + '\'' +
				", spsEngName='" + spsEngName + '\'' +
				", spsName='" + spsName + '\'' +
				", spsTelNo='" + spsTelNo + '\'' +
				", spsWorkUnitNm='" + spsWorkUnitNm + '\'' +
				", stateAndRgnCd='" + stateAndRgnCd + '\'' +
				", workUnitAddr='" + workUnitAddr + '\'' +
				", workUnitNm='" + workUnitNm + '\'' +
				'}';
    }
}
