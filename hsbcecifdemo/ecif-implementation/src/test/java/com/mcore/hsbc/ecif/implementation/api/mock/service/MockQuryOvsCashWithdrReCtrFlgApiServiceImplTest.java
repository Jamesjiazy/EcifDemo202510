package com.mcore.hsbc.ecif.implementation.api.mock.service;

import com.mcore.hsbc.ecif.api.service.request.QuryOvsCashWithdrReCtrFlgQuryOvsCashWithdrReCtrFlgRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MockQuryOvsCashWithdrReCtrFlgApiServiceImplTest
    extends BaseTest
{
    @Autowired
    private MockQuryOvsCashWithdrReCtrFlgApiServiceImpl mockQuryOvsCashWithdrReCtrFlgApiServiceImpl;

    @Test
    public void QuryOvsCashWithdrReCtrFlg() {
        QuryOvsCashWithdrReCtrFlgQuryOvsCashWithdrReCtrFlgRequest request = new QuryOvsCashWithdrReCtrFlgQuryOvsCashWithdrReCtrFlgRequest();
        mockQuryOvsCashWithdrReCtrFlgApiServiceImpl.QuryOvsCashWithdrReCtrFlg(request);
    }
}
