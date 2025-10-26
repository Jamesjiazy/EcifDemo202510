package com.mcore.hsbc.ecif.domain.service.crtpercustinfo;

import com.mcore.hsbc.ecif.domain.service.crtpercustinfo.input.CrtPerCustInfoFER202509170047625ExecuteInputDTO;
import com.mcore.hsbc.ecif.domain.service.crtpercustinfo.output.CrtPerCustInfoFER202509170047625ExecuteOutputDTO;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号：head
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:51
 * <br>    程序功能：查询客户基本信息
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：根据输入的证件类型和证件号码查询客户基本信息，如果已存在对应的客户信息，提示已存在疑似客户信息，阻断交易。
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public interface CrtPerCustInfoFER202509170047625Service {

    /**
     * execute
     * 方法描述：根据输入的证件类型和证件号码查询客户基本信息，如果已存在对应的客户信息，提示已存在疑似客户信息，阻断交易。
     * 
     * @param input
     * @return
     */
    CrtPerCustInfoFER202509170047625ExecuteOutputDTO execute(CrtPerCustInfoFER202509170047625ExecuteInputDTO input);
}
