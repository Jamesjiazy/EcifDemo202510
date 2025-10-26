package com.mcore.hsbc.ecif.implementation.api.service;

import com.mcore.hsbc.ecif.api.service.request.MgmtPerCustInfoMgmtPerCustInfoRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MgmtPerCustInfoApiServiceImplTest
    extends BaseTest
{
    @Autowired
    private MgmtPerCustInfoApiServiceImpl mgmtPerCustInfoApiServiceImpl;

    @Test
    public void MgmtPerCustInfo() {
        MgmtPerCustInfoMgmtPerCustInfoRequest request = new MgmtPerCustInfoMgmtPerCustInfoRequest();
        mgmtPerCustInfoApiServiceImpl.MgmtPerCustInfo(request);
    }
}
