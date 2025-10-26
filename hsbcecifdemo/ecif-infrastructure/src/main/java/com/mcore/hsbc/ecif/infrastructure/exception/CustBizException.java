package com.mcore.hsbc.ecif.infrastructure.exception;

import com.mcore.base.enums.common.IResultCode;
import com.mcore.base.exception.AbstractBaseException;
import com.mcore.hsbc.ecif.infrastructure.constants.CustomConstants;
import com.mcore.hsbc.ecif.infrastructure.enums.ErrorCodeEnum;

/**
 * 系统名称 : SC6000b 分布式核心系统
 * 微服务名称 : 客户中心
 * 版本号 : V2.0.0.0
 * 创建者: @author zj_songys
 * 创建日期 : 2022-02-03
 * 程序功能 : 业务异常类
 * -----------------------------------------------------
 * 功能及场景描述 :抛出业务异常
 * -----------------------------------------------------
 * 修改说明 :
 * 日期  修改人  修改原因
 */
public class CustBizException extends AbstractBaseException {

    /**
     * 业务异常默认不可重试
     */
//    private static final boolean CAN_RETRY = false;

    /**
     * Instantiates a new Biz exception.
     *
     * @param enumCode 错误码
     */
    public CustBizException(IResultCode enumCode) {
        super(enumCode.getCode(), CustomConstants.CAN_RETRY);
    }

    /**
     * Instantiates a new Biz exception.
     *
     * @param enumCode 错误码
     * @param canRetry 自定义是否重试
     */
    public CustBizException(IResultCode enumCode, Boolean canRetry) {
        super(enumCode.getCode(), canRetry);
    }

    /**
     * 构造函数
     *
     * @param enumCode    错误码
     * @param placeHolder 错误码占位符,例如{0}业务异常,按顺序传入的参数
     */
    public CustBizException(IResultCode enumCode, Object... placeHolder) {
        super(enumCode.getCode(), CustomConstants.CAN_RETRY, chkPlaceHolder(enumCode, placeHolder));
    }

    /**
     * 构造函数
     *
     * @param errorCode    错误码
     * @param placeHolder 错误码占位符,例如{0}业务异常,按顺序传入的参数
     */
    public CustBizException(String errorCode, Object... placeHolder) {
        super(errorCode, CustomConstants.CAN_RETRY, chkPlaceHolder(errorCode, placeHolder));
    }

    /**
     * 构造函数
     *
     * @param enumCode    错误码
     * @param canRetry    自定义是否重试
     * @param placeHolder 错误码占位符,例如{0}业务异常,按顺序传入的参数
     */
    public CustBizException(IResultCode enumCode, Boolean canRetry, Object... placeHolder) {
        super(enumCode.getCode(), canRetry, chkPlaceHolder(enumCode, placeHolder));
    }

    /**
     * 构造函数
     *
     * @param cause       throwable
     * @param placeHolder 错误码占位符,例如{0}业务异常,按顺序传入的参数
     */
    public CustBizException(IResultCode enumCode, Throwable cause, Object... placeHolder) {
        super(enumCode.getCode(), CustomConstants.CAN_RETRY, cause, chkPlaceHolder(enumCode, placeHolder));
    }

    /**
     * 构造函数
     *
     * @param cause       throwable
     * @param canRetry    自定义是否重试
     * @param placeHolder 错误码占位符,例如{0}业务异常,按顺序传入的参数
     */
    public CustBizException(IResultCode enumCode, Boolean canRetry, Throwable cause, Object... placeHolder) {
        super(enumCode.getCode(), canRetry, cause, chkPlaceHolder(enumCode, placeHolder));
    }

    /**
     * 处理返回错误信息
     *
     * @param enumCode
     * @param placeHolder
     */
    private static Object[] chkPlaceHolder(IResultCode enumCode, Object... placeHolder) {
        return chkPlaceHolder(enumCode.getCode(), placeHolder);
    }

    /**
     * 处理返回错误信息
     *
     * @param errorCode 错误码
     * @param placeHolder 错误信息
     */
    private static Object[] chkPlaceHolder(String errorCode, Object... placeHolder) {
        // 错误码枚举获取错误信息
        String errorCodeName = ErrorCodeEnum.getNameByCode(errorCode);
        boolean codeBool = errorCodeName == null || (errorCodeName != null && !errorCodeName.contains(CustomConstants.ENG_COLON));
        if (codeBool) {
            return placeHolder;
        }
        errorCodeName = errorCodeName.substring(0, errorCodeName.indexOf(CustomConstants.ENG_COLON));
        for (int i = 0; i < placeHolder.length; i++) {
            // 处理输入的错误信息
            String inputErrorInfo = (String) placeHolder[i];
            int index = inputErrorInfo.indexOf(CustomConstants.ENG_COLON);
            if (index >= 0 && errorCodeName.equals(inputErrorInfo.substring(0, index))) {
                inputErrorInfo = inputErrorInfo.substring(index + 1);
            }
            placeHolder[i] = inputErrorInfo;
        }
        return placeHolder;
    }
}


