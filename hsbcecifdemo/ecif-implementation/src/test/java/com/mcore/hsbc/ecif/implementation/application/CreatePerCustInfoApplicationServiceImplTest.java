package com.mcore.hsbc.ecif.implementation.application;

import com.mcore.hsbc.ecif.api.service.request.CreatePerCustInfoCreatePerCustInfoRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CreatePerCustInfoApplicationServiceImplTest
    extends BaseTest
{
    @Autowired
    private CreatePerCustInfoApplicationServiceImpl createPerCustInfoApplicationServiceImpl;

    @Test
    public void CreatePerCustInfo() {
        CreatePerCustInfoCreatePerCustInfoRequest request = new CreatePerCustInfoCreatePerCustInfoRequest();
        createPerCustInfoApplicationServiceImpl.CreatePerCustInfo(request);
    }
}
