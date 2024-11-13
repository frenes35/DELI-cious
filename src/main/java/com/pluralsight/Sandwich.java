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

    public double calculatePrice() {
        double basePrice = 0;
        if (size.equals("4")) {
            basePrice = 5.50;
        } else if (size.equals("8")) {
            basePrice = 7.00;
        } else if (size.equals("12")) {
            basePrice = 8.50;
        }

        double toppingsCost = 0;
        for (Topping topping : toppings) {
            toppingsCost += topping.getPrice();
        }
        return basePrice + toppingsCost;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(size).append(" inch ").append(breadType).append(" sandwich");
        if (toasted) sb.append(" (toasted)");
        sb.append(" with toppings: ");
        for (Topping topping : toppings) {
            sb.append(topping.getName()).append(", ");
        }
        sb.append("and sauces: ");
        for (Sauce sauce : sauces) {
            sb.append(sauce.getName()).append(", ");
        }
        return sb.toString();
    }
}
