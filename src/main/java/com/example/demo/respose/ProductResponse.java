package com.example.demo.respose;

import com.example.demo.models.Product;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by rahulb on 13/8/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductResponse implements Serializable{
    @JsonProperty(value = "products")
    private List<Product> products;

    public ProductResponse(List<Product> products) {
        this.products = products;
    }

    public ProductResponse() {
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}

