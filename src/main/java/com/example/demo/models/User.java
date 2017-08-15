package com.example.demo.models;


import com.example.demo.dto.UserDto;
import com.example.demo.request.Address;
import com.example.demo.util.Password;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class User {

    @Id
    private String id;

    private String uid;
    private String firstName;
    private String lastName;
    private String email;
    private String phone ;
    private Boolean verifiedEmail;
    private List<Address> address;
    private String encryptedPassword;
    private Boolean sendEmailWelcome;
    private String accessToken;
    private Date createdOn;
    private Date modifiedOn;

    public User() {

    }

    public User(String uid, String firstName, String lastName, String email, String phone, Boolean verifiedEmail, List<Address> address, String encryptedPassword, Boolean sendEmailWelcome) {
        this.uid = uid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.verifiedEmail = verifiedEmail;
        this.address = address;
        this.encryptedPassword = Password.encrypt(encryptedPassword);
        this.sendEmailWelcome = sendEmailWelcome;
        this.accessToken = UUID.randomUUID().toString();
        this.createdOn = new Date();
        this.modifiedOn = new Date();
    }


    public UserDto toDto() {
        return new UserDto(id, email, firstName, createdOn,accessToken);
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getVerifiedEmail() {
        return verifiedEmail;
    }

    public void setVerifiedEmail(Boolean verifiedEmail) {
        this.verifiedEmail = verifiedEmail;
    }


    public Boolean getSendEmailWelcome() {
        return sendEmailWelcome;
    }

    public void setSendEmailWelcome(Boolean sendEmailWelcome) {
        this.sendEmailWelcome = sendEmailWelcome;
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

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
