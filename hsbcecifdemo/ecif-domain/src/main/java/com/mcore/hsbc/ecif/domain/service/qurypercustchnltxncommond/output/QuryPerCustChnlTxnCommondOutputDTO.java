package com.mcore.hsbc.ecif.domain.service.qurypercustchnltxncommond.output;

import com.mcore.base.header.CoreAppRequestHeader;
import com.mcore.hsbc.ecif.domain.aggregate.bom1967754384486551553.entity.CustChnlTxnCommondInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class QuryPerCustChnlTxnCommondOutputDTO extends CoreAppRequestHeader {
    private static final long serialVersionUID = 411511266821701484L;
    private List<CustChnlTxnCommondInfo> custChnlTxnCommondInfoList;
}
