package com.example.demo.models;

import com.example.demo.dto.AdminDto;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.UUID;

public class Admin {

    @Id
    private String id;

    private String name;

    private String key;

    private Date createdOn;

    private Date modifiedOn;

    public Admin() {

    }

    public Admin(String name) {
        this.name = name;
        this.key = UUID.randomUUID().toString();
        this.createdOn = new Date();
        this.modifiedOn = new Date();
    }

    public AdminDto toDto() {
        return new AdminDto(id, name, createdOn);
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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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
