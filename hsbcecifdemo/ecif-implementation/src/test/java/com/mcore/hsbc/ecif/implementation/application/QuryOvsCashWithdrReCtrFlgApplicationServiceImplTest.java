package com.mcore.hsbc.ecif.implementation.application;

import com.mcore.hsbc.ecif.api.service.request.QuryOvsCashWithdrReCtrFlgQuryOvsCashWithdrReCtrFlgRequest;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class QuryOvsCashWithdrReCtrFlgApplicationServiceImplTest
    extends BaseTest
{
    @Autowired
    private QuryOvsCashWithdrReCtrFlgApplicationServiceImpl quryOvsCashWithdrReCtrFlgApplicationServiceImpl;

    @Test
    public void QuryOvsCashWithdrReCtrFlg() {
        QuryOvsCashWithdrReCtrFlgQuryOvsCashWithdrReCtrFlgRequest request = new QuryOvsCashWithdrReCtrFlgQuryOvsCashWithdrReCtrFlgRequest();
        quryOvsCashWithdrReCtrFlgApplicationServiceImpl.QuryOvsCashWithdrReCtrFlg(request);
    }
}
