package com.example.demo.models;

import java.io.Serializable;

/**
 * Created by rahulb on 13/8/17.
 */
public class Order implements Serializable {

    private String variant_id;
    private String price;
    private String quantity;
    private String taxable ;
    private Boolean custom=false;

    public Order() {
    }

    public Order(String title, String price, String quantity, String taxable) {
        this.variant_id = title;
        this.price = price;
        this.quantity = quantity;
        this.taxable = taxable;
    }

    public String getvariant_id() {
        return variant_id;
    }

    public void setTvariant_id(String title) {
        this.variant_id = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getTaxable() {
        return taxable;
    }

    public void setTaxable(String taxable) {
        this.taxable = taxable;
    }
}
