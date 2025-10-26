package com.mcore.hsbc.ecif.implementation.convert;

import com.mcore.hsbc.ecif.api.service.response.QurySignRelationInfoExecuteResponse;
import com.mcore.hsbc.ecif.domain.service.qurysignrelationinfo.output.QurySignRelationInfoOutputDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SignRelationInfoConvert {
    SignRelationInfoConvert INSTANCE = Mappers.getMapper(SignRelationInfoConvert.class);

    QurySignRelationInfoExecuteResponse convertToResponse(QurySignRelationInfoOutputDTO qurySignRelationInfoOutputDTO);
}
