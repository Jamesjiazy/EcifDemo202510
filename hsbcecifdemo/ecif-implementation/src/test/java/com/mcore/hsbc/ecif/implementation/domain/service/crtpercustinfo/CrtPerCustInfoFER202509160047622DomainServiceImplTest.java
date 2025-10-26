package com.mcore.hsbc.ecif.implementation.domain.service.crtpercustinfo;

import com.mcore.hsbc.ecif.domain.service.crtpercustinfo.input.CrtPerCustInfoFER202509160047622ExecuteInputDTO;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CrtPerCustInfoFER202509160047622DomainServiceImplTest
    extends BaseTest
{
    @Autowired
    private CrtPerCustInfoFER202509160047622DomainServiceImpl crtPerCustInfoFER202509160047622DomainServiceImpl;

    @Test
    public void execute() {
        CrtPerCustInfoFER202509160047622ExecuteInputDTO input = new CrtPerCustInfoFER202509160047622ExecuteInputDTO();
        crtPerCustInfoFER202509160047622DomainServiceImpl.execute(input);
    }

    @Test
    public void reverse() {
        CrtPerCustInfoFER202509160047622ExecuteInputDTO input = new CrtPerCustInfoFER202509160047622ExecuteInputDTO();
        crtPerCustInfoFER202509160047622DomainServiceImpl.reverse(input);
    }
}
