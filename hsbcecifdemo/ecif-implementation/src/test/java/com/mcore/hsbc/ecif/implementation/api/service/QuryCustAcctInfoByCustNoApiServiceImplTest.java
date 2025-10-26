package com.mcore.hsbc.ecif.implementation.api.service;

import com.mcore.hsbc.ecif.api.service.request.QuryCustAcctInfoByCustNoExecuteRequest;
import com.mcore.hsbc.ecif.api.service.request.QuryCustAcctInfoByCustAcctExecuteRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class QuryCustAcctInfoByCustNoApiServiceImplTest
    extends BaseTest
{
    @Autowired
    private QuryCustAcctInfoByCustNoApiServiceImpl quryCustAcctInfoByCustNoApiServiceImpl;

    @Test
    public void execute() {
        QuryCustAcctInfoByCustNoExecuteRequest request = new QuryCustAcctInfoByCustNoExecuteRequest();
        quryCustAcctInfoByCustNoApiServiceImpl.execute(request);
    }

    @Test
    public void QuryCustAcctInfoByCustNo() {
        QuryCustAcctInfoByCustAcctExecuteRequest request = new QuryCustAcctInfoByCustAcctExecuteRequest();
        quryCustAcctInfoByCustNoApiServiceImpl.execute(request);
    }
}
