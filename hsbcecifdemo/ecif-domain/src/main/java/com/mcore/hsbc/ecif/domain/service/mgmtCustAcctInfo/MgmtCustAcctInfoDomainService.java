package com.mcore.hsbc.ecif.domain.service.mgmtCustAcctInfo;

import com.mcore.hsbc.ecif.domain.service.mgmtCustAcctInfo.input.MgmtCustAcctInfoInputDTO;

public interface MgmtCustAcctInfoDomainService {
    void save(MgmtCustAcctInfoInputDTO infoInputDTO);

    void update(MgmtCustAcctInfoInputDTO infoInputDTO);

    void delete(MgmtCustAcctInfoInputDTO infoInputDTO);
}
