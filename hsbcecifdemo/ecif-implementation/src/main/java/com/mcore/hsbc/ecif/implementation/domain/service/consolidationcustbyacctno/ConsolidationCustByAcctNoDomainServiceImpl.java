package com.mcore.hsbc.ecif.implementation.domain.service.consolidationcustbyacctno;

import com.mcore.hsbc.ecif.domain.repository.CustAcctInfoRepo;
import com.mcore.hsbc.ecif.domain.service.consolidationcustbyacctno.ConsolidationCustByAcctNoDomainService;
import com.mcore.hsbc.ecif.domain.service.consolidationcustbyacctno.input.ConsolidationCustByAcctNoInputDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ConsolidationCustByAcctNoDomainServiceImpl implements ConsolidationCustByAcctNoDomainService {
    public static final Logger logger = LoggerFactory.getLogger(ConsolidationCustByAcctNoDomainServiceImpl.class);

    private final CustAcctInfoRepo custAcctInfoRepo;

    public ConsolidationCustByAcctNoDomainServiceImpl(CustAcctInfoRepo custAcctInfoRepo) {
        this.custAcctInfoRepo = custAcctInfoRepo;
    }

    @Override
    public void execute(ConsolidationCustByAcctNoInputDTO infoInputDTO) {
        boolean exists = custAcctInfoRepo.existsValidByRouteValList(infoInputDTO.getTenantNo(), infoInputDTO.getUid(), infoInputDTO.getCustAcctNoList());
        if (!exists) {
            logger.warn("原客户路由信息不存在，无需归并");
        }
        custAcctInfoRepo.consolidationByCustAcctNo(infoInputDTO.getTenantNo(),
                infoInputDTO.getUid(),
                infoInputDTO.getCustAcctNoList(),
                infoInputDTO.getRouteTypCd(),
                infoInputDTO.getMergeCustNo(),
                infoInputDTO.getOperTelrNo());
    }
}
