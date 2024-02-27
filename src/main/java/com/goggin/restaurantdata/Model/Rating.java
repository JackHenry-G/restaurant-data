package com.goggin.restaurantdata.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rating {
    private int count;
    private double starRating;

    public Rating() {

    }

    public Rating(int count, double starRating) {
        this.count = count;
        this.starRating = starRating;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getStarRating() {
        return starRating;
    }

    public void setStarRating(double starRating) {
        this.starRating = starRating;
    }

}
