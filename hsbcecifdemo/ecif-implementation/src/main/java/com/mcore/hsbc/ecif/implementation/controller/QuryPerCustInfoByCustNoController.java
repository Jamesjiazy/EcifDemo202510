package com.mcore.hsbc.ecif.implementation.controller;

import com.mcore.hsbc.ecif.api.service.QuryPerCustInfoByCustNoApiService;
import com.mcore.hsbc.ecif.api.service.QuryPerCustNameListInfoByCustNoApiService;
import com.mcore.hsbc.ecif.api.service.request.QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoRequest;
import com.mcore.hsbc.ecif.api.service.request.QuryPerCustNameListInfoByCustNoQuryPerCustNameListInfoByCustNoRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
* 根据客户编号查询个人客户信息
*
*/
@RestController
@RequestMapping({"/app"})
public class QuryPerCustInfoByCustNoController {
   private static final Logger logger = LoggerFactory.getLogger(QuryPerCustInfoByCustNoController.class);

   @Resource
   private QuryPerCustInfoByCustNoApiService quryPerCustInfoByCustNoApiService;

    @PostMapping({"/QuryPerCustInfoByCustNo"})
    public Object quryPerCustInfoByCustNo(@RequestBody QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoRequest request) {
        return quryPerCustInfoByCustNoApiService.QuryPerCustInfoByCustNo(request);
    }
}
