package com.pluralsight;

import java.util.List;

public class Sandwich {
    private String size;
    private String breadType;
    private boolean toasted;
    private List<Topping> toppings;
    private List<Sauce> sauces;

    public Sandwich(String size, String breadType, boolean toasted, List<Topping> toppings, List<Sauce> sauces) {
        this.size = size;
        this.breadType = breadType;
        this.toasted = toasted;
        this.toppings = toppings;
        this.sauces = sauces;
    }
}
