package com.mcore.hsbc.ecif.implementation.domain.servicequrysignrelationinfo;

import com.mcore.hsbc.ecif.domain.service.qurysignrelationinfo.QurySignRelationInfoDomainService;
import com.mcore.hsbc.ecif.domain.service.qurysignrelationinfo.input.QurySignRelationInfoInputDTO;
import com.mcore.hsbc.ecif.domain.service.qurysignrelationinfo.output.QurySignRelationInfoOutputDTO;
import org.springframework.stereotype.Service;

@Service
public class QurySignRelationInfoDomainServiceImpl implements QurySignRelationInfoDomainService {
    /**
     * 暂定直接返回
     *
     * @param infoInputDTO
     * @return
     */
    @Override
    public QurySignRelationInfoOutputDTO execute(QurySignRelationInfoInputDTO infoInputDTO) {
        return new QurySignRelationInfoOutputDTO();
    }
}
