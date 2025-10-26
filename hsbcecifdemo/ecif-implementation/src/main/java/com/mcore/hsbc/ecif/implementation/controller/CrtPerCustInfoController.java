package com.mcore.hsbc.ecif.implementation.controller;

import com.mcore.hsbc.ecif.api.service.CrtPerCustInfoApiService;
import com.mcore.hsbc.ecif.api.service.QuryPerCustNameListInfoByCustNoApiService;
import com.mcore.hsbc.ecif.api.service.request.CrtPerCustInfoCrtPerCustInfoRequest;
import com.mcore.hsbc.ecif.api.service.request.QuryPerCustNameListInfoByCustNoQuryPerCustNameListInfoByCustNoRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
* 对私客户信息开立
*
*/
@RestController
@RequestMapping({"/app"})
public class CrtPerCustInfoController {
   private static final Logger logger = LoggerFactory.getLogger(CrtPerCustInfoController.class);

   @Resource
   private CrtPerCustInfoApiService crtPerCustInfoApiService;

    @PostMapping({"/CrtPerCustInfo"})
    public Object crtPerCustInfo(@RequestBody CrtPerCustInfoCrtPerCustInfoRequest request) {
        return crtPerCustInfoApiService.CrtPerCustInfo(request);
    }
}
