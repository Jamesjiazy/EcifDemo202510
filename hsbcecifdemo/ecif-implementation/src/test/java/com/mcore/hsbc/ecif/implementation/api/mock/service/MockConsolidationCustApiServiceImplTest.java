package com.mcore.hsbc.ecif.implementation.api.mock.service;

import com.mcore.hsbc.ecif.api.service.request.ConsolidationCustExecuteRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MockConsolidationCustApiServiceImplTest
    extends BaseTest
{
    @Autowired
    private MockConsolidationCustApiServiceImpl mockConsolidationCustApiServiceImpl;

    @Test
    public void execute() {
        ConsolidationCustExecuteRequest request = new ConsolidationCustExecuteRequest();
        mockConsolidationCustApiServiceImpl.execute(request);
    }
}
