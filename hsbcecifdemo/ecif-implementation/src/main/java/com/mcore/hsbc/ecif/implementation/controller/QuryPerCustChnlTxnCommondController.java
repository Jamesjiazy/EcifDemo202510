package com.mcore.hsbc.ecif.implementation.controller;

import com.mcore.hsbc.ecif.api.service.QuryPerCustChnlTxnCommondApiService;
import com.mcore.hsbc.ecif.api.service.request.QuryPerCustChnlTxnCommondRequest;
import com.mcore.hsbc.ecif.api.service.response.QuryPerCustChnlTxnCommondExecuteResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 对私客户交易渠道控制查询
 */
@RestController
@RequestMapping({"/app"})
public class QuryPerCustChnlTxnCommondController {
    private static final Logger logger = LoggerFactory.getLogger(QuryPerCustChnlTxnCommondController.class);

    @Resource
    private QuryPerCustChnlTxnCommondApiService quryPerCustChnlTxnCommondApiService;

    /**
     * 对私客户交易渠道控制查询
     *
     * @param request
     * @return
     */
    @PostMapping({"/QuryPerCustChnlTxnCommond"})
    public QuryPerCustChnlTxnCommondExecuteResponse quryCustInfo(@RequestBody QuryPerCustChnlTxnCommondRequest request) {
        return quryPerCustChnlTxnCommondApiService.execute(request);
    }
}
