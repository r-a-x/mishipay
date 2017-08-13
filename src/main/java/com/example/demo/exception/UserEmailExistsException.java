package com.example.demo.exception;

public class UserEmailExistsException extends RuntimeException {

    private String email;

    public UserEmailExistsException(String email) {
        this.email = email;
    }

    @Override
    public String getMessage() {
        return "User account with email address " + email + " already exists";
    }
}
