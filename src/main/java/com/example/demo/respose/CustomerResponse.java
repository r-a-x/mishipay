package com.example.demo.respose;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by rahulb on 14/8/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerResponse  implements Serializable{

    @JsonProperty("id")
    private String id;

    public CustomerResponse(String id) {
        this.id = id;
    }

    public CustomerResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
