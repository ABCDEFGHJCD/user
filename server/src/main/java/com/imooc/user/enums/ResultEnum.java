package com.imooc.user.enums;

import lombok.Getter;

/**
 * Created by 廖师兄
 * 2017-12-10 17:32
 */
@Getter
public enum ResultEnum {

    /**
     *登录
     */
    LOGIN_FAIL(1, "登录失败"),

    /**
     * 角色权限
     */
    ROLE_ERROR(2, "角色权限有误"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
