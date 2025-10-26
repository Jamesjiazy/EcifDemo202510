package com.mcore.hsbc.ecif.api.service.response;

import com.mcore.base.header.CoreAppResponseHeader;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号：head
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：客户类型查询-出参
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class QuryCustTypeQuryCustTypeResponse
    extends CoreAppResponseHeader
{
    /**
     * 客户类型代码
     */
    private String custTypCd;

    public QuryCustTypeQuryCustTypeResponse() {
    }

    public void setCustTypCd(String custTypCd) {
        this.custTypCd = custTypCd;
    }

    public String getCustTypCd() {
        return this.custTypCd;
    }

    @Override
    public String toString() {
        return "QuryCustTypeQuryCustTypeResponse{" +
				"custTypCd='" + custTypCd + '\'' +
				'}';
    }
}
