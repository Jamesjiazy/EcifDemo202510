package com.mcore.hsbc.ecif.implementation.domain.service.crtpercustinfo;

import com.mcore.hsbc.ecif.domain.service.crtpercustinfo.input.CrtPerCustInfoFER202509160047623ExecuteInputDTO;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CrtPerCustInfoFER202509160047623DomainServiceImplTest
    extends BaseTest
{
    @Autowired
    private CrtPerCustInfoFER202509160047623DomainServiceImpl crtPerCustInfoFER202509160047623DomainServiceImpl;

    @Test
    public void execute() {
        CrtPerCustInfoFER202509160047623ExecuteInputDTO input = new CrtPerCustInfoFER202509160047623ExecuteInputDTO();
        crtPerCustInfoFER202509160047623DomainServiceImpl.execute(input);
    }

    @Test
    public void reverse() {
        CrtPerCustInfoFER202509160047623ExecuteInputDTO input = new CrtPerCustInfoFER202509160047623ExecuteInputDTO();
        crtPerCustInfoFER202509160047623DomainServiceImpl.reverse(input);
    }
}
