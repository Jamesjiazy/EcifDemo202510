package com.mcore.hsbc.ecif.domain.service.quryovscashwithdrrectrflg;

import com.mcore.hsbc.ecif.domain.service.quryovscashwithdrrectrflg.input.QuryOvsCashWithdrReCtrFlgFER202509170047630ExecuteInputDTO;
import com.mcore.hsbc.ecif.domain.service.quryovscashwithdrrectrflg.output.QuryOvsCashWithdrReCtrFlgFER202509170047630ExecuteOutputDTO;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号：head
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：查询客户风险等级信息
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：根据报文头客户号，查询客户风险等级信息，获取客户境外取现控制标志，0-禁止取现，N-未控制
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public interface QuryOvsCashWithdrReCtrFlgFER202509170047630Service {

    /**
     * execute
     * 方法描述：根据报文头客户号，查询客户风险等级信息，获取客户境外取现控制标志，0-禁止取现，N-未控制
     * 
     * @param input
     * @return
     */
    QuryOvsCashWithdrReCtrFlgFER202509170047630ExecuteOutputDTO execute(QuryOvsCashWithdrReCtrFlgFER202509170047630ExecuteInputDTO input);
}
