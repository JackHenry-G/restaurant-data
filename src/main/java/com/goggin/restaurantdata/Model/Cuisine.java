package com.goggin.restaurantdata.Model;

import lombok.ToString;

@ToString
public class Cuisine {
    private String name;
    private String uniqueName;

    public Cuisine() {

    }

    public Cuisine(String name, String uniqueName) {
        this.name = name;
        this.uniqueName = uniqueName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniqueName() {
        return uniqueName;
    }

    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }

}
