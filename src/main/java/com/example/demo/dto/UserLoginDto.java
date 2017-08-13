package com.example.demo.dto;

import java.io.Serializable;

public class UserLoginDto implements Serializable {

    private String id;

    private String email;

    private String accessToken;

    public UserLoginDto() {

    }

    public UserLoginDto(String id, String email, String accessToken) {
        this.id = id;
        this.email = email;
        this.accessToken = accessToken;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
