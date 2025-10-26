package com.mcore.hsbc.ecif.implementation.api.service;

import com.mcore.hsbc.ecif.api.service.request.QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class QuryPerCustInfoByCustNoApiServiceImplTest
    extends BaseTest
{
    @Autowired
    private QuryPerCustInfoByCustNoApiServiceImpl quryPerCustInfoByCustNoApiServiceImpl;

    @Test
    public void QuryPerCustInfoByCustNo() {
        QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoRequest request = new QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoRequest();
        quryPerCustInfoByCustNoApiServiceImpl.QuryPerCustInfoByCustNo(request);
    }
}
