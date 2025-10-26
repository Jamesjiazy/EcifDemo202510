package com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class PersonalCustomerListInfoPO {
    /**
     * 租户编号
     */
    private String tenantNo;

    /**
     * 个人客户名单信息表ID
     */
    private Long id;

    /**
     * 客户编号
     */
    private String custNo;

    /**
     * 证件类型代码
     */
    private String crtfTypCd;

    /**
     * 证件号码
     */
    private String crtfNo;

    /**
     * 名单类型
     */
    private String nmSnglTypCd;

    /**
     * 数据来源
     */
    private String dataSorcCd;

    /**
     * 机构区分编码
     */
    private String orgDismnCd;

    /**
     * 控制标志
     */
    private String ctrlFlg;

    /**
     * 检查标志
     */
    private String chkFlgCd;

    /**
     * 生效日期
     */
    private LocalDate efftDt;

    /**
     * 生效时间
     */
    private LocalDateTime efftTm;

    /**
     * 失效日期
     */
    private LocalDate invalidDt;

    /**
     * 失效时间
     */
    private LocalDateTime invalidTm;

    /**
     * 有效标志
     */
    private String validFlg;

    /**
     * 创建柜员号
     */
    private String crtTelrNo;

    /**
     * 更新柜员号
     */
    private String updTelrNo;

    /**
     * 创建时间
     */
    private LocalDateTime crtTm;

    /**
     * 更新时间
     */
    private LocalDateTime updTm;

}
