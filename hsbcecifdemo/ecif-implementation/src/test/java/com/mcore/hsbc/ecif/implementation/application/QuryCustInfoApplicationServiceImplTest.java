package com.mcore.hsbc.ecif.implementation.application;

import com.mcore.hsbc.ecif.api.service.request.QuryCustInfoQuryCustInfoRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class QuryCustInfoApplicationServiceImplTest
    extends BaseTest
{
    @Autowired
    private QuryCustInfoApplicationServiceImpl quryCustInfoApplicationServiceImpl;

    @Test
    public void QuryCustInfo() {
        QuryCustInfoQuryCustInfoRequest request = new QuryCustInfoQuryCustInfoRequest();
        quryCustInfoApplicationServiceImpl.QuryCustInfo(request);
    }
}
