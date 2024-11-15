package com.pluralsight;

public class Drink {
    private String size;
    private String flavor;
    private double price;

    public Drink(String size, String flavor) {
        this.size = size;
        this.flavor = flavor;

        if (size.equalsIgnoreCase("small")) {
            this.price = 2.00;
        } else if (size.equalsIgnoreCase("medium")) {
            this.price = 2.50;
        } else if (size.equalsIgnoreCase("large")) {
            this.price = 3.00;
        }

    }

    public double getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public String getFlavor() {
        return flavor;
    }

    @Override
    public String toString() {
        return size + " " + flavor + " drink ($" + price + ")";
    }



}
