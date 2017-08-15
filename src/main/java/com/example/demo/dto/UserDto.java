package com.example.demo.dto;

import java.io.Serializable;
import java.util.Date;

public class UserDto implements Serializable {

    private String id;

    private String email;

    private String name;

    private Date createdOn;

    private String accessToken;

    public UserDto() {

    }

    public UserDto(String id, String email, String name, Date createdOn) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.createdOn = createdOn;
    }

    public UserDto(String id, String email, String firstName, Date createdOn, String accessToken) {
        this.id=id;
        this.email=email;
        this.name = firstName;
        this.accessToken=accessToken;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}
