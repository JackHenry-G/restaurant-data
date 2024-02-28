package com.goggin.restaurantdata.Model;

import lombok.ToString;

@ToString
public class Address {
    private String city;
    private String firstLine;
    private String postalCode;

    public Address() {
    }

    public Address(String city, String firstLine, String postalCode) {
        this.city = city;
        this.firstLine = firstLine;
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

}
