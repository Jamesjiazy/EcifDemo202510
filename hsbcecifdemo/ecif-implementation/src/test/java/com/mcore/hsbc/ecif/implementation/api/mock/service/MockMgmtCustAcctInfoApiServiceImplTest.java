package com.mcore.hsbc.ecif.implementation.api.mock.service;

import com.mcore.hsbc.ecif.api.service.request.MgmtCustAcctInfoExecuteRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MockMgmtCustAcctInfoApiServiceImplTest
    extends BaseTest
{
    @Autowired
    private MockMgmtCustAcctInfoApiServiceImpl mockMgmtCustAcctInfoApiServiceImpl;

    @Test
    public void execute() {
        MgmtCustAcctInfoExecuteRequest request = new MgmtCustAcctInfoExecuteRequest();
        mockMgmtCustAcctInfoApiServiceImpl.execute(request);
    }
}
