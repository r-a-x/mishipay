package com.example.demo.request;

/**
 * Created by rahulb on 15/8/17.
 */
public class Address {

        private String address1;
        private String city;
        private String province;
        private String phone;
        private String zip;
        private String last_name;
        private String first_name;
        private String country;

    public Address() {
    }

    public Address(String address1, String city, String province, String phone, String zip, String last_name, String first_name, String country) {
        this.address1 = address1;
        this.city = city;
        this.province = province;
        this.phone = phone;
        this.zip = zip;
        this.last_name = last_name;
        this.first_name = first_name;
        this.country = country;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
