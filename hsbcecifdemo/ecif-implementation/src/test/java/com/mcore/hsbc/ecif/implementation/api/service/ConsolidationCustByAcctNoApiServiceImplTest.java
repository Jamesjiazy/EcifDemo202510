package com.mcore.hsbc.ecif.implementation.api.service;

import com.mcore.hsbc.ecif.api.service.request.ConsolidationCustByAcctNoExecuteRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ConsolidationCustByAcctNoApiServiceImplTest
    extends BaseTest
{
    @Autowired
    private ConsolidationCustByAcctNoApiServiceImpl consolidationCustByAcctNoApiServiceImpl;

    @Test
    public void execute() {
        ConsolidationCustByAcctNoExecuteRequest request = new ConsolidationCustByAcctNoExecuteRequest();
        consolidationCustByAcctNoApiServiceImpl.execute(request);
    }
}
