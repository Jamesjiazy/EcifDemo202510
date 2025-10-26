package com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class CustomerBasicInfoPO {
    /** 租户编号 */
    private String tenantNo;

    /** 客户基本信息表ID */
    private Long id;

    /** 客户编号 */
    private String custNo;

    /** 客户级别代码 */
    private String custLvlCd;

    /** 客户类型代码 */
    private String custTypCd;

    /** 证件类型代码 */
    private String crtfTypCd;

    /** 证件号码 */
    private String crtfNo;

    /** 客户名称 */
    private String custNm;

    /** 证件发放日期 */
    private LocalDate crtfGrantDt;

    /** 证件到期日期 */
    private LocalDate crtfMatrDt;

    /** 境内外标志代码 */
    private String domOversFlgCd;

    /** 国家和地区代码 */
    private String stateAndRgnCd;

    /** 地址 */
    private String addr;

    /** 预留手机号码 */
    private String rsvdMobileNo;

    /** 员工标志 */
    private String emplyFlg;

    /** 股东标志 */
    private String shrhdFlg;

    /** 客户经理员工号 */
    private String grntcrtfInstnNm;

    /** 有效标志 */
    private String validFlg;

    /** 创建柜员号 */
    private String crtTelrNo;

    /** 更新柜员号 */
    private String updTelrNo;

    /** 创建时间 */
    private LocalDateTime crtTm;

    /** 更新时间 */
    private LocalDateTime updTm;

}
