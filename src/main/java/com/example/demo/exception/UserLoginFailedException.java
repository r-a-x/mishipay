package com.example.demo.exception;

public class UserLoginFailedException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Invalid email and password combination";
    }
}
