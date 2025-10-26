package com.mcore.hsbc.ecif.api.service.response;

import java.util.List;
import com.mcore.base.header.CoreAppResponseHeader;
import com.mcore.hsbc.ecif.api.service.model.NameListInfoDO;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号：head
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：对私客户名单信息查询-出参
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class QuryPerCustNameListInfoByCustNoQuryPerCustNameListInfoByCustNoResponse
    extends CoreAppResponseHeader
{
    /**
     * 名单信息列表
     */
    private List<NameListInfoDO> nameListInfo;

    public QuryPerCustNameListInfoByCustNoQuryPerCustNameListInfoByCustNoResponse() {
    }

    public void setNameListInfo(List<NameListInfoDO> nameListInfo) {
        this.nameListInfo = nameListInfo;
    }

    public List<NameListInfoDO> getNameListInfo() {
        return this.nameListInfo;
    }

    @Override
    public String toString() {
        return "QuryPerCustNameListInfoByCustNoQuryPerCustNameListInfoByCustNoResponse{" +
				"nameListInfo=" + nameListInfo +
				'}';
    }
}
