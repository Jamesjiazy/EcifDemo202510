package com.mcore.hsbc.ecif.implementation.domain.service.qurycusttype;

import com.mcore.hsbc.ecif.domain.service.qurycusttype.input.QuryCustTypeFER202509160047616ExecuteInputDTO;
import com.mcore.hsbc.ecif.implementation.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class QuryCustTypeFER202509160047616DomainServiceImplTest
    extends BaseTest
{
    @Autowired
    private QuryCustTypeFER202509160047616DomainServiceImpl quryCustTypeFER202509160047616DomainServiceImpl;

    @Test
    public void execute() {
        QuryCustTypeFER202509160047616ExecuteInputDTO input = new QuryCustTypeFER202509160047616ExecuteInputDTO();
        quryCustTypeFER202509160047616DomainServiceImpl.execute(input);
    }
}
