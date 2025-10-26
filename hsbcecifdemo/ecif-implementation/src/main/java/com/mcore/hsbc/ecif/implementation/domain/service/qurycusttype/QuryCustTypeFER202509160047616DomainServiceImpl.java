package com.mcore.hsbc.ecif.implementation.domain.service.qurycusttype;

import com.mcore.hsbc.ecif.domain.service.qurycusttype.QuryCustTypeFER202509160047616Service;
import com.mcore.hsbc.ecif.domain.service.qurycusttype.input.QuryCustTypeFER202509160047616ExecuteInputDTO;
import com.mcore.hsbc.ecif.domain.service.qurycusttype.output.QuryCustTypeFER202509160047616ExecuteOutputDTO;


/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号： 0.0.1-SNAPSHOT
 * <br>    创建者：zj_zengq
 * <br>    创建日期： 2025-09-19 14:45:52
 * <br>    程序功能：查询客户类型
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：根据客户号查询客户基本信息，获取客户类型0-对私，1-对公，2-金融
 * 检查：查询不到信息报错阻断：客户信息不存在
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 * 
 */
public class QuryCustTypeFER202509160047616DomainServiceImpl
    implements QuryCustTypeFER202509160047616Service
{

    /**
     * execute
     * 方法描述：根据客户号查询客户基本信息，获取客户类型0-对私，1-对公，2-金融
     * 检查：查询不到信息报错阻断：客户信息不存在
     * 
     * @param input
     * @return
     */
    @Override
    public QuryCustTypeFER202509160047616ExecuteOutputDTO execute(QuryCustTypeFER202509160047616ExecuteInputDTO input) {
        QuryCustTypeFER202509160047616ExecuteOutputDTO quryCustTypeFER202509160047616ExecuteOutputDTO = new QuryCustTypeFER202509160047616ExecuteOutputDTO();
        return quryCustTypeFER202509160047616ExecuteOutputDTO;
    }
}
