package com.mcore.hsbc.ecif.implementation.application;

import com.mcore.hsbc.ecif.api.service.request.QuryCustTypeQuryCustTypeRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class QuryCustTypeApplicationServiceImplTest
    extends BaseTest
{
    @Autowired
    private QuryCustTypeApplicationServiceImpl quryCustTypeApplicationServiceImpl;

    @Test
    public void QuryCustType() {
        QuryCustTypeQuryCustTypeRequest request = new QuryCustTypeQuryCustTypeRequest();
        quryCustTypeApplicationServiceImpl.QuryCustType(request);
    }
}
