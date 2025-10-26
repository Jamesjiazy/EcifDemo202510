package com.mcore.hsbc.ecif.implementation.api.mock.service;

import com.mcore.hsbc.ecif.api.service.request.MgmtPerCustInfoMgmtPerCustInfoRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MockMgmtPerCustInfoApiServiceImplTest
    extends BaseTest
{
    @Autowired
    private MockMgmtPerCustInfoApiServiceImpl mockMgmtPerCustInfoApiServiceImpl;

    @Test
    public void MgmtPerCustInfo() {
        MgmtPerCustInfoMgmtPerCustInfoRequest request = new MgmtPerCustInfoMgmtPerCustInfoRequest();
        mockMgmtPerCustInfoApiServiceImpl.MgmtPerCustInfo(request);
    }
}
