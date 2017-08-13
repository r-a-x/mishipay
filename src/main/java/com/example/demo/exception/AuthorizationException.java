package com.example.demo.exception;

public class AuthorizationException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Authorization failed";
    }
}
