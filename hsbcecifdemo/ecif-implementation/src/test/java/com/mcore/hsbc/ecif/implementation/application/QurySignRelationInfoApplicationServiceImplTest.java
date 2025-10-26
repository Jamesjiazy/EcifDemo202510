package com.mcore.hsbc.ecif.implementation.application;

import com.mcore.hsbc.ecif.api.service.request.QurySignRelationInfoExecuteRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class QurySignRelationInfoApplicationServiceImplTest
    extends BaseTest
{
    @Autowired
    private QurySignRelationInfoApplicationServiceImpl qurySignRelationInfoApplicationServiceImpl;

    @Test
    public void QurySignRelationInfo() {
        QurySignRelationInfoExecuteRequest request = new QurySignRelationInfoExecuteRequest();
        qurySignRelationInfoApplicationServiceImpl.QurySignRelationInfo(request);
    }
}
