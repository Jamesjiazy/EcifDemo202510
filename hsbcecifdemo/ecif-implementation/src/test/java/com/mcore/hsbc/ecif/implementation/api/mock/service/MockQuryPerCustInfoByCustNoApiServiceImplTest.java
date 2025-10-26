package com.mcore.hsbc.ecif.implementation.api.mock.service;

import com.mcore.hsbc.ecif.api.service.request.QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MockQuryPerCustInfoByCustNoApiServiceImplTest
    extends BaseTest
{
    @Autowired
    private MockQuryPerCustInfoByCustNoApiServiceImpl mockQuryPerCustInfoByCustNoApiServiceImpl;

    @Test
    public void QuryPerCustInfoByCustNo() {
        QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoRequest request = new QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoRequest();
        mockQuryPerCustInfoByCustNoApiServiceImpl.QuryPerCustInfoByCustNo(request);
    }
}
