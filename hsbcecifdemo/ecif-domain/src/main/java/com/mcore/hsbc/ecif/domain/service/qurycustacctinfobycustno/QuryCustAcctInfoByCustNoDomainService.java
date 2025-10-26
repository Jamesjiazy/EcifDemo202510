package com.mcore.hsbc.ecif.domain.service.qurycustacctinfobycustno;

import com.mcore.hsbc.ecif.domain.service.qurycustacctinfobycustno.input.QuryCustAcctInfoByCustNoInputDTO;
import com.mcore.hsbc.ecif.domain.service.qurycustacctinfobycustno.output.QuryCustAcctInfoByCustNoOutputDTO;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号：head
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：查询客户路由信息
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：根据输入的客户编号、路由类型、状态查询客户账户路由信息
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public interface QuryCustAcctInfoByCustNoDomainService {

    /**
     * execute
     * 方法描述：根据输入的客户编号、路由类型、状态查询客户账户路由信息
     * 
     * @param input
     * @return
     */
    QuryCustAcctInfoByCustNoOutputDTO execute(QuryCustAcctInfoByCustNoInputDTO input);
}
