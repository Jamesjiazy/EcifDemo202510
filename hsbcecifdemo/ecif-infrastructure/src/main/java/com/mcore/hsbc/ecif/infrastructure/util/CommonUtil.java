package com.mcore.hsbc.ecif.infrastructure.util;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
* *********************************************************************************************************************
* <br>    系统名称：外网通用分布式核心
* <br>    微服务名称：HSBC ECIF DEMO
* <br>    版本号：head
* <br>    创建者：zj_zengq
* <br>    创建日期：2025-09-19 14:45:51
* <br>    程序功能：
* <br> ----------------------------------------------------------------------------------------------------------------
* <br>    功能及场景描述：
* <br> ----------------------------------------------------------------------------------------------------------------
* <br>    修改说明：
* <br>    日期   修改人    修改说明
* <br> ----------------------------------------------------------------------------------------------------------------
* <br>
*
*/

public class CommonUtil {


   public static <T> T transJSONObject(Object obj, Class<T> entity) {
        JSONObject jsonObj = JSONObject.parseObject(JSONObject.toJSONString(obj));
        return JSON.toJavaObject(jsonObj, entity);
    }

    public static Map<String, Object> buildRestRequest(HttpServletRequest request) {
        Map<String, Object> requestMap = new HashMap<>(16);
        String requestBody = requestBody(request);
        if (StringUtils.isNotBlank(requestBody)) {
           requestMap = JSONObject.parseObject(requestBody, Map.class);
        }
        return requestMap;
    }

    private static String requestBody(HttpServletRequest request) {
        String requestBody = "";
        BufferedReader bufferedReader = null;
        try {
            StringBuffer strBuffer = new StringBuffer();
            String temp = null;
            bufferedReader = request.getReader();
            while((temp = bufferedReader.readLine()) != null) {
               strBuffer.append(temp);
            }
            byte[] body = strBuffer.toString().getBytes();
            bufferedReader.close();
            requestBody = new String(body);
            return requestBody;
        } catch (IOException ex) {
            throw new RuntimeException("解析请求报问题出现异常");
        } finally {
            if (bufferedReader != null) {
                try {
                  bufferedReader.close();
                } catch (IOException e) {
                  e.printStackTrace();
                }
            }
        }
    }

    /**
     * 只比较 newObj 中非 null 的字段
     * @param oldObj 旧的对象
     * @param newObj 新的对象
     * @return true：这些字段一致；false：有不一致
     */
    public static boolean isSameByNonNullFields(Object oldObj, Object newObj) {
        if (oldObj == null || newObj == null) {
            return false;
        }

        Class<?> clazz = newObj.getClass();
        if (!clazz.equals(oldObj.getClass())) {
            throw new IllegalArgumentException("Object is not same class");
        }

        try {
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);

                Object value2 = field.get(newObj);
                if (value2 == null) {
                    continue; // 只比较 newObj 非 null 的字段
                }

                Object value1 = field.get(oldObj);

                if (!Objects.equals(value1, value2)) {
                    return false; // 有任意一个字段不一致
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return true;
    }

    /**
     * 复制 List 对象，只复制字段名相同的数据（加强版）
     *
     * @param sourceList  源对象列表
     * @param targetClass 目标对象类型
     * @param <S>         源对象类型
     * @param <T>         目标对象类型
     * @return 目标对象列表
     */
    public static <S, T> List<T> copyList(List<S> sourceList, Class<T> targetClass) {
        return sourceList.stream()
                .map(source -> {
                    try {
                        // 先创建目标对象
                        T target = targetClass.getDeclaredConstructor().newInstance();
                        // 再拷贝属性
                        BeanUtil.copyProperties(source, target, CopyOptions.create().ignoreNullValue().ignoreError()     // 忽略类型不兼容错误
                        );
                        return target;
                    } catch (Exception e) {
                        throw new RuntimeException("Bean copy error", e);
                    }
                })
                .collect(Collectors.toList());
    }



}
