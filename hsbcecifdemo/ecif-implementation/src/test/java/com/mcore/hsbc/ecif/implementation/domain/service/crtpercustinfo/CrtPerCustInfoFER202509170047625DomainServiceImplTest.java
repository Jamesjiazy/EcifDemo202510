package com.mcore.hsbc.ecif.implementation.domain.service.crtpercustinfo;

import com.mcore.hsbc.ecif.domain.service.crtpercustinfo.input.CrtPerCustInfoFER202509170047625ExecuteInputDTO;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CrtPerCustInfoFER202509170047625DomainServiceImplTest
    extends BaseTest
{
    @Autowired
    private CrtPerCustInfoFER202509170047625DomainServiceImpl crtPerCustInfoFER202509170047625DomainServiceImpl;

    @Test
    public void execute() {
        CrtPerCustInfoFER202509170047625ExecuteInputDTO input = new CrtPerCustInfoFER202509170047625ExecuteInputDTO();
        crtPerCustInfoFER202509170047625DomainServiceImpl.execute(input);
    }
}
