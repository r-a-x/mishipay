package com.example.demo.exception;

public class UserEmailNotFoundException extends RuntimeException {

    private String email;

    public UserEmailNotFoundException(String email) {
        this.email = email;
    }

    @Override
    public String getMessage() {
        return "User account with email address " + email + " not found";
    }
}
