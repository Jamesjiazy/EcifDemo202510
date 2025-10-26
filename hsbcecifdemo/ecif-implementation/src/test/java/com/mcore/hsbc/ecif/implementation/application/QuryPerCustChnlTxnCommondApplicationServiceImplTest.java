package com.mcore.hsbc.ecif.implementation.application;

import com.mcore.hsbc.ecif.api.service.request.QuryPerCustChnlTxnCommondRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class QuryPerCustChnlTxnCommondApplicationServiceImplTest
    extends BaseTest
{
    @Autowired
    private QuryPerCustChnlTxnCommondApplicationServiceImpl quryPerCustChnlTxnCommondApplicationServiceImpl;

    @Test
    public void execute() {
        QuryPerCustChnlTxnCommondRequest request = new QuryPerCustChnlTxnCommondRequest();
        quryPerCustChnlTxnCommondApplicationServiceImpl.execute(request);
    }
}
