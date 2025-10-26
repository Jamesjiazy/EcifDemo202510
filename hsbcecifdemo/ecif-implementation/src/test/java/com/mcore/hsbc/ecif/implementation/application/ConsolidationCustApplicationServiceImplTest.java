package com.mcore.hsbc.ecif.implementation.application;

import com.mcore.hsbc.ecif.api.service.request.ConsolidationCustExecuteRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ConsolidationCustApplicationServiceImplTest
    extends BaseTest
{
    @Autowired
    private ConsolidationCustApplicationServiceImpl consolidationCustApplicationServiceImpl;

    @Test
    public void execute() {
        ConsolidationCustExecuteRequest request = new ConsolidationCustExecuteRequest();
        consolidationCustApplicationServiceImpl.execute(request);
    }
}
