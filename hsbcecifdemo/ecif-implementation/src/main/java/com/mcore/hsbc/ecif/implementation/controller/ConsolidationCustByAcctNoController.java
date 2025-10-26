package com.mcore.hsbc.ecif.implementation.controller;

import com.mcore.hsbc.ecif.api.service.ConsolidationCustByAcctNoApiService;
import com.mcore.hsbc.ecif.api.service.request.ConsolidationCustByAcctNoExecuteRequest;
import com.mcore.hsbc.ecif.api.service.response.ConsolidationCustByAcctNoExecuteResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 客户归并-单账号
 */
@RestController
@RequestMapping("app")
public class ConsolidationCustByAcctNoController {

    public final ConsolidationCustByAcctNoApiService consolidationCustByAcctNoApiService;

    public ConsolidationCustByAcctNoController(ConsolidationCustByAcctNoApiService consolidationCustByAcctNoApiService) {
        this.consolidationCustByAcctNoApiService = consolidationCustByAcctNoApiService;
    }


    /**
     * 客户归并-单账号
     *
     * @param request
     * @return
     */
    @PostMapping("consolidationCustByAcctNo")
    public ConsolidationCustByAcctNoExecuteResponse execute(@RequestBody ConsolidationCustByAcctNoExecuteRequest request) {
        return consolidationCustByAcctNoApiService.execute(request);
    }
}
