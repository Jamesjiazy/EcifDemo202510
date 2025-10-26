package com.mcore.hsbc.ecif.infrastructure.exception;

import com.mcore.base.enums.common.IResultCode;
import com.mcore.base.exception.AbstractBaseException;

public class ECIFException extends AbstractBaseException {

    /**
     * 业务异常默认不可重试
     */
    private static final boolean CAN_RETRY = false;

    /**
     * Instantiates a new Biz exception.
     *
     * @param enumCode 错误码
     */
    public ECIFException(IResultCode enumCode) {
        super(enumCode.getCode(), CAN_RETRY);
    }

    /**
     * Instantiates a new Biz exception.
     *
     * @param enumCode 错误码
     * @param canRetry 自定义是否重试
     */
    public ECIFException(IResultCode enumCode, Boolean canRetry) {
        super(enumCode.getCode(), canRetry);
    }

    /**
     * 构造函数
     *
     * @param enumCode    错误码
     * @param placeHolder 错误码占位符,例如{0}业务异常,按顺序传入的参数
     */
    public ECIFException(IResultCode enumCode, Object... placeHolder) {
        super(enumCode.getCode(), CAN_RETRY, placeHolder);
    }

    /**
     * 构造函数
     *
     * @param errorCode   错误码
     * @param placeHolder 错误码占位符,例如{0}业务异常,按顺序传入的参数
     */
    public ECIFException(String errorCode, Object... placeHolder) {
        super(errorCode, CAN_RETRY, placeHolder);
    }

    /**
     * 构造函数
     *
     * @param enumCode    错误码
     * @param canRetry    自定义是否重试
     * @param placeHolder 错误码占位符,例如{0}业务异常,按顺序传入的参数
     */
    public ECIFException(IResultCode enumCode, Boolean canRetry, Object... placeHolder) {
        super(enumCode.getCode(), canRetry, placeHolder);
    }

    /**
     * 构造函数
     *
     * @param cause       throwable
     * @param placeHolder 错误码占位符,例如{0}业务异常,按顺序传入的参数
     */
    public ECIFException(IResultCode enumCode, Throwable cause, Object... placeHolder) {
        super(enumCode.getCode(), CAN_RETRY, cause, placeHolder);
    }

    /**
     * 构造函数
     *
     * @param cause       throwable
     * @param canRetry    自定义是否重试
     * @param placeHolder 错误码占位符,例如{0}业务异常,按顺序传入的参数
     */
    public ECIFException(IResultCode enumCode, Boolean canRetry, Throwable cause, Object... placeHolder) {
        super(enumCode.getCode(), canRetry, cause, placeHolder);
    }

}
