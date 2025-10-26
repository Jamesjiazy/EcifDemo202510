package com.mcore.hsbc.ecif.implementation.application;

import com.mcore.hsbc.ecif.api.service.request.QuryCustAcctInfoByCustNoExecuteRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class QuryCustAcctInfoByCustNoApplicationServiceImplTest
        extends BaseTest {
    @Autowired
    private QuryCustAcctInfoByCustNoApplicationServiceImpl quryCustAcctInfoByCustNoApplicationServiceImpl;

    @Test
    public void QuryCustAcctInfoByCustAcct() {
        QuryCustAcctInfoByCustNoExecuteRequest request = new QuryCustAcctInfoByCustNoExecuteRequest();
        quryCustAcctInfoByCustNoApplicationServiceImpl.execute(request);
    }

    @Test
    public void execute() {
        QuryCustAcctInfoByCustNoExecuteRequest request = new QuryCustAcctInfoByCustNoExecuteRequest();
        quryCustAcctInfoByCustNoApplicationServiceImpl.execute(request);
    }
}
