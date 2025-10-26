package com.mcore.hsbc.ecif.implementation.domain.service.qurypercustrisklevel;

import com.mcore.hsbc.ecif.domain.service.qurypercustrisklevel.input.QuryPerCustRiskLevelFER202509170047633ExecuteInputDTO;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class QuryPerCustRiskLevelFER202509170047633DomainServiceImplTest
    extends BaseTest
{
    @Autowired
    private QuryPerCustRiskLevelFER202509170047633DomainServiceImpl quryPerCustRiskLevelFER202509170047633DomainServiceImpl;

    @Test
    public void execute() {
        QuryPerCustRiskLevelFER202509170047633ExecuteInputDTO input = new QuryPerCustRiskLevelFER202509170047633ExecuteInputDTO();
        quryPerCustRiskLevelFER202509170047633DomainServiceImpl.execute(input);
    }
}
