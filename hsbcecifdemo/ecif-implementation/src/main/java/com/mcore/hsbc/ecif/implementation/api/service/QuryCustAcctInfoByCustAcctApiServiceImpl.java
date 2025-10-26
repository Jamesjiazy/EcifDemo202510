package com.mcore.hsbc.ecif.implementation.api.service;

import cn.hutool.extra.spring.SpringUtil;
import com.mcore.hsbc.ecif.api.service.QuryCustAcctInfoByCustAcctApiService;
import com.mcore.hsbc.ecif.api.service.request.QuryCustAcctInfoByCustAcctExecuteRequest;
import com.mcore.hsbc.ecif.api.service.response.QuryCustAcctInfoByCustAcctExecuteResponse;
import com.mcore.hsbc.ecif.application.service.QuryCustAcctInfoByCustAcctApplicationService;
import com.mcore.hsbc.ecif.infrastructure.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：通过账号查询客户账户路由信息
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 */
public class QuryCustAcctInfoByCustAcctApiServiceImpl
        implements QuryCustAcctInfoByCustAcctApiService {
    @Autowired
    private QuryCustAcctInfoByCustAcctApplicationService applicationService;

    /**
     * 通过账号查询客户账户路由信息
     *
     * @param request
     * @return
     */
    @Override
    public QuryCustAcctInfoByCustAcctExecuteResponse execute(QuryCustAcctInfoByCustAcctExecuteRequest request) {
        return applicationService.execute(request);
    }

    /**
     * 通过账号查询客户账户路由信息
     *
     * @param object
     * @return
     */
    @Override
    public QuryCustAcctInfoByCustAcctExecuteResponse execute(Object object) {
        QuryCustAcctInfoByCustAcctExecuteRequest request = CommonUtil.transJSONObject(object, QuryCustAcctInfoByCustAcctExecuteRequest.class);
        QuryCustAcctInfoByCustAcctApiService qurycustacctinfobycustnoapiservice = SpringUtil.getBean(QuryCustAcctInfoByCustAcctApiService.class);
        return applicationService.execute(request);
    }

}
