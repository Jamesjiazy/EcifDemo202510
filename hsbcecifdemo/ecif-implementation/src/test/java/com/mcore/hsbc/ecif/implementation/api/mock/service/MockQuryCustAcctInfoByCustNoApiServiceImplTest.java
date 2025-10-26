package com.mcore.hsbc.ecif.implementation.api.mock.service;

import com.mcore.hsbc.ecif.api.service.request.QuryCustAcctInfoByCustNoExecuteRequest;
import com.mcore.hsbc.ecif.api.service.request.QuryCustAcctInfoByCustAcctExecuteRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MockQuryCustAcctInfoByCustNoApiServiceImplTest
    extends BaseTest
{
    @Autowired
    private MockQuryCustAcctInfoByCustNoApiServiceImpl mockQuryCustAcctInfoByCustNoApiServiceImpl;

    @Test
    public void execute() {
        QuryCustAcctInfoByCustNoExecuteRequest request = new QuryCustAcctInfoByCustNoExecuteRequest();
        mockQuryCustAcctInfoByCustNoApiServiceImpl.execute(request);
    }

    @Test
    public void QuryCustAcctInfoByCustNo() {
        QuryCustAcctInfoByCustAcctExecuteRequest request = new QuryCustAcctInfoByCustAcctExecuteRequest();
        mockQuryCustAcctInfoByCustNoApiServiceImpl.execute(request);
    }
}
