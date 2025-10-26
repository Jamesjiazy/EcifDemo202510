package com.mcore.hsbc.ecif.implementation.api.service;

import com.mcore.hsbc.ecif.api.service.request.ConsolidationCustExecuteRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ConsolidationCustApiServiceImplTest
    extends BaseTest
{
    @Autowired
    private ConsolidationCustApiServiceImpl consolidationCustApiServiceImpl;

    @Test
    public void execute() {
        ConsolidationCustExecuteRequest request = new ConsolidationCustExecuteRequest();
        consolidationCustApiServiceImpl.execute(request);
    }
}
