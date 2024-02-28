package com.goggin.restaurantdata.Model;

import java.util.List;

import lombok.ToString;

@ToString
public class Restaurant {
    private String name;
    private Address address;
    private Rating rating;
    private List<Cuisine> cuisines;

    public Restaurant() {

    }

    public Restaurant(String name, Address address, Rating rating, List<Cuisine> cuisines) {
        this.name = name;
        this.address = address;
        this.rating = rating;
        this.cuisines = cuisines;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public List<Cuisine> getCuisines() {
        return cuisines;
    }

    public void setCuisines(List<Cuisine> cuisines) {
        this.cuisines = cuisines;
    }

}
