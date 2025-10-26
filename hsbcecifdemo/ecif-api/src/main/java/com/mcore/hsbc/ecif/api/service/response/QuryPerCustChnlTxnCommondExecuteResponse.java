package com.mcore.hsbc.ecif.api.service.response;

import java.util.List;
import com.mcore.base.header.CoreAppResponseHeader;
import com.mcore.hsbc.ecif.api.service.model.CustChnlTxnCommondApiMd;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号：head
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：对私客户交易渠道控制查询-出参
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class QuryPerCustChnlTxnCommondExecuteResponse
    extends CoreAppResponseHeader
{
    /**
     * 客户交易渠道限制信息列表
     */
    private List<CustChnlTxnCommondApiMd> custTxnChnlLmtList;

    public QuryPerCustChnlTxnCommondExecuteResponse() {
    }

    public void setCustTxnChnlLmtList(List<CustChnlTxnCommondApiMd> custTxnChnlLmtList) {
        this.custTxnChnlLmtList = custTxnChnlLmtList;
    }

    public List<CustChnlTxnCommondApiMd> getCustTxnChnlLmtList() {
        return this.custTxnChnlLmtList;
    }

    @Override
    public String toString() {
        return "QuryPerCustChnlTxnCommondQuryPerCustChnlTxnCommondResponse{" +
				"custTxnChnlLmtList=" + custTxnChnlLmtList +
				'}';
    }
}
