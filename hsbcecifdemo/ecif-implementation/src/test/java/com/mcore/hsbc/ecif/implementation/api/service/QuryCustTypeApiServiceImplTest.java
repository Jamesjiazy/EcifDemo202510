package com.mcore.hsbc.ecif.implementation.api.service;

import com.mcore.hsbc.ecif.api.service.request.QuryCustTypeQuryCustTypeRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class QuryCustTypeApiServiceImplTest
    extends BaseTest
{
    @Autowired
    private QuryCustTypeApiServiceImpl quryCustTypeApiServiceImpl;

    @Test
    public void QuryCustType() {
        QuryCustTypeQuryCustTypeRequest request = new QuryCustTypeQuryCustTypeRequest();
        quryCustTypeApiServiceImpl.QuryCustType(request);
    }
}
