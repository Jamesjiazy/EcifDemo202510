package com.mcore.hsbc.ecif.implementation.controller;

import com.mcore.hsbc.ecif.api.service.QuryCustAcctInfoByCustNoApiService;
import com.mcore.hsbc.ecif.api.service.request.QuryCustAcctInfoByCustNoExecuteRequest;
import com.mcore.hsbc.ecif.api.service.response.QuryCustAcctInfoByCustNoExecuteResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 通过客户号查询客户账户路由信息
 */
@RestController
@RequestMapping("app")
public class QuryCustAcctInfoByCustNoExecuteController {

    public final QuryCustAcctInfoByCustNoApiService quryCustAcctInfoByCustNoApiService;

    public QuryCustAcctInfoByCustNoExecuteController(QuryCustAcctInfoByCustNoApiService quryCustAcctInfoByCustNoApiService) {
        this.quryCustAcctInfoByCustNoApiService = quryCustAcctInfoByCustNoApiService;
    }

    /**
     * 通过客户号查询客户账户路由信息
     *
     * @param request
     * @return
     */
    @PostMapping("QuryCustAcctInfoByCustNo")
    public QuryCustAcctInfoByCustNoExecuteResponse execute(@RequestBody QuryCustAcctInfoByCustNoExecuteRequest request) {
        return quryCustAcctInfoByCustNoApiService.execute(request);
    }
}
