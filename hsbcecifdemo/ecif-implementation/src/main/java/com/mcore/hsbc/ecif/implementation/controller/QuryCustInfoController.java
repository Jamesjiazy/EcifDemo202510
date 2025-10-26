package com.mcore.hsbc.ecif.implementation.controller;

import com.mcore.hsbc.ecif.api.service.QuryCustInfoApiService;
import com.mcore.hsbc.ecif.api.service.QuryPerCustNameListInfoByCustNoApiService;
import com.mcore.hsbc.ecif.api.service.request.QuryCustInfoQuryCustInfoRequest;
import com.mcore.hsbc.ecif.api.service.request.QuryPerCustNameListInfoByCustNoQuryPerCustNameListInfoByCustNoRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
* 客户基本信息查询
*
*/
@RestController
@RequestMapping({"/app"})
public class QuryCustInfoController {
   private static final Logger logger = LoggerFactory.getLogger(QuryCustInfoController.class);

   @Resource
   private QuryCustInfoApiService quryCustInfoApiService;

    @PostMapping({"/QuryCustInfo"})
    public Object quryCustInfo(@RequestBody QuryCustInfoQuryCustInfoRequest request) {
        return quryCustInfoApiService.QuryCustInfo(request);
    }
}
