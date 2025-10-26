package com.mcore.hsbc.ecif.implementation.domain.service.qurypercustinfobycustno;

import com.mcore.hsbc.ecif.domain.service.qurypercustinfobycustno.input.QuryPerCustInfoByCustNoFER202509170047632ExecuteInputDTO;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class QuryPerCustInfoByCustNoFER202509170047632DomainServiceImplTest
    extends BaseTest
{
    @Autowired
    private QuryPerCustInfoByCustNoFER202509170047632DomainServiceImpl quryPerCustInfoByCustNoFER202509170047632DomainServiceImpl;

    @Test
    public void execute() {
        QuryPerCustInfoByCustNoFER202509170047632ExecuteInputDTO input = new QuryPerCustInfoByCustNoFER202509170047632ExecuteInputDTO();
        quryPerCustInfoByCustNoFER202509170047632DomainServiceImpl.execute(input);
    }
}
