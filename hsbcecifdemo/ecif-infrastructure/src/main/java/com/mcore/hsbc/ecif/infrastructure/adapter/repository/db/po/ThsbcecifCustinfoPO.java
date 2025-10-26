package com.mcore.hsbc.ecif.infrastructure.adapter.repository.db.po;

import lombok.Data;

@Data
public class ThsbcecifCustinfoPO {
    /**
     * 客户编号
     */
    private String custNo;
    /**
     * 客户类型代码
     */
    private String custTypCd;
}
