package com.mcore.hsbc.ecif.implementation.application;

import com.mcore.hsbc.ecif.api.service.request.MgmtPerCustInfoMgmtPerCustInfoRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MgmtPerCustInfoApplicationServiceImplTest
    extends BaseTest
{
    @Autowired
    private MgmtPerCustInfoApplicationServiceImpl mgmtPerCustInfoApplicationServiceImpl;

    @Test
    public void MgmtPerCustInfo() {
        MgmtPerCustInfoMgmtPerCustInfoRequest request = new MgmtPerCustInfoMgmtPerCustInfoRequest();
        mgmtPerCustInfoApplicationServiceImpl.MgmtPerCustInfo(request);
    }
}
