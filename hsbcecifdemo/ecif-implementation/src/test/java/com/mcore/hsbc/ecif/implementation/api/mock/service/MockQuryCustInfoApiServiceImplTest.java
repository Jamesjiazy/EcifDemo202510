package com.mcore.hsbc.ecif.implementation.api.mock.service;

import com.mcore.hsbc.ecif.api.service.request.QuryCustInfoQuryCustInfoRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MockQuryCustInfoApiServiceImplTest
    extends BaseTest
{
    @Autowired
    private MockQuryCustInfoApiServiceImpl mockQuryCustInfoApiServiceImpl;

    @Test
    public void QuryCustInfo() {
        QuryCustInfoQuryCustInfoRequest request = new QuryCustInfoQuryCustInfoRequest();
        mockQuryCustInfoApiServiceImpl.QuryCustInfo(request);
    }
}
