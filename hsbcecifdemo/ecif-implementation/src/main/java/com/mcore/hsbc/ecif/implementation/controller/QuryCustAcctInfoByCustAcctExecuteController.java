package com.mcore.hsbc.ecif.implementation.controller;

import com.mcore.hsbc.ecif.api.service.QuryCustAcctInfoByCustAcctApiService;
import com.mcore.hsbc.ecif.api.service.request.QuryCustAcctInfoByCustAcctExecuteRequest;
import com.mcore.hsbc.ecif.api.service.response.QuryCustAcctInfoByCustAcctExecuteResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 通过账号查询客户账户路由信息
 */
@RestController
@RequestMapping("app")
public class QuryCustAcctInfoByCustAcctExecuteController {

    public final QuryCustAcctInfoByCustAcctApiService quryCustAcctInfoByCustAcctApiService;

    public QuryCustAcctInfoByCustAcctExecuteController(QuryCustAcctInfoByCustAcctApiService quryCustAcctInfoByCustAcctApiService) {
        this.quryCustAcctInfoByCustAcctApiService = quryCustAcctInfoByCustAcctApiService;
    }

    /**
     * 通过账号查询客户账户路由信息
     *
     * @param request
     * @return
     */
    @PostMapping("QuryCustAcctInfoByCustAcct")
    public QuryCustAcctInfoByCustAcctExecuteResponse QuryCustAcctInfoByCustAcct(@RequestBody QuryCustAcctInfoByCustAcctExecuteRequest request) {
        return quryCustAcctInfoByCustAcctApiService.execute(request);
    }
}
