package com.example.demo.respose;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by rahulb on 14/8/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerCreateResponse implements Serializable{
    @JsonProperty(value = "customer")
    private CustomerResponse customerResponse;

    public CustomerCreateResponse(CustomerResponse customerResponse) {
        this.customerResponse = customerResponse;
    }

    public CustomerCreateResponse() {
    }

    public CustomerResponse getCustomerResponse() {
        return customerResponse;
    }

    public void setCustomerResponse(CustomerResponse customerResponse) {
        this.customerResponse = customerResponse;
    }
}

