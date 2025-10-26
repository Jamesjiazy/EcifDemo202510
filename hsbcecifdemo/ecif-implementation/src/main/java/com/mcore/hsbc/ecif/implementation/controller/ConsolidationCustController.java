package com.mcore.hsbc.ecif.implementation.controller;

import com.mcore.hsbc.ecif.api.service.ConsolidationCustApiService;
import com.mcore.hsbc.ecif.api.service.request.ConsolidationCustExecuteRequest;
import com.mcore.hsbc.ecif.api.service.response.ConsolidationCustExecuteResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 客户归并
 */
@RestController
@RequestMapping("app")
public class ConsolidationCustController {

    public final ConsolidationCustApiService consolidationCustApiService;

    public ConsolidationCustController(ConsolidationCustApiService consolidationCustApiService) {
        this.consolidationCustApiService = consolidationCustApiService;
    }


    /**
     * 客户归并
     *
     * @param request
     * @return
     */
    @PostMapping("consolidationCust")
    public ConsolidationCustExecuteResponse execute(@RequestBody ConsolidationCustExecuteRequest request) {
        return consolidationCustApiService.execute(request);
    }
}
