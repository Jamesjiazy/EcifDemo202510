package com.mcore.hsbc.ecif.implementation.api.mock.service;

import com.mcore.hsbc.ecif.api.service.request.CreatePerCustInfoCreatePerCustInfoRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MockCreatePerCustInfoApiServiceImplTest
    extends BaseTest
{
    @Autowired
    private MockCreatePerCustInfoApiServiceImpl mockCreatePerCustInfoApiServiceImpl;

    @Test
    public void CreatePerCustInfo() {
        CreatePerCustInfoCreatePerCustInfoRequest request = new CreatePerCustInfoCreatePerCustInfoRequest();
        mockCreatePerCustInfoApiServiceImpl.CreatePerCustInfo(request);
    }
}
