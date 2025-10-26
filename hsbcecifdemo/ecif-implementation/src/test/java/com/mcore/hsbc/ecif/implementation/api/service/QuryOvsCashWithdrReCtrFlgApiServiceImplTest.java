package com.mcore.hsbc.ecif.implementation.api.service;

import com.mcore.hsbc.ecif.api.service.request.QuryOvsCashWithdrReCtrFlgQuryOvsCashWithdrReCtrFlgRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class QuryOvsCashWithdrReCtrFlgApiServiceImplTest
    extends BaseTest
{
    @Autowired
    private QuryOvsCashWithdrReCtrFlgApiServiceImpl quryOvsCashWithdrReCtrFlgApiServiceImpl;

    @Test
    public void QuryOvsCashWithdrReCtrFlg() {
        QuryOvsCashWithdrReCtrFlgQuryOvsCashWithdrReCtrFlgRequest request = new QuryOvsCashWithdrReCtrFlgQuryOvsCashWithdrReCtrFlgRequest();
        quryOvsCashWithdrReCtrFlgApiServiceImpl.QuryOvsCashWithdrReCtrFlg(request);
    }
}
