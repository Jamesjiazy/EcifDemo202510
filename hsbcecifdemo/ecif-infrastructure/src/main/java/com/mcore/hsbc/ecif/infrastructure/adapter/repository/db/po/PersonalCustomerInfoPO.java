package com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class PersonalCustomerInfoPO {
    private String tenantNo;           // 租户编号
    private Long id;                   // 个人客户信息表ID
    private String custNo;             // 客户编号
    private String custEngNm;          // 客户英文名称
    private String nmUsed;             // 曾用名
    private String genderCd;           // 性别代码
    private String ethnicCd;           // 民族代码
    private String careerTypCd;        // 职业类型代码
    private String housdRgstAddr;      // 户籍地址
    private String eMail;              // 电子邮箱
    private LocalDate birthDt;         // 出生日期
    private String edctbkgCd;          // 学历代码
    private String aceDegreeCd;        // 学位代码
    private String workUnitNm;         // 工作单位名称
    private String workUnitAddr;       // 工作单位地址
    private String idCardTypCd;        // 身份证类型代码
    private String grntcrtfInstnNm;    // 发证机关名称
    private String adminCmprmntCd;     // 行政区划代码
    private String marrgSituationCd;   // 婚姻状况代码
    private String spsName;            // 配偶姓名
    private String spsEngName;         // 配偶英文姓名
    private String spsCrtfTypCd;       // 配偶证件类型代码
    private String spsCrtfNo;          // 配偶证件号码
    private String spsWorkUnitNm;      // 配偶工作单位名称
    private String spsTelNo;           // 配偶电话号码
    private String validFlg;           // 有效标志
    private String crtTelrNo;          // 创建柜员号
    private String updTelrNo;          // 更新柜员号
    private LocalDateTime crtTm;       // 创建时间
    private LocalDateTime updTm;       // 更新时间

}
