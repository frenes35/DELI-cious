package com.pluralsight;

public class Chips {
    private final double price = 1.50;
    private String type;

    public Chips(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type + " Chips ($" + price + ")";
    }


}
