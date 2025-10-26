package com.mcore.hsbc.ecif.implementation.api.mock.service;

import com.mcore.hsbc.ecif.api.service.request.QuryCustTypeQuryCustTypeRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MockQuryCustTypeApiServiceImplTest
    extends BaseTest
{
    @Autowired
    private MockQuryCustTypeApiServiceImpl mockQuryCustTypeApiServiceImpl;

    @Test
    public void QuryCustType() {
        QuryCustTypeQuryCustTypeRequest request = new QuryCustTypeQuryCustTypeRequest();
        mockQuryCustTypeApiServiceImpl.QuryCustType(request);
    }
}
