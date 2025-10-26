package com.mcore.hsbc.ecif.implementation.api.service;

import com.mcore.hsbc.ecif.api.service.request.CreatePerCustInfoCreatePerCustInfoRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CreatePerCustInfoApiServiceImplTest
    extends BaseTest
{
    @Autowired
    private CreatePerCustInfoApiServiceImpl createPerCustInfoApiServiceImpl;

    @Test
    public void CreatePerCustInfo() {
        CreatePerCustInfoCreatePerCustInfoRequest request = new CreatePerCustInfoCreatePerCustInfoRequest();
        createPerCustInfoApiServiceImpl.CreatePerCustInfo(request);
    }
}
