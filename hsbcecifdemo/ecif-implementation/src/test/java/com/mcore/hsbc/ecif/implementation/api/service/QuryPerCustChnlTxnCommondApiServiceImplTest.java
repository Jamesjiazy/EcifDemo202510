package com.mcore.hsbc.ecif.implementation.api.service;

import com.mcore.hsbc.ecif.api.service.request.QuryPerCustChnlTxnCommondRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class QuryPerCustChnlTxnCommondApiServiceImplTest
    extends BaseTest
{
    @Autowired
    private QuryPerCustChnlTxnCommondApiServiceImpl quryPerCustChnlTxnCommondApiServiceImpl;

    @Test
    public void execute() {
        QuryPerCustChnlTxnCommondRequest request = new QuryPerCustChnlTxnCommondRequest();
        quryPerCustChnlTxnCommondApiServiceImpl.execute(request);
    }
}
