package com.mcore.hsbc.ecif.domain.service.qurypercustinfobycustno;

import com.mcore.hsbc.ecif.domain.service.qurypercustinfobycustno.input.QuryPerCustInfoByCustNoFER202509170047632ExecuteInputDTO;
import com.mcore.hsbc.ecif.domain.service.qurypercustinfobycustno.output.QuryPerCustInfoByCustNoFER202509170047632ExecuteOutputDTO;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号：head
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：查询个人客户信息
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：根据输入公共报文头的客户编号查询个人客户信息
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public interface QuryPerCustInfoByCustNoFER202509170047632Service {

    /**
     * execute
     * 方法描述：根据输入公共报文头的客户编号查询个人客户信息
     * 
     * @param input
     * @return
     */
    QuryPerCustInfoByCustNoFER202509170047632ExecuteOutputDTO execute(QuryPerCustInfoByCustNoFER202509170047632ExecuteInputDTO input);
}
