package com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class CustChnlTxnCommondPO
        implements Serializable {
    private static final long serialVersionUID = 8497510803035418593L;
    /**
     * 主键id
     */
    private Long id;
    /**
     * 租户编号
     */
    private String tenantNo;
    /**
     * 年累计最大交易金额
     */
    private BigDecimal yrAccmMaxTxAmt;
    /**
     * 月累计最大交易金额
     */
    private BigDecimal monAccmMaxTxAmt;
    /**
     * 允许终端类型代码
     */
    private String pmitTerminalTypCd;
    /**
     * 限额类型代码
     */
    private String lmtTypCd;
    /**
     * 日累计最大交易金额
     */
    private BigDecimal dayAccmMaxTxAmt;
    /**
     * 月累计最大交易笔数
     */
    private Integer monAccmMaxTxStkcnt;
    /**
     * 日累计最大交易笔数
     */
    private Integer dayAccmMaxTxStkcnt;
    /**
     * 年累计最大交易笔数
     */
    private Integer yrAccmMaxTxStkcnt;
    /**
     * 单笔交易最高金额
     */
    private BigDecimal sglTxHighAmt;
    /**
     * 单笔交易最低金额
     */
    private BigDecimal sglTxLowestAmt;
    /**
     * 季累计最大交易笔数
     */
    private Integer qtAccmMaxTxStkcnt;
    /**
     * 季累计最大交易金额
     */
    private BigDecimal qtAccmMaxTxAmt;
    /**
     * 客户编号
     */
    private String custNo;
    /**
     * 原因
     */
    private String rsn;

    /**
     * 生效标志
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
     * 更新日期
     */
    private Date updTm;
    /**
     * 创建日期
     */
    private Date crtTm;
}