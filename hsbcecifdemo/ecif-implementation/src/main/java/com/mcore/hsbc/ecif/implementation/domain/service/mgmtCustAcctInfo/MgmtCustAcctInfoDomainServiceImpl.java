package com.mcore.hsbc.ecif.implementation.domain.service.mgmtCustAcctInfo;

import com.mcore.hsbc.ecif.domain.aggregate.bom1967754384486551553.entity.CustAcctInfo;
import com.mcore.hsbc.ecif.domain.repository.CustAcctInfoRepo;
import com.mcore.hsbc.ecif.domain.service.mgmtCustAcctInfo.MgmtCustAcctInfoDomainService;
import com.mcore.hsbc.ecif.domain.service.mgmtCustAcctInfo.input.MgmtCustAcctInfoInputDTO;
import com.mcore.hsbc.ecif.implementation.convert.CustAcctInfoConvert;
import com.mcore.hsbc.ecif.infrastructure.enums.ErrorCodeEnum;
import com.mcore.hsbc.ecif.infrastructure.exception.ECIFException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MgmtCustAcctInfoDomainServiceImpl implements MgmtCustAcctInfoDomainService {
    public static final Logger logger = LoggerFactory.getLogger(MgmtCustAcctInfoDomainServiceImpl.class);

    private final CustAcctInfoRepo custAcctInfoRepo;

    public MgmtCustAcctInfoDomainServiceImpl(CustAcctInfoRepo custAcctInfoRepo) {
        this.custAcctInfoRepo = custAcctInfoRepo;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(MgmtCustAcctInfoInputDTO infoInputDTO) {
        CustAcctInfo custAcctInfo = CustAcctInfoConvert.INSTANCE.covertInputDto(infoInputDTO);
        boolean exists = custAcctInfoRepo.existsValidByCustNo(custAcctInfo);
        if (exists) {
            int rc = custAcctInfoRepo.update(custAcctInfo);
            if (rc != 1) throw new ECIFException(ErrorCodeEnum.E12196, "更新客户路由失败");
        } else {
            int rc = custAcctInfoRepo.save(custAcctInfo);
            if (rc != 1) throw new ECIFException(ErrorCodeEnum.E12196, "新增客户路由失败");
        }

    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(MgmtCustAcctInfoInputDTO infoInputDTO) {
        int update = custAcctInfoRepo.update(CustAcctInfoConvert.INSTANCE.covertInputDto(infoInputDTO));
        if (update != 1) {
            throw new ECIFException(ErrorCodeEnum.E12196, "更新客户路由失败");
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(MgmtCustAcctInfoInputDTO infoInputDTO) {
        int update = custAcctInfoRepo.delete(CustAcctInfoConvert.INSTANCE.covertInputDto(infoInputDTO));
        if (update != 1) {
            throw new ECIFException(ErrorCodeEnum.E12196, "删除客户路由失败");
        }
    }
}
