package com.mcore.hsbc.ecif.implementation.api.service;

import com.mcore.hsbc.ecif.api.service.request.CrtPerCustInfoCrtPerCustInfoRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CrtPerCustInfoApiServiceImplTest
    extends BaseTest
{
    @Autowired
    private CrtPerCustInfoApiServiceImpl crtPerCustInfoApiServiceImpl;

    @Test
    public void CrtPerCustInfo() {
        CrtPerCustInfoCrtPerCustInfoRequest request = new CrtPerCustInfoCrtPerCustInfoRequest();
        crtPerCustInfoApiServiceImpl.CrtPerCustInfo(request);
    }
}
