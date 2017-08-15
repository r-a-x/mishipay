package com.example.demo.request;

import java.io.Serializable;

/**
 * Created by rahulb on 15/8/17.
 */
public class CustomerId implements Serializable{
    private String id;

    public CustomerId() {
    }

    public CustomerId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
