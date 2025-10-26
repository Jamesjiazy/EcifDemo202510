package com.mcore.hsbc.ecif.implementation.api.service;

import cn.hutool.extra.spring.SpringUtil;
import com.mcore.hsbc.ecif.api.service.QuryCustInfoApiService;
import com.mcore.hsbc.ecif.api.service.request.QuryCustInfoQuryCustInfoRequest;
import com.mcore.hsbc.ecif.api.service.response.QuryCustInfoQuryCustInfoResponse;
import com.mcore.hsbc.ecif.application.service.QuryCustInfoApplicationService;
import com.mcore.hsbc.ecif.infrastructure.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：客户基本信息查询
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class QuryCustInfoApiServiceImpl
    implements QuryCustInfoApiService
{
    @Autowired
    private QuryCustInfoApplicationService quryCustInfoApplicationService;

    /**
     * 客户基本信息查询
     * 
     * @param request
     * @return
     */
    @Override
    public QuryCustInfoQuryCustInfoResponse QuryCustInfo(QuryCustInfoQuryCustInfoRequest request) {
        QuryCustInfoQuryCustInfoResponse response = quryCustInfoApplicationService.QuryCustInfo(request);
        return response;
    }

    /**
     * 客户基本信息查询
     * 
     * @param object
     * @return
     */
    @Override
    public QuryCustInfoQuryCustInfoResponse QuryCustInfo(Object object) {
        QuryCustInfoQuryCustInfoRequest request = CommonUtil.transJSONObject(object, QuryCustInfoQuryCustInfoRequest.class);
        QuryCustInfoApiService qurycustinfoapiservice = SpringUtil.getBean(QuryCustInfoApiService.class);
        QuryCustInfoQuryCustInfoResponse response = qurycustinfoapiservice.QuryCustInfo(request);
        return response;
    }
}
