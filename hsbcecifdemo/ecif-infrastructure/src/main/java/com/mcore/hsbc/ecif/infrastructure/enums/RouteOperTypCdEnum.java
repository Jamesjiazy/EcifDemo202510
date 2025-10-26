package com.mcore.hsbc.ecif.infrastructure.enums;

public enum RouteOperTypCdEnum {
    ADD("01"),
    MOD("02"),
    DEL("03"),
    OTHER("err");
    private final String code;

    RouteOperTypCdEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    /** 根据前端穿的 code 拿到枚举 */
    public static RouteOperTypCdEnum of(String code) {
        for (RouteOperTypCdEnum e : values()) {
            if (e.code.equals(code)) {
                return e;
            }
        }
       return OTHER;
    }
}
