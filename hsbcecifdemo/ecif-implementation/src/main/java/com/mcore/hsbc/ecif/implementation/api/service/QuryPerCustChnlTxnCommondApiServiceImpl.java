package com.mcore.hsbc.ecif.implementation.api.service;

import cn.hutool.extra.spring.SpringUtil;
import com.mcore.hsbc.ecif.api.service.QuryPerCustChnlTxnCommondApiService;
import com.mcore.hsbc.ecif.api.service.request.QuryPerCustChnlTxnCommondRequest;
import com.mcore.hsbc.ecif.api.service.response.QuryPerCustChnlTxnCommondExecuteResponse;
import com.mcore.hsbc.ecif.application.service.QuryPerCustChnlTxnCommondApplicationService;
import com.mcore.hsbc.ecif.infrastructure.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：对私客户交易渠道控制查询
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class QuryPerCustChnlTxnCommondApiServiceImpl
    implements QuryPerCustChnlTxnCommondApiService
{
    @Autowired
    private QuryPerCustChnlTxnCommondApplicationService quryPerCustChnlTxnCommondApplicationService;

    /**
     * 对私客户交易渠道控制查询
     * 
     * @param request
     * @return
     */
    @Override
    public QuryPerCustChnlTxnCommondExecuteResponse execute(QuryPerCustChnlTxnCommondRequest request) {
        QuryPerCustChnlTxnCommondExecuteResponse response = quryPerCustChnlTxnCommondApplicationService.execute(request);
        return response;
    }

    /**
     * 对私客户交易渠道控制查询
     * 
     * @param object
     * @return
     */
    @Override
    public QuryPerCustChnlTxnCommondExecuteResponse execute(Object object) {
        QuryPerCustChnlTxnCommondRequest request = CommonUtil.transJSONObject(object, QuryPerCustChnlTxnCommondRequest.class);
        QuryPerCustChnlTxnCommondApiService qurypercustchnltxncommondapiservice = SpringUtil.getBean(QuryPerCustChnlTxnCommondApiService.class);
        QuryPerCustChnlTxnCommondExecuteResponse response = qurypercustchnltxncommondapiservice.execute(request);
        return response;
    }
}
