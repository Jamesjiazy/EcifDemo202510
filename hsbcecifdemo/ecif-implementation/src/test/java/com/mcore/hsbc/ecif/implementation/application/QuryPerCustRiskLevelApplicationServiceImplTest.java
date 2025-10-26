package com.mcore.hsbc.ecif.implementation.application;

import com.mcore.hsbc.ecif.api.service.request.QuryPerCustRiskLevelQuryPerCustRiskLevelRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class QuryPerCustRiskLevelApplicationServiceImplTest
    extends BaseTest
{
    @Autowired
    private QuryPerCustRiskLevelApplicationServiceImpl quryPerCustRiskLevelApplicationServiceImpl;

    @Test
    public void QuryPerCustRiskLevel() {
        QuryPerCustRiskLevelQuryPerCustRiskLevelRequest request = new QuryPerCustRiskLevelQuryPerCustRiskLevelRequest();
        quryPerCustRiskLevelApplicationServiceImpl.QuryPerCustRiskLevel(request);
    }
}
