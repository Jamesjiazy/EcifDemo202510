package com.mcore.hsbc.ecif.implementation.controller;

import com.mcore.hsbc.ecif.api.service.QuryOvsCashWithdrReCtrFlgApiService;
import com.mcore.hsbc.ecif.api.service.QuryPerCustNameListInfoByCustNoApiService;
import com.mcore.hsbc.ecif.api.service.request.QuryOvsCashWithdrReCtrFlgQuryOvsCashWithdrReCtrFlgRequest;
import com.mcore.hsbc.ecif.api.service.request.QuryPerCustNameListInfoByCustNoQuryPerCustNameListInfoByCustNoRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
* 查询境外取现控制标志
*
*/
@RestController
@RequestMapping({"/app"})
public class QuryOvsCashWithdrReCtrFlgController {
   private static final Logger logger = LoggerFactory.getLogger(QuryOvsCashWithdrReCtrFlgController.class);

   @Resource
   private QuryOvsCashWithdrReCtrFlgApiService quryOvsCashWithdrReCtrFlgApiService;

    @PostMapping({"/QuryOvsCashWithdrReCtrFlg"})
    public Object quryOvsCashWithdrReCtrFlg(@RequestBody QuryOvsCashWithdrReCtrFlgQuryOvsCashWithdrReCtrFlgRequest request) {
        return quryOvsCashWithdrReCtrFlgApiService.QuryOvsCashWithdrReCtrFlg(request);
    }
}
