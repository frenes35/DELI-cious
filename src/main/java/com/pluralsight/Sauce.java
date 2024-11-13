package com.pluralsight;

public class Sauce {

    private String name;

    public Sauce(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " sauce";
    }


}
