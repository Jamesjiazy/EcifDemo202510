package com.mcore.hsbc.ecif.implementation.application;

import com.mcore.hsbc.ecif.api.service.request.MgmtCustAcctInfoExecuteRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MgmtCustAcctInfoApplicationServiceImplTest
    extends BaseTest
{
    @Autowired
    private MgmtCustAcctInfoApplicationServiceImpl mgmtCustAcctInfoApplicationServiceImpl;

    @Test
    public void execute() {
        MgmtCustAcctInfoExecuteRequest request = new MgmtCustAcctInfoExecuteRequest();
        mgmtCustAcctInfoApplicationServiceImpl.execute(request);
    }
}
