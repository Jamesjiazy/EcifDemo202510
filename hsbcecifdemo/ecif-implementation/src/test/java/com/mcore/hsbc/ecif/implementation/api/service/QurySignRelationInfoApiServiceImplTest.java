package com.mcore.hsbc.ecif.implementation.api.service;

import com.mcore.hsbc.ecif.api.service.request.QurySignRelationInfoExecuteRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class QurySignRelationInfoApiServiceImplTest
    extends BaseTest
{
    @Autowired
    private QurySignRelationInfoApiServiceImpl qurySignRelationInfoApiServiceImpl;

    @Test
    public void execute() {
        QurySignRelationInfoExecuteRequest request = new QurySignRelationInfoExecuteRequest();
        qurySignRelationInfoApiServiceImpl.execute(request);
    }
}
