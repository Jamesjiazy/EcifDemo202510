package com.mcore.hsbc.ecif.implementation.controller;

import com.mcore.hsbc.ecif.api.service.MgmtCustAcctInfoApiService;
import com.mcore.hsbc.ecif.api.service.request.MgmtCustAcctInfoExecuteRequest;
import com.mcore.hsbc.ecif.api.service.response.MgmtCustAcctInfoExecuteResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 客户账户路由信息维护
 */
@RestController
@RequestMapping("app")
public class MgmtCustAcctInfoController {

    public final MgmtCustAcctInfoApiService mgmtCustAcctInfo;

    public MgmtCustAcctInfoController(MgmtCustAcctInfoApiService mgmtCustAcctInfo) {
        this.mgmtCustAcctInfo = mgmtCustAcctInfo;
    }

    /**
     * 客户账户路由信息维护
     *
     * @param request
     * @return
     */
    @PostMapping("MgmtCustAcctInfos")
    public MgmtCustAcctInfoExecuteResponse MgmtCustAcctInfo(@RequestBody MgmtCustAcctInfoExecuteRequest request) {
        return mgmtCustAcctInfo.execute(request);
    }
}
