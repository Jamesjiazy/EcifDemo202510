package com.mcore.hsbc.ecif.implementation.api.service;

import cn.hutool.extra.spring.SpringUtil;
import com.mcore.hsbc.ecif.api.service.QuryCustTypeApiService;
import com.mcore.hsbc.ecif.api.service.request.QuryCustTypeQuryCustTypeRequest;
import com.mcore.hsbc.ecif.api.service.response.QuryCustTypeQuryCustTypeResponse;
import com.mcore.hsbc.ecif.application.service.QuryCustTypeApplicationService;
import com.mcore.hsbc.ecif.infrastructure.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：客户类型查询
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class QuryCustTypeApiServiceImpl
    implements QuryCustTypeApiService
{
    @Autowired
    private QuryCustTypeApplicationService quryCustTypeApplicationService;

    /**
     * 客户类型查询
     * 
     * @param request
     * @return
     */
    @Override
    public QuryCustTypeQuryCustTypeResponse QuryCustType(QuryCustTypeQuryCustTypeRequest request) {
        QuryCustTypeQuryCustTypeResponse response = quryCustTypeApplicationService.QuryCustType(request);
        return response;
    }

    /**
     * 客户类型查询
     * 
     * @param object
     * @return
     */
    @Override
    public QuryCustTypeQuryCustTypeResponse QuryCustType(Object object) {
        QuryCustTypeQuryCustTypeRequest request = CommonUtil.transJSONObject(object, QuryCustTypeQuryCustTypeRequest.class);
        QuryCustTypeApiService qurycusttypeapiservice = SpringUtil.getBean(QuryCustTypeApiService.class);
        QuryCustTypeQuryCustTypeResponse response = qurycusttypeapiservice.QuryCustType(request);
        return response;
    }
}
