package com.example.springboot.exception;

import lombok.Getter;

/**
 * 功能：
 * 作者：啊花
 * 日期：2024/2/2 19:41
 */
@Getter
public class ServiceException extends RuntimeException {

    private final String code;

    public ServiceException(String msg) {
        super(msg);
        this.code = "500";
    }

    public ServiceException(String code, String msg) {
        super(msg);
        this.code = code;
    }

}