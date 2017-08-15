package com.example.demo.request;

import java.io.Serializable;

/**
 * Created by rahulb on 14/8/17.
 */
public class CustomerCreationRequest implements Serializable{

    private UserCreationRequest customer;

    public CustomerCreationRequest(UserCreationRequest userCreationRequest) {
        this.customer = userCreationRequest;
    }

    public UserCreationRequest getCustomer() {
        return customer;
    }

    public void setCustomer(UserCreationRequest customer) {
        this.customer = customer;
    }
}
