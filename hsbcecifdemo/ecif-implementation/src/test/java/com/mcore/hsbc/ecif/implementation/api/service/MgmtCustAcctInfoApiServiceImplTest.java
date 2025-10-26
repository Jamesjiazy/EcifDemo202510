package com.mcore.hsbc.ecif.implementation.api.service;

import com.mcore.hsbc.ecif.api.service.request.MgmtCustAcctInfoExecuteRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MgmtCustAcctInfoApiServiceImplTest
    extends BaseTest
{
    @Autowired
    private MgmtCustAcctInfoApiServiceImpl mgmtCustAcctInfoApiServiceImpl;

    @Test
    public void execute() {
        MgmtCustAcctInfoExecuteRequest request = new MgmtCustAcctInfoExecuteRequest();
        mgmtCustAcctInfoApiServiceImpl.execute(request);
    }
}
