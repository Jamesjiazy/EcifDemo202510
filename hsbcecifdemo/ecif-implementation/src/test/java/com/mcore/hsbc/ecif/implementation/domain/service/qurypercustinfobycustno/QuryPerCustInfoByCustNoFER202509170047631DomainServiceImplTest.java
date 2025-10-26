package com.mcore.hsbc.ecif.implementation.domain.service.qurypercustinfobycustno;

import com.mcore.hsbc.ecif.domain.service.qurypercustinfobycustno.input.QuryPerCustInfoByCustNoFER202509170047631ExecuteInputDTO;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class QuryPerCustInfoByCustNoFER202509170047631DomainServiceImplTest
    extends BaseTest
{
    @Autowired
    private QuryPerCustInfoByCustNoFER202509170047631DomainServiceImpl quryPerCustInfoByCustNoFER202509170047631DomainServiceImpl;

    @Test
    public void execute() {
        QuryPerCustInfoByCustNoFER202509170047631ExecuteInputDTO input = new QuryPerCustInfoByCustNoFER202509170047631ExecuteInputDTO();
        quryPerCustInfoByCustNoFER202509170047631DomainServiceImpl.execute(input);
    }
}
