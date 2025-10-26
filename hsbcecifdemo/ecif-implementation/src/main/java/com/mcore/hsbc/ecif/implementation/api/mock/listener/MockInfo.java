package com.mcore.hsbc.ecif.implementation.api.mock.listener;

import lombok.Data;

@Data
public class MockInfo {

    /**
     * 挡板名称
     */
    private String mockName;

    /**
     * 微服务名
     */
    private String module;

    /**
     * 服务名
     */
    private String service;

    /**
     * 方法名
     */
    private String method;

    /**
     * MVEL表达式，目前只支持等值表达式
     */
    private String mvelExp;

    /**
     * mock数据
     */
    private String data;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String updateTime;

    /**
     * 更新人
     */
    private String updateOper;

}
