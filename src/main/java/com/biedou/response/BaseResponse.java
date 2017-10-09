package com.biedou.response;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseResponse<K> {
    @Autowired
    int code;

    @Autowired
    String msg;

    @Autowired
    K responData;

    public BaseResponse(int code, String msg, K responData) {
        this.code = code;
        this.msg = msg;
        this.responData = responData;
    }
}
