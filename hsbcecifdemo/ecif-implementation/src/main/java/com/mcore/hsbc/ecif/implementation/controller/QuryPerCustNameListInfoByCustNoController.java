package com.mcore.hsbc.ecif.implementation.controller;

import com.mcore.hsbc.ecif.api.service.MgmtPerCustInfoApiService;
import com.mcore.hsbc.ecif.api.service.QuryPerCustNameListInfoByCustNoApiService;
import com.mcore.hsbc.ecif.api.service.request.MgmtPerCustInfoMgmtPerCustInfoRequest;
import com.mcore.hsbc.ecif.api.service.request.QuryPerCustNameListInfoByCustNoQuryPerCustNameListInfoByCustNoRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
* 对私客户名单信息查询
*
*/
@RestController
@RequestMapping({"/app"})
public class QuryPerCustNameListInfoByCustNoController {
   private static final Logger logger = LoggerFactory.getLogger(QuryPerCustNameListInfoByCustNoController.class);

   @Resource
   private QuryPerCustNameListInfoByCustNoApiService quryPerCustNameListInfoByCustNoApiService;

    @PostMapping({"/QuryPerCustNameListInfoByCustNo"})
    public Object quryPerCustNameListInfoByCustNo(@RequestBody QuryPerCustNameListInfoByCustNoQuryPerCustNameListInfoByCustNoRequest request) {
        return quryPerCustNameListInfoByCustNoApiService.QuryPerCustNameListInfoByCustNo(request);
    }
}
