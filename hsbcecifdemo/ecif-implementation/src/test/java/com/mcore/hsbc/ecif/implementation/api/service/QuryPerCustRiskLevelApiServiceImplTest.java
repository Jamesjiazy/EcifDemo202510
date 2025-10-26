package com.mcore.hsbc.ecif.implementation.api.service;

import com.mcore.hsbc.ecif.api.service.request.QuryPerCustRiskLevelQuryPerCustRiskLevelRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class QuryPerCustRiskLevelApiServiceImplTest
    extends BaseTest
{
    @Autowired
    private QuryPerCustRiskLevelApiServiceImpl quryPerCustRiskLevelApiServiceImpl;

    @Test
    public void QuryPerCustRiskLevel() {
        QuryPerCustRiskLevelQuryPerCustRiskLevelRequest request = new QuryPerCustRiskLevelQuryPerCustRiskLevelRequest();
        quryPerCustRiskLevelApiServiceImpl.QuryPerCustRiskLevel(request);
    }
}
