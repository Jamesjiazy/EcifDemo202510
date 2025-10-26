package com.mcore.hsbc.ecif.implementation.api.mock.service;

import com.mcore.hsbc.ecif.api.service.request.CrtPerCustInfoCrtPerCustInfoRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MockCrtPerCustInfoApiServiceImplTest
    extends BaseTest
{
    @Autowired
    private MockCrtPerCustInfoApiServiceImpl mockCrtPerCustInfoApiServiceImpl;

    @Test
    public void CrtPerCustInfo() {
        CrtPerCustInfoCrtPerCustInfoRequest request = new CrtPerCustInfoCrtPerCustInfoRequest();
        mockCrtPerCustInfoApiServiceImpl.CrtPerCustInfo(request);
    }
}
