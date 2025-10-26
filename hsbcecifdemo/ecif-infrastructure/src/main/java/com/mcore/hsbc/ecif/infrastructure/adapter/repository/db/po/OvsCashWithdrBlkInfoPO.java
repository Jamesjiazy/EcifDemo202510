package com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OvsCashWithdrBlkInfoPO {

    /**
     * id
     */
    private Long id;

    /**
     * UID
     */
    private String uid;

    /**
     * 租户编号
     */
    private String tenantNo;

    /**
     * 证件号码
     */
    private String crtfNo;

    /**
     * 证件类型代码
     */
    private String crtfTypCd;

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
