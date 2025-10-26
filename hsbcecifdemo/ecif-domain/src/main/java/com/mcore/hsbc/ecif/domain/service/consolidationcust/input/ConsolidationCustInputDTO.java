package com.mcore.hsbc.ecif.domain.service.consolidationcust.input;

import com.mcore.base.header.CoreAppRequestHeader;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ConsolidationCustInputDTO extends CoreAppRequestHeader {
    /**
     * 并入客户编号
     */
    private String mergeCustNo;
}
