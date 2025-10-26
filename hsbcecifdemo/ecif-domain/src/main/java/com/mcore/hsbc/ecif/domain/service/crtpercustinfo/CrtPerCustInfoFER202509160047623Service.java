package com.mcore.hsbc.ecif.domain.service.crtpercustinfo;

import com.mcore.hsbc.ecif.domain.service.crtpercustinfo.input.CrtPerCustInfoFER202509160047623ExecuteInputDTO;
import com.mcore.hsbc.ecif.domain.service.crtpercustinfo.output.CrtPerCustInfoFER202509160047623ExecuteOutputDTO;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号：head
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:51
 * <br>    程序功能：新增个人客户信息
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：根据输入的客户信息新增个人客户信息
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public interface CrtPerCustInfoFER202509160047623Service {

    /**
     * execute
     * 方法描述：根据输入的客户信息新增个人客户信息
     * 
     * @param input
     * @return
     */
    CrtPerCustInfoFER202509160047623ExecuteOutputDTO execute(CrtPerCustInfoFER202509160047623ExecuteInputDTO input);

    /**
     * reverse
     * 方法描述：根据输入的客户信息新增个人客户信息
     * 
     * @param input
     * @return
     */
    CrtPerCustInfoFER202509160047623ExecuteOutputDTO reverse(CrtPerCustInfoFER202509160047623ExecuteInputDTO input);
}
