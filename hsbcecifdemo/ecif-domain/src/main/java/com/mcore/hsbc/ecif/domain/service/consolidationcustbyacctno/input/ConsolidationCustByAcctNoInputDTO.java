package com.mcore.hsbc.ecif.domain.service.consolidationcustbyacctno.input;

import com.mcore.base.header.CoreAppRequestHeader;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class ConsolidationCustByAcctNoInputDTO extends CoreAppRequestHeader {
    /**
     * 账号字符串集合
     */
    private List<String> custAcctNoList;
    /**
     * 并入客户编号
     */
    private String mergeCustNo;
    /**
     * 路由类型代码
     */
    private String routeTypCd;
    /**
     * 更新柜员号
     */
    private String updTelrNo;
}
