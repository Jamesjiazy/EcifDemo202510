package com.mcore.hsbc.ecif.implementation.application;

import com.mcore.hsbc.ecif.api.service.request.CrtPerCustInfoCrtPerCustInfoRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CrtPerCustInfoApplicationServiceImplTest
    extends BaseTest
{
    @Autowired
    private CrtPerCustInfoApplicationServiceImpl crtPerCustInfoApplicationServiceImpl;

    @Test
    public void CrtPerCustInfo() {
        CrtPerCustInfoCrtPerCustInfoRequest request = new CrtPerCustInfoCrtPerCustInfoRequest();
        crtPerCustInfoApplicationServiceImpl.CrtPerCustInfo(request);
    }
}
