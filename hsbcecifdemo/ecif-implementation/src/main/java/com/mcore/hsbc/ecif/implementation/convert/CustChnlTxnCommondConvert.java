package com.mcore.hsbc.ecif.implementation.convert;

import com.mcore.hsbc.ecif.api.service.model.CustChnlTxnCommondApiMd;
import com.mcore.hsbc.ecif.api.service.request.QuryPerCustChnlTxnCommondRequest;
import com.mcore.hsbc.ecif.api.service.response.QuryPerCustChnlTxnCommondExecuteResponse;
import com.mcore.hsbc.ecif.domain.aggregate.bom1967754384486551553.entity.CustChnlTxnCommondInfo;
import com.mcore.hsbc.ecif.domain.service.qurypercustchnltxncommond.input.QuryPerCustChnlTxnCommondInputDTO;
import com.mcore.hsbc.ecif.domain.service.qurypercustchnltxncommond.output.QuryPerCustChnlTxnCommondOutputDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustChnlTxnCommondConvert {
    CustChnlTxnCommondConvert INSTANCE = Mappers.getMapper(CustChnlTxnCommondConvert.class);

    QuryPerCustChnlTxnCommondInputDTO convertInput(QuryPerCustChnlTxnCommondRequest request);

    @Mapping(source = "custChnlTxnCommondInfoList", target = "custTxnChnlLmtList")
    QuryPerCustChnlTxnCommondExecuteResponse convertResponse(QuryPerCustChnlTxnCommondOutputDTO outputDTO);

    CustChnlTxnCommondInfo covertInfo(QuryPerCustChnlTxnCommondInputDTO infoInputDTO);

    CustChnlTxnCommondApiMd covertVO(CustChnlTxnCommondInfo custChnlTxnCommondInfo);
}
