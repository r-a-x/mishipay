package com.example.demo.dto;

import java.io.Serializable;
import java.util.Date;

public class AdminDto implements Serializable {

    private String id;

    private String name;

    private Date createdOn;

    public AdminDto() {

    }

    public AdminDto(String id, String name, Date createdOn) {
        this.id = id;
        this.name = name;
        this.createdOn = createdOn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
