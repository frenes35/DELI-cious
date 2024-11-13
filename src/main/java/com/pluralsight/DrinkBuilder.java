package com.pluralsight;

import java.util.Scanner;

public class DrinkBuilder {
    private final Scanner scanner = new Scanner(System.in);

    public Drink buildDrink() {
        System.out.println("\n--- Drink Maker ---");
        System.out.print("Size (Small/Medium/Large): ");
        String size = scanner.nextLine();
        System.out.print("Flavor (Cola/Lemonade/Orange/Water): ");
        String flavor = scanner.nextLine();
        return new Drink(size, flavor);
    }

}
