package com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CustAcctInfoPO
        implements Serializable {
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
     * 可售产品编号
     */
    private String afsProdtNo;
    /**
     * 基础产品编号
     */
    private String baseProdtNo;
    /**
     * 主账号
     */
    private String mainAcctNo;
    /**
     * 操作类型代码
     */
    private String operTypCd;
    /**
     * 关联序号
     */
    private String relaSeqNo;
    /**
     * 路由类型代码
     */
    private String routeTypCd;
    /**
     * 路由值
     */
    private String routeVal;
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