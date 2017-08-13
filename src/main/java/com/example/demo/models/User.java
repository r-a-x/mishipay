package com.example.demo.models;


import com.example.demo.dto.UserDto;
import com.example.demo.util.Password;
import com.mongodb.BasicDBList;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.UUID;

public class User {

    @Id
    private String id;

    private String firstName;
    private String lastName;
    private String email;
    private String phone ;
    private Boolean verifiedEmail;
    private BasicDBList address;
    private String encryptedPassword;
    private Boolean sendEmailWelcome;
    private String accessToken;
    private Date createdOn;
    private Date modifiedOn;

    public User() {

    }

    public User(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.encryptedPassword = Password.encrypt(password);
        this.accessToken = UUID.randomUUID().toString();
        this.createdOn = new Date();
        this.modifiedOn = new Date();
    }

    public UserDto toDto() {
        return new UserDto(id, email, name, createdOn);
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

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    public void setPassword(String password) {
        this.encryptedPassword = Password.encrypt(password);
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }
}
