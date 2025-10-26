package com.mcore.hsbc.ecif.implementation.api.service;

import com.mcore.hsbc.ecif.api.service.request.QuryPerCustNameListInfoByCustNoQuryPerCustNameListInfoByCustNoRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class QuryPerCustNameListInfoByCustNoApiServiceImplTest
    extends BaseTest
{
    @Autowired
    private QuryPerCustNameListInfoByCustNoApiServiceImpl quryPerCustNameListInfoByCustNoApiServiceImpl;

    @Test
    public void QuryPerCustNameListInfoByCustNo() {
        QuryPerCustNameListInfoByCustNoQuryPerCustNameListInfoByCustNoRequest request = new QuryPerCustNameListInfoByCustNoQuryPerCustNameListInfoByCustNoRequest();
        quryPerCustNameListInfoByCustNoApiServiceImpl.QuryPerCustNameListInfoByCustNo(request);
    }
}
