package com.mcore.hsbc.ecif.implementation.controller;

import com.mcore.hsbc.ecif.api.service.QuryCustTypeApiService;
import com.mcore.hsbc.ecif.api.service.QuryPerCustNameListInfoByCustNoApiService;
import com.mcore.hsbc.ecif.api.service.request.QuryCustTypeQuryCustTypeRequest;
import com.mcore.hsbc.ecif.api.service.request.QuryPerCustNameListInfoByCustNoQuryPerCustNameListInfoByCustNoRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
* 客户类型查询
*
*/
@RestController
@RequestMapping({"/app"})
public class QuryCustTypeController {
   private static final Logger logger = LoggerFactory.getLogger(QuryCustTypeController.class);

   @Resource
   private QuryCustTypeApiService quryCustTypeApiService;

    @PostMapping({"/QuryCustType"})
    public Object quryCustType(@RequestBody QuryCustTypeQuryCustTypeRequest request) {
        return quryCustTypeApiService.QuryCustType(request);
    }
}
