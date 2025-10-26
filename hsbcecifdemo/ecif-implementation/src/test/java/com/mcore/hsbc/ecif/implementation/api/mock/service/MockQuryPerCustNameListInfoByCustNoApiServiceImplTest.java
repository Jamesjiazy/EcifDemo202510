package com.mcore.hsbc.ecif.implementation.api.mock.service;

import com.mcore.hsbc.ecif.api.service.request.QuryPerCustNameListInfoByCustNoQuryPerCustNameListInfoByCustNoRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MockQuryPerCustNameListInfoByCustNoApiServiceImplTest
    extends BaseTest
{
    @Autowired
    private MockQuryPerCustNameListInfoByCustNoApiServiceImpl mockQuryPerCustNameListInfoByCustNoApiServiceImpl;

    @Test
    public void QuryPerCustNameListInfoByCustNo() {
        QuryPerCustNameListInfoByCustNoQuryPerCustNameListInfoByCustNoRequest request = new QuryPerCustNameListInfoByCustNoQuryPerCustNameListInfoByCustNoRequest();
        mockQuryPerCustNameListInfoByCustNoApiServiceImpl.QuryPerCustNameListInfoByCustNo(request);
    }
}
