package com.mcore.hsbc.ecif.implementation.controller;

import com.mcore.hsbc.ecif.api.service.QurySignRelationInfoApiService;
import com.mcore.hsbc.ecif.api.service.request.QurySignRelationInfoExecuteRequest;
import com.mcore.hsbc.ecif.api.service.response.QurySignRelationInfoExecuteResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 客户签约关系查询
 */
@RestController
@RequestMapping("app")
public class QurySignRelationInfoExecuteController {

    public final QurySignRelationInfoApiService qurySignRelationInfoApiService;

    public QurySignRelationInfoExecuteController(QurySignRelationInfoApiService qurySignRelationInfoApiService) {
        this.qurySignRelationInfoApiService = qurySignRelationInfoApiService;
    }


    /**
     * 客户签约关系查询
     *
     * @param request
     * @return
     */
    @PostMapping("QurySignRelationInfo")
    public QurySignRelationInfoExecuteResponse execute(@RequestBody QurySignRelationInfoExecuteRequest request) {
        return qurySignRelationInfoApiService.execute(request);
    }
}
