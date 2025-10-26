package com.mcore.hsbc.ecif.implementation.api.mock.service;

import com.mcore.hsbc.ecif.api.service.request.QuryPerCustRiskLevelQuryPerCustRiskLevelRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MockQuryPerCustRiskLevelApiServiceImplTest
    extends BaseTest
{
    @Autowired
    private MockQuryPerCustRiskLevelApiServiceImpl mockQuryPerCustRiskLevelApiServiceImpl;

    @Test
    public void QuryPerCustRiskLevel() {
        QuryPerCustRiskLevelQuryPerCustRiskLevelRequest request = new QuryPerCustRiskLevelQuryPerCustRiskLevelRequest();
        mockQuryPerCustRiskLevelApiServiceImpl.QuryPerCustRiskLevel(request);
    }
}
