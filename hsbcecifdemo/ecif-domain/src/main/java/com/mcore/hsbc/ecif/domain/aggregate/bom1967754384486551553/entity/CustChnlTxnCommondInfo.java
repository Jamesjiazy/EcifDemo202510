package com.mcore.hsbc.ecif.domain.aggregate.bom1967754384486551553.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号：head
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:51
 * <br>    程序功能：渠道控制信息-领域资源接口类
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * <br>    关联的表：customer_channel_txn_control_info
 */
@Data
public class CustChnlTxnCommondInfo implements Serializable {

    private static final long serialVersionUID = 2106842984330304046L;
    /**
     * 主键id
     */
    private Long id;
    /**
     * 租户编号
     */
    private String tenantNo;
    /**
     * 客户号
     */
    private String custNo;
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
    /*
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
