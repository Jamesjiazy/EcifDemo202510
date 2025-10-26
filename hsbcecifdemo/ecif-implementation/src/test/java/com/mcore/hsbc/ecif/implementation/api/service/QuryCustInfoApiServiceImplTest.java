package com.mcore.hsbc.ecif.implementation.api.service;

import com.mcore.hsbc.ecif.api.service.request.QuryCustInfoQuryCustInfoRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class QuryCustInfoApiServiceImplTest
    extends BaseTest
{
    @Autowired
    private QuryCustInfoApiServiceImpl quryCustInfoApiServiceImpl;

    @Test
    public void QuryCustInfo() {
        QuryCustInfoQuryCustInfoRequest request = new QuryCustInfoQuryCustInfoRequest();
        quryCustInfoApiServiceImpl.QuryCustInfo(request);
    }
}
