package com.mcore.hsbc.ecif.implementation.controller;

import com.mcore.hsbc.ecif.api.service.QuryPerCustNameListInfoByCustNoApiService;
import com.mcore.hsbc.ecif.api.service.QuryPerCustRiskLevelApiService;
import com.mcore.hsbc.ecif.api.service.request.QuryPerCustNameListInfoByCustNoQuryPerCustNameListInfoByCustNoRequest;
import com.mcore.hsbc.ecif.api.service.request.QuryPerCustRiskLevelQuryPerCustRiskLevelRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
* 对私客户风险等级信息查询
*
*/
@RestController
@RequestMapping({"/app"})
public class QuryPerCustRiskLevelController {
   private static final Logger logger = LoggerFactory.getLogger(QuryPerCustRiskLevelController.class);

   @Resource
   private QuryPerCustRiskLevelApiService quryPerCustRiskLevelApiService;

    @PostMapping({"/QuryPerCustRiskLevel"})
    public Object quryPerCustRiskLevel(@RequestBody QuryPerCustRiskLevelQuryPerCustRiskLevelRequest request) {
        return quryPerCustRiskLevelApiService.QuryPerCustRiskLevel(request);
    }
}
