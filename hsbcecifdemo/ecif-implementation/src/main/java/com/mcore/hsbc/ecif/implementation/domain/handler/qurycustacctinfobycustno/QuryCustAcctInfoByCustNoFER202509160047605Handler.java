package com.mcore.hsbc.ecif.implementation.domain.handler.qurycustacctinfobycustno;

import org.springframework.beans.factory.annotation.Autowired;
import com.mcore.plugin.tranflow.mflow.node.BaseHandler;
import com.mcore.base.intf.tranflow.ProcessHandler;
import com.mcore.hsbc.ecif.domain.service.qurycustacctinfobycustno.input.QuryCustAcctInfoByCustNoInputDTO;
import com.mcore.hsbc.ecif.domain.service.qurycustacctinfobycustno.QuryCustAcctInfoByCustNoDomainService;

/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号：head
 * <br>    创建者：zj_zengq
 * <br>    创建日期：2025-09-19 14:45:52
 * <br>    程序功能：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：根据输入的客户编号、路由类型、状态查询客户账户路由信息
 * <br>    设计说明：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 *
 */

public class QuryCustAcctInfoByCustNoFER202509160047605Handler extends BaseHandler implements ProcessHandler {

    @Autowired
    private QuryCustAcctInfoByCustNoDomainService quryCustAcctInfoByCustNoDomainService;

    /**
     * process
     * 方法描述：根据输入的客户编号、路由类型、状态查询客户账户路由信息
     *
     * @param entry
     * @param data
     * @param e
     * @return
     */
    @Override
    public Object process(String entry, Object data, Throwable e) {
        QuryCustAcctInfoByCustNoInputDTO request = (QuryCustAcctInfoByCustNoInputDTO)data;
        return quryCustAcctInfoByCustNoDomainService.execute(request);
    }
}