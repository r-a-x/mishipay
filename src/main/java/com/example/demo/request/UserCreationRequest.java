package com.example.demo.request;

import com.mongodb.BasicDBList;

/**
 * Created by rahulb on 13/8/17.
 */
public class UserCreationRequest {

    private String first_name;
    private String last_name;
    private String email;
    private String phone ;
    private Boolean verified_email;
    private Map<String,String> addresses;
    private String password;
    private String password_confirmation;
    private Boolean send_email_welcome;

    public UserCreationRequest(String first_name, String last_name, String email, String phone, Boolean verified_email, BasicDBList address, String password, String password_confirmation, Boolean send_email_welcome) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone = phone;
        this.verified_email = verified_email;
        this.address = address;
        this.password = password;
        this.password_confirmation = password_confirmation;
        this.send_email_welcome = send_email_welcome;
    }

    public UserCreationRequest() {
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getVerified_email() {
        return verified_email;
    }

    public void setVerified_email(Boolean verified_email) {
        this.verified_email = verified_email;
    }

    public BasicDBList getAddress() {
        return address;
    }

    public void setAddress(BasicDBList address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword_confirmation() {
        return password_confirmation;
    }

    public void setPassword_confirmation(String password_confirmation) {
        this.password_confirmation = password_confirmation;
    }

    public Boolean getSend_email_welcome() {
        return send_email_welcome;
    }

    public void setSend_email_welcome(Boolean send_email_welcome) {
        this.send_email_welcome = send_email_welcome;
    }
}
