package com.mcore.hsbc.ecif.implementation.domain.service.consolidationcust;

import com.mcore.hsbc.ecif.domain.aggregate.bom1967754384486551553.entity.CustAcctInfo;
import com.mcore.hsbc.ecif.domain.repository.CustAcctInfoRepo;
import com.mcore.hsbc.ecif.domain.service.consolidationcust.ConsolidationCustDomainService;
import com.mcore.hsbc.ecif.domain.service.consolidationcust.input.ConsolidationCustInputDTO;
import com.mcore.hsbc.ecif.implementation.convert.CustAcctInfoConvert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ConsolidationCustDomainServiceImpl implements ConsolidationCustDomainService {
    public static final Logger logger = LoggerFactory.getLogger(ConsolidationCustDomainServiceImpl.class);

    private final CustAcctInfoRepo custAcctInfoRepo;

    public ConsolidationCustDomainServiceImpl(CustAcctInfoRepo custAcctInfoRepo) {
        this.custAcctInfoRepo = custAcctInfoRepo;
    }

    @Override
    public void execute(ConsolidationCustInputDTO infoInputDTO) {
        CustAcctInfo custAcctInfo = CustAcctInfoConvert.INSTANCE.covertInputDto(infoInputDTO);
        boolean exists = custAcctInfoRepo.existsValidByCustNo(custAcctInfo);
        if (!exists) {
           logger.warn("原客户路由信息不存在，无需归并");
        }
        custAcctInfoRepo.consolidation(custAcctInfo, infoInputDTO.getMergeCustNo());

    }
}
