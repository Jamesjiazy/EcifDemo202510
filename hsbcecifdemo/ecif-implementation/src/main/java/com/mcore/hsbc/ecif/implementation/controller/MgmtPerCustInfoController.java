package com.mcore.hsbc.ecif.implementation.controller;

import com.mcore.hsbc.ecif.api.service.MgmtPerCustInfoApiService;
import com.mcore.hsbc.ecif.api.service.request.MgmtPerCustInfoMgmtPerCustInfoRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
* 对私客户信息维护
*
*/
@RestController
@RequestMapping({"/app"})
public class MgmtPerCustInfoController {
   private static final Logger logger = LoggerFactory.getLogger(MgmtPerCustInfoController.class);

   @Resource
   private MgmtPerCustInfoApiService mgmtPerCustInfoApiService;

    @PostMapping({"/MgmtPerCustInfo"})
    public Object mgmtPerCustInfo(@RequestBody MgmtPerCustInfoMgmtPerCustInfoRequest request) {
        return mgmtPerCustInfoApiService.MgmtPerCustInfo(request);
    }
}
