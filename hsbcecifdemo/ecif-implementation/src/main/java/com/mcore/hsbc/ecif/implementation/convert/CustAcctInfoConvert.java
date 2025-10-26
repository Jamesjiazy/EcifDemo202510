package com.mcore.hsbc.ecif.implementation.convert;

import com.mcore.hsbc.ecif.api.service.model.CustAcctRouteInfo;
import com.mcore.hsbc.ecif.api.service.request.*;
import com.mcore.hsbc.ecif.api.service.response.MgmtCustAcctInfoExecuteResponse;
import com.mcore.hsbc.ecif.api.service.response.QuryCustAcctInfoByCustAcctExecuteResponse;
import com.mcore.hsbc.ecif.api.service.response.QuryCustAcctInfoByCustNoExecuteResponse;
import com.mcore.hsbc.ecif.domain.aggregate.bom1967754384486551553.entity.CustAcctInfo;
import com.mcore.hsbc.ecif.domain.service.consolidationcust.input.ConsolidationCustInputDTO;
import com.mcore.hsbc.ecif.domain.service.consolidationcustbyacctno.input.ConsolidationCustByAcctNoInputDTO;
import com.mcore.hsbc.ecif.domain.service.mgmtCustAcctInfo.input.MgmtCustAcctInfoInputDTO;
import com.mcore.hsbc.ecif.domain.service.mgmtCustAcctInfo.output.MgmtCustAcctInfoOutputDTO;
import com.mcore.hsbc.ecif.domain.service.qurycustacctinfobycustacct.input.QuryCustAcctInfoByCustAcctInputDTO;
import com.mcore.hsbc.ecif.domain.service.qurycustacctinfobycustacct.output.QuryCustAcctInfoByCustAcctOutputDTO;
import com.mcore.hsbc.ecif.domain.service.qurycustacctinfobycustno.input.QuryCustAcctInfoByCustNoInputDTO;
import com.mcore.hsbc.ecif.domain.service.qurycustacctinfobycustno.output.QuryCustAcctInfoByCustNoOutputDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustAcctInfoConvert {
    CustAcctInfoConvert INSTANCE = Mappers.getMapper(CustAcctInfoConvert.class);

    /**
     * request转input
     *
     * @param request
     * @return
     */
    MgmtCustAcctInfoInputDTO covertInputDto(MgmtCustAcctInfoExecuteRequest request);


    /**
     * output转response
     *
     * @param output
     * @return
     */
    MgmtCustAcctInfoExecuteResponse covertInputDto(MgmtCustAcctInfoOutputDTO output);

    /**
     * input转po
     *
     * @param infoInputDTO
     * @return
     */
    @Mapping(source = "operTelrNo", target = "crtTelrNo")
    @Mapping(source = "operTelrNo", target = "updTelrNo")
    CustAcctInfo covertInputDto(MgmtCustAcctInfoInputDTO infoInputDTO);

    QuryCustAcctInfoByCustNoInputDTO covertInputDto(QuryCustAcctInfoByCustNoExecuteRequest request);

    QuryCustAcctInfoByCustAcctInputDTO covertInputDto(QuryCustAcctInfoByCustAcctExecuteRequest request);

    @Mapping(source = "custAcctInfoList", target = "custAcctRouteInfoList")
    QuryCustAcctInfoByCustAcctExecuteResponse covertOutputDto(QuryCustAcctInfoByCustAcctOutputDTO outputDTO);

    @Mapping(source = "custAcctInfoList", target = "custAcctRouteInfoList")
    QuryCustAcctInfoByCustNoExecuteResponse covertOutputDto(QuryCustAcctInfoByCustNoOutputDTO outputDTO);

    CustAcctRouteInfo covertOutputDto(CustAcctInfo custAcctInfo);

    QuryCustAcctInfoByCustNoExecuteResponse covertInputDto(QuryCustAcctInfoByCustNoOutputDTO outputDTO);

    /**
     * input转po
     *
     * @param infoInputDTO
     * @return
     */
    @Mapping(source = "operTelrNo", target = "crtTelrNo")
    @Mapping(source = "operTelrNo", target = "updTelrNo")
    CustAcctInfo covertInputDto(QuryCustAcctInfoByCustAcctInputDTO infoInputDTO);

    @Mapping(source = "operTelrNo", target = "crtTelrNo")
    @Mapping(source = "operTelrNo", target = "updTelrNo")
    CustAcctInfo covertInputDto(QuryCustAcctInfoByCustNoInputDTO input);

    CustAcctInfo covertInputDto(ConsolidationCustInputDTO infoInputDTO);

    ConsolidationCustInputDTO covertInputDto(ConsolidationCustExecuteRequest request);

    @Mapping(source = "operTelrNo", target = "updTelrNo")
    ConsolidationCustByAcctNoInputDTO covertInputDto(ConsolidationCustByAcctNoExecuteRequest request);
}
