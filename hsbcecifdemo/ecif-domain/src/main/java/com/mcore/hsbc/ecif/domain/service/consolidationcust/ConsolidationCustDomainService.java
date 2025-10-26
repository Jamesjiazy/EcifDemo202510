package com.mcore.hsbc.ecif.domain.service.consolidationcust;

import com.mcore.hsbc.ecif.domain.service.consolidationcust.input.ConsolidationCustInputDTO;

public interface ConsolidationCustDomainService {
    void execute(ConsolidationCustInputDTO infoInputDTO);
}
