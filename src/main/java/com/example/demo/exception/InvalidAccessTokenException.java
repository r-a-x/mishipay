package com.example.demo.exception;

public class InvalidAccessTokenException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Invalid access token";
    }
}
