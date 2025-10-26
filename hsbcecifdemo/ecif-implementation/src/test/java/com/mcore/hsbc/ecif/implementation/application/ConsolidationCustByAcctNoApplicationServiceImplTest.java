package com.mcore.hsbc.ecif.implementation.application;

import com.mcore.hsbc.ecif.api.service.request.ConsolidationCustByAcctNoExecuteRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ConsolidationCustByAcctNoApplicationServiceImplTest
    extends BaseTest
{
    @Autowired
    private ConsolidationCustByAcctNoApplicationServiceImpl consolidationCustByAcctNoApplicationServiceImpl;

    @Test
    public void execute() {
        ConsolidationCustByAcctNoExecuteRequest request = new ConsolidationCustByAcctNoExecuteRequest();
        consolidationCustByAcctNoApplicationServiceImpl.execute(request);
    }
}
