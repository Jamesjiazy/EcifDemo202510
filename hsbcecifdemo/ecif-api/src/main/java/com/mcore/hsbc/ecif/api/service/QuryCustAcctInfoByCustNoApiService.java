package com.mcore.hsbc.ecif.api.service;

import com.mcore.hsbc.ecif.api.service.request.QuryCustAcctInfoByCustNoExecuteRequest;
import com.mcore.hsbc.ecif.api.service.response.QuryCustAcctInfoByCustNoExecuteResponse;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：通过客户号查询客户账户路由信息
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public interface QuryCustAcctInfoByCustNoApiService {
    /**
     * 通过客户号查询客户账户路由信息
     *
     * @param request
     * @return
     */
    QuryCustAcctInfoByCustNoExecuteResponse execute(QuryCustAcctInfoByCustNoExecuteRequest request);

    /**
     * 通过客户号查询客户账户路由信息
     *
     * @param object
     * @return
     */
    QuryCustAcctInfoByCustNoExecuteResponse execute(Object object);

    }
