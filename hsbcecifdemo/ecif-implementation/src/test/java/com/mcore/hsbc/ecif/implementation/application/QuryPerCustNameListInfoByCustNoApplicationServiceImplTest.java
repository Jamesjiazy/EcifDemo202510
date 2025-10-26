package com.mcore.hsbc.ecif.implementation.application;

import com.mcore.hsbc.ecif.api.service.request.QuryPerCustNameListInfoByCustNoQuryPerCustNameListInfoByCustNoRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class QuryPerCustNameListInfoByCustNoApplicationServiceImplTest
    extends BaseTest
{
    @Autowired
    private QuryPerCustNameListInfoByCustNoApplicationServiceImpl quryPerCustNameListInfoByCustNoApplicationServiceImpl;

    @Test
    public void QuryPerCustNameListInfoByCustNo() {
        QuryPerCustNameListInfoByCustNoQuryPerCustNameListInfoByCustNoRequest request = new QuryPerCustNameListInfoByCustNoQuryPerCustNameListInfoByCustNoRequest();
        quryPerCustNameListInfoByCustNoApplicationServiceImpl.QuryPerCustNameListInfoByCustNo(request);
    }
}
