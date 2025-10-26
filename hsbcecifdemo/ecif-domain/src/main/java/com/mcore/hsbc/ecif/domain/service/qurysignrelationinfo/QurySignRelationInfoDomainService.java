package com.mcore.hsbc.ecif.domain.service.qurysignrelationinfo;

import com.mcore.hsbc.ecif.domain.service.qurysignrelationinfo.input.QurySignRelationInfoInputDTO;
import com.mcore.hsbc.ecif.domain.service.qurysignrelationinfo.output.QurySignRelationInfoOutputDTO;

public interface QurySignRelationInfoDomainService {
    /**
     * 客户签约关系查询
     *
     * @param infoInputDTO
     * @return
     */
    QurySignRelationInfoOutputDTO execute(QurySignRelationInfoInputDTO infoInputDTO);
}
