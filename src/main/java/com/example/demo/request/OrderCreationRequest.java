package com.example.demo.request;

import com.example.demo.models.Order;

import java.io.Serializable;
import java.util.List;

/**
 * Created by rahulb on 13/8/17.
 */
public class OrderCreationRequest implements Serializable {

    private CustomerId customer;

    private String email;

    private List<Order> line_items;

    private String use_customer_default_address;

    public OrderCreationRequest() {
    }

    public OrderCreationRequest(CustomerId customer, String email, List<Order> line_items, String use_customer_default_address) {
        this.customer = customer;
        this.email = email;
        this.line_items = line_items;
        this.use_customer_default_address = use_customer_default_address;
    }

    public CustomerId getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerId customer) {
        this.customer = customer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Order> getLine_items() {
        return line_items;
    }

    public void setLine_items(List<Order> line_items) {
        this.line_items = line_items;
    }

    public String getUse_customer_default_address() {
        return use_customer_default_address;
    }

    public void setUse_customer_default_address(String use_customer_default_address) {
        this.use_customer_default_address = use_customer_default_address;
    }
}
