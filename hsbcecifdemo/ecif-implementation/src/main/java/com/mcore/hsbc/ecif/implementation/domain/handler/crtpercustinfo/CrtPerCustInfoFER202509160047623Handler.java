package com.mcore.hsbc.ecif.implementation.domain.handler.crtpercustinfo;

import org.springframework.beans.factory.annotation.Autowired;
import com.mcore.plugin.tranflow.mflow.node.BaseHandler;
import com.mcore.base.intf.tranflow.ProcessHandler;
import com.mcore.hsbc.ecif.domain.service.crtpercustinfo.input.CrtPerCustInfoFER202509160047623ExecuteInputDTO;
import com.mcore.hsbc.ecif.domain.service.crtpercustinfo.CrtPerCustInfoFER202509160047623Service;

/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号：head
 * <br>    创建者：zj_zengq
 * <br>    创建日期：2025-09-19 14:45:52
 * <br>    程序功能：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：根据输入的客户信息新增个人客户信息
 * <br>    设计说明：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 *
 */

public class CrtPerCustInfoFER202509160047623Handler extends BaseHandler implements ProcessHandler {

    @Autowired
    private CrtPerCustInfoFER202509160047623Service crtPerCustInfoFER202509160047623Service;

    /**
     * process
     * 方法描述：根据输入的客户信息新增个人客户信息
     *
     * @param entry
     * @param data
     * @param e
     * @return
     */
    @Override
    public Object process(String entry, Object data, Throwable e) {
        CrtPerCustInfoFER202509160047623ExecuteInputDTO request = (CrtPerCustInfoFER202509160047623ExecuteInputDTO)data;
        return crtPerCustInfoFER202509160047623Service.execute(request);
    }
}