package com.mcore.hsbc.ecif.api.service.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mcore.base.header.CoreAppRequestHeader;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号：head
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：通过客户号查询客户账户路由信息-入参
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class QuryCustAcctInfoByCustAcctExecuteRequest
    extends CoreAppRequestHeader
{
    /**
     * 路由类型代码
     */
    @JsonProperty("routeTypCd")
    private String routeTypCd;

    /**
     * 关联序号
     */
    @JsonProperty("relaSeqNo")
    private String relaSeqNo;

    /**
     * 路由值
     */
    @JsonProperty("routeVal")
    private String routeVal;
}
