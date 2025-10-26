package com.mcore.hsbc.ecif.domain.service.qurypercustchnltxncommond;

import com.mcore.hsbc.ecif.domain.service.qurypercustchnltxncommond.input.QuryPerCustChnlTxnCommondInputDTO;
import com.mcore.hsbc.ecif.domain.service.qurypercustchnltxncommond.output.QuryPerCustChnlTxnCommondOutputDTO;

public interface QuryPerCustChnlTxnCommondDomainService {
    /**
     * 客户签约关系查询
     *
     * @param infoInputDTO
     * @return
     */
    QuryPerCustChnlTxnCommondOutputDTO execute(QuryPerCustChnlTxnCommondInputDTO infoInputDTO);
}
