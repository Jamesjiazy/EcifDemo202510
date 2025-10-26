package com.mcore.hsbc.ecif.implementation.domain.service.qurycustacctinfobycustno;

import com.mcore.hsbc.ecif.domain.service.qurycustacctinfobycustno.input.QuryCustAcctInfoByCustNoInputDTO;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class QuryCustAcctInfoByCustNoFER202509160047605DomainServiceImplTest
    extends BaseTest
{
    @Autowired
    private QuryCustAcctInfoByCustNoDomainServiceImpl quryCustAcctInfoByCustNoFER202509160047605DomainServiceImpl;

    @Test
    public void execute() {
        QuryCustAcctInfoByCustNoInputDTO input = new QuryCustAcctInfoByCustNoInputDTO();
        quryCustAcctInfoByCustNoFER202509160047605DomainServiceImpl.execute(input);
    }
}
