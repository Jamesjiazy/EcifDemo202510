package com.mcore.hsbc.ecif.domain.aggregate.bom1967754384486551553.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号：head
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:51
 * <br>    程序功能：客户信息
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 */
@Data
public class CustAcctInfo
        implements Serializable {
    private static final long serialVersionUID = -2097006901014098892L;
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
