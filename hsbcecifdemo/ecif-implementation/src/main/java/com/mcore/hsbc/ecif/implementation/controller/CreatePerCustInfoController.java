package com.mcore.hsbc.ecif.implementation.controller;

import com.mcore.hsbc.ecif.api.service.CreatePerCustInfoApiService;
import com.mcore.hsbc.ecif.api.service.CrtPerCustInfoApiService;
import com.mcore.hsbc.ecif.api.service.request.CreatePerCustInfoCreatePerCustInfoRequest;
import com.mcore.hsbc.ecif.api.service.request.CrtPerCustInfoCrtPerCustInfoRequest;
import com.mcore.hsbc.ecif.api.service.response.CreatePerCustInfoCreatePerCustInfoResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
* 对私三要素开立客户
*
*/
@RestController
@RequestMapping({"/app"})
public class CreatePerCustInfoController {
   private static final Logger logger = LoggerFactory.getLogger(CreatePerCustInfoController.class);

   @Resource
   private CreatePerCustInfoApiService createPerCustInfoApiService;

    @PostMapping({"/CreatePerCustInfo"})
    public Object createPerCustInfo(@RequestBody CreatePerCustInfoCreatePerCustInfoRequest request) {
        CreatePerCustInfoCreatePerCustInfoResponse response = createPerCustInfoApiService.CreatePerCustInfo(request);
        return response;
    }
}
