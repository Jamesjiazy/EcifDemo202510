package com.mcore.hsbc.ecif.domain.service.mgmtCustAcctInfo.input;

import com.mcore.base.header.CoreAppRequestHeader;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class MgmtCustAcctInfoInputDTO extends CoreAppRequestHeader {
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
}
