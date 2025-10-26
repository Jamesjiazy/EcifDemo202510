package com.mcore.hsbc.ecif.infrastructure.util;

import com.mcore.base.header.CoreAppRequestHeader;
import com.mcore.base.tools.StringUtil;
import com.mcore.hsbc.ecif.infrastructure.enums.ErrorCodeEnum;
import com.mcore.hsbc.ecif.infrastructure.exception.ECIFException;

/**
 * *********************************************************************************************************************
 * <br>    系统名称：外网通用分布式核心
 * <br>    微服务名称：HSBC ECIF DEMO
 * <br>    版本号：head
 * <br>    创建者：zj_luosq
 * <br>    创建日期：2025-09-23 14:45:51
 * <br>    程序功能：
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    功能及场景描述：基础的检查工具
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>    修改说明：
 * <br>    日期   修改人    修改说明
 * <br> ----------------------------------------------------------------------------------------------------------------
 * <br>
 */

public class CheckParaUtil {

    private CheckParaUtil() {
    }

    /**
     * @param data    数据
     * @param message 错误信息
     *                检查数据是否为空
     */
    public static void checkInputForEmpty(Object data, String message) {
        if (data instanceof String) {
            if (StringUtil.isEmpty((String) data)) {
                throw new ECIFException(ErrorCodeEnum.E11001, message);
            }
        } else if (data == null) {
            throw new ECIFException(ErrorCodeEnum.E11001, message);
        }
    }

    /**
     * @param data    数据
     * @param message 错误信息
     * @param max     最大值
     * @param min     最小值
     *                检查数据长度
     */
    public static void checkInputForSize(Object data, String message, Integer max, Integer min) {
        if (data instanceof String) {
            if (max > 0 && ((String) data).length() > max) {
                throw new ECIFException(ErrorCodeEnum.E11002, message);
            }
            if (min > 0 && ((String) data).length() < min) {
                throw new ECIFException(ErrorCodeEnum.E11002, message);
            }
        }
    }

    public static void checkServSnglNo(CoreAppRequestHeader request) {
        if (StringUtil.isBlank(request.getServSnglNo())) {
            request.setServSnglNo(request.getBizSnglNo());
        }
    }

    private static boolean checkInputForEmpty(Object data) {
        if (data instanceof String) {
            return StringUtil.isEmpty((String) data);
        }
        return data == null;
    }
}