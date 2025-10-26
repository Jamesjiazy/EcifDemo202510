package com.mcore.hsbc.ecif.implementation.api.mock.service;

import com.mcore.hsbc.ecif.api.service.request.QurySignRelationInfoExecuteRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MockQurySignRelationInfoApiServiceImplTest
    extends BaseTest
{
    @Autowired
    private MockQurySignRelationInfoApiServiceImpl mockQurySignRelationInfoApiServiceImpl;

    @Test
    public void execute() {
        QurySignRelationInfoExecuteRequest request = new QurySignRelationInfoExecuteRequest();
        mockQurySignRelationInfoApiServiceImpl.execute(request);
    }
}
