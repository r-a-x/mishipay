package com.example.demo.bean;


import com.example.demo.enums.Role;

public class AuthenticatedEntityContext {

    private String entityId;

    private String entityEmail;

    private String entityName;

    private String accessToken;

    private String ipAddress;

    private Role role;

    public AuthenticatedEntityContext() {

    }

    public AuthenticatedEntityContext(String entityId, String entityEmail, String entityName, String accessToken, String ipAddress, Role role) {
        this.entityId = entityId;
        this.entityEmail = entityEmail;
        this.entityName = entityName;
        this.accessToken = accessToken;
        this.ipAddress = ipAddress;
        this.role = role;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getEntityEmail() {
        return entityEmail;
    }

    public void setEntityEmail(String entityEmail) {
        this.entityEmail = entityEmail;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
