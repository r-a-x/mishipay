package com.example.demo.controller;


import com.example.demo.bean.AuthenticatedEntityContext;
import com.example.demo.bean.ThreadLocalWrapper;
import com.example.demo.enums.Role;

public class AuthenticatedController implements RequiresAuthentication {

    public AuthenticatedEntityContext getRequestEntityContext() {
        return ThreadLocalWrapper.getRequestEntityContext();
    }

    public String getEntityId() {
        return getRequestEntityContext().getEntityId();
    }

    public String getEntityEmail() {
        return getRequestEntityContext().getEntityEmail();
    }

    public String getEntityName() {
        return getRequestEntityContext().getEntityName();
    }

    public String getAccessToken() {
        return getRequestEntityContext().getAccessToken();
    }

    public String getIpAddress() {
        return getRequestEntityContext().getIpAddress();
    }

    public Role getRole() {
        return getRequestEntityContext().getRole();
    }
}
