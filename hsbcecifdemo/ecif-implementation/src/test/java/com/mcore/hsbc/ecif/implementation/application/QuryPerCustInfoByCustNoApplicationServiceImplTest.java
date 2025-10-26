package com.mcore.hsbc.ecif.implementation.application;

import com.mcore.hsbc.ecif.api.service.request.QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class QuryPerCustInfoByCustNoApplicationServiceImplTest
    extends BaseTest
{
    @Autowired
    private QuryPerCustInfoByCustNoApplicationServiceImpl quryPerCustInfoByCustNoApplicationServiceImpl;

    @Test
    public void QuryPerCustInfoByCustNo() {
        QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoRequest request = new QuryPerCustInfoByCustNoQuryPerCustInfoByCustNoRequest();
        quryPerCustInfoByCustNoApplicationServiceImpl.QuryPerCustInfoByCustNo(request);
    }
}
