package com.mcore.hsbc.ecif.implementation.api.service;

import cn.hutool.extra.spring.SpringUtil;
import com.mcore.hsbc.ecif.api.service.QuryOvsCashWithdrReCtrFlgApiService;
import com.mcore.hsbc.ecif.api.service.request.QuryOvsCashWithdrReCtrFlgQuryOvsCashWithdrReCtrFlgRequest;
import com.mcore.hsbc.ecif.api.service.response.QuryOvsCashWithdrReCtrFlgQuryOvsCashWithdrReCtrFlgResponse;
import com.mcore.hsbc.ecif.application.service.QuryOvsCashWithdrReCtrFlgApplicationService;
import com.mcore.hsbc.ecif.infrastructure.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：查询境外取现控制标志
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class QuryOvsCashWithdrReCtrFlgApiServiceImpl
    implements QuryOvsCashWithdrReCtrFlgApiService
{
    @Autowired
    private QuryOvsCashWithdrReCtrFlgApplicationService quryOvsCashWithdrReCtrFlgApplicationService;

    /**
     * 查询境外取现控制标志
     * 
     * @param request
     * @return
     */
    @Override
    public QuryOvsCashWithdrReCtrFlgQuryOvsCashWithdrReCtrFlgResponse QuryOvsCashWithdrReCtrFlg(QuryOvsCashWithdrReCtrFlgQuryOvsCashWithdrReCtrFlgRequest request) {
        QuryOvsCashWithdrReCtrFlgQuryOvsCashWithdrReCtrFlgResponse response = quryOvsCashWithdrReCtrFlgApplicationService.QuryOvsCashWithdrReCtrFlg(request);
        return response;
    }

    /**
     * 查询境外取现控制标志
     * 
     * @param object
     * @return
     */
    @Override
    public QuryOvsCashWithdrReCtrFlgQuryOvsCashWithdrReCtrFlgResponse QuryOvsCashWithdrReCtrFlg(Object object) {
        QuryOvsCashWithdrReCtrFlgQuryOvsCashWithdrReCtrFlgRequest request = CommonUtil.transJSONObject(object, QuryOvsCashWithdrReCtrFlgQuryOvsCashWithdrReCtrFlgRequest.class);
        QuryOvsCashWithdrReCtrFlgApiService quryovscashwithdrrectrflgapiservice = SpringUtil.getBean(QuryOvsCashWithdrReCtrFlgApiService.class);
        QuryOvsCashWithdrReCtrFlgQuryOvsCashWithdrReCtrFlgResponse response = quryovscashwithdrrectrflgapiservice.QuryOvsCashWithdrReCtrFlg(request);
        return response;
    }
}
