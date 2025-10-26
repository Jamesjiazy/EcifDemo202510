package com.mcore.hsbc.ecif.implementation.api.mock.service;

import com.mcore.hsbc.ecif.api.service.request.QuryPerCustChnlTxnCommondRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MockQuryPerCustChnlTxnCommondApiServiceImplTest
    extends BaseTest
{
    @Autowired
    private MockQuryPerCustChnlTxnCommondApiServiceImpl mockQuryPerCustChnlTxnCommondApiServiceImpl;

    @Test
    public void execute() {
        QuryPerCustChnlTxnCommondRequest request = new QuryPerCustChnlTxnCommondRequest();
        mockQuryPerCustChnlTxnCommondApiServiceImpl.execute(request);
    }
}
