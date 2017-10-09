package com.biedou.response;

import org.springframework.beans.factory.annotation.Autowired;

public class LoginResponse {
    @Autowired
    boolean isSuccess;

    public LoginResponse(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }
}
