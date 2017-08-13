package com.example.demo.exception;

public class UserIdNotFoundException extends RuntimeException {

    @Override
    public String getMessage() {
        return "User details not found";
    }
}
