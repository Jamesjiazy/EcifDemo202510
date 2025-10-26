package com.mcore.hsbc.ecif.implementation.domain.service.quryovscashwithdrrectrflg;

import com.mcore.hsbc.ecif.domain.service.quryovscashwithdrrectrflg.input.QuryOvsCashWithdrReCtrFlgFER202509170047630ExecuteInputDTO;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class QuryOvsCashWithdrReCtrFlgFER202509170047630DomainServiceImplTest
    extends BaseTest
{
    @Autowired
    private QuryOvsCashWithdrReCtrFlgFER202509170047630DomainServiceImpl quryOvsCashWithdrReCtrFlgFER202509170047630DomainServiceImpl;

    @Test
    public void execute() {
        QuryOvsCashWithdrReCtrFlgFER202509170047630ExecuteInputDTO input = new QuryOvsCashWithdrReCtrFlgFER202509170047630ExecuteInputDTO();
        quryOvsCashWithdrReCtrFlgFER202509170047630DomainServiceImpl.execute(input);
    }
}
