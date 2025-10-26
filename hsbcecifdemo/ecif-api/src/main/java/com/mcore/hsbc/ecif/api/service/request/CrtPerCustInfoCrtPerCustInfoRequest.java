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
 * <br>    程序功能：对私客户信息开立-入参
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class CrtPerCustInfoCrtPerCustInfoRequest
    extends CoreAppRequestHeader
{
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
     * 职业类型代码
     */
    @JsonProperty("careerTypCd")
    private String careerTypCd;
    /**
     * 证件发放日期
     */
    @JsonProperty("crtfGrantDt")
    @JsonDeserialize(using = DateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonSerialize(using = DateSerializer.class)
    private Date crtfGrantDt;
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
     * 客户名称
     */
    @JsonProperty("custNm")
    private String custNm;
    /**
     * 员工标志
     */
    @JsonProperty("emplyFlg")
    private String emplyFlg;
    /**
     * 性别代码
     */
    @JsonProperty("genderCd")
    private String genderCd;
    /**
     * 通行证证件号码
     */
    @JsonProperty("passCrtfNo")
    private String passCrtfNo;
    /**
     * 换证次数
     */
    @JsonProperty("renewalTms")
    private Integer renewalTms;
    /**
     * 预留手机号码
     */
    @JsonProperty("rsvdMobileNo")
    private String rsvdMobileNo;
    /**
     * 国家和地区代码
     */
    @JsonProperty("stateAndRgnCd")
    private String stateAndRgnCd;

    public CrtPerCustInfoCrtPerCustInfoRequest() {
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

    public void setCrtfGrantDt(Date crtfGrantDt) {
        this.crtfGrantDt = crtfGrantDt;
    }

    public Date getCrtfGrantDt() {
        return this.crtfGrantDt;
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

    public void setCustNm(String custNm) {
        this.custNm = custNm;
    }

    public String getCustNm() {
        return this.custNm;
    }

    public void setEmplyFlg(String emplyFlg) {
        this.emplyFlg = emplyFlg;
    }

    public String getEmplyFlg() {
        return this.emplyFlg;
    }

    public void setGenderCd(String genderCd) {
        this.genderCd = genderCd;
    }

    public String getGenderCd() {
        return this.genderCd;
    }

    public void setPassCrtfNo(String passCrtfNo) {
        this.passCrtfNo = passCrtfNo;
    }

    public String getPassCrtfNo() {
        return this.passCrtfNo;
    }

    public void setRenewalTms(Integer renewalTms) {
        this.renewalTms = renewalTms;
    }

    public Integer getRenewalTms() {
        return this.renewalTms;
    }

    public void setRsvdMobileNo(String rsvdMobileNo) {
        this.rsvdMobileNo = rsvdMobileNo;
    }

    public String getRsvdMobileNo() {
        return this.rsvdMobileNo;
    }

    public void setStateAndRgnCd(String stateAndRgnCd) {
        this.stateAndRgnCd = stateAndRgnCd;
    }

    public String getStateAndRgnCd() {
        return this.stateAndRgnCd;
    }

    @Override
    public String toString() {
        return "CrtPerCustInfoCrtPerCustInfoRequest{" +
				"addr='" + addr + '\'' +
				", adminCmprmntCd='" + adminCmprmntCd + '\'' +
				", careerTypCd='" + careerTypCd + '\'' +
				", crtfGrantDt=" + crtfGrantDt +
				", crtfMatrDt=" + crtfMatrDt +
				", crtfNo='" + crtfNo + '\'' +
				", crtfTypCd='" + crtfTypCd + '\'' +
				", custNm='" + custNm + '\'' +
				", emplyFlg='" + emplyFlg + '\'' +
				", genderCd='" + genderCd + '\'' +
				", passCrtfNo='" + passCrtfNo + '\'' +
				", renewalTms=" + renewalTms +
				", rsvdMobileNo='" + rsvdMobileNo + '\'' +
				", stateAndRgnCd='" + stateAndRgnCd + '\'' +
				'}';
    }
}
