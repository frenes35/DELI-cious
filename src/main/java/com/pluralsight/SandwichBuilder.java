package com.pluralsight;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SandwichBuilder {

    private Scanner scanner = new Scanner(System.in);

    private List<Topping> selectMeats() {
        List<Topping> meats = new ArrayList<>();
        String[] availableMeats = {"Steak", "Ham", "Salami", "Roast Beef", "Chicken", "Bacon"};
        System.out.println("Choose meats you want to add (Leave blank and press Enter to skip):");
        for (int i = 0; i < availableMeats.length; i++) {
            System.out.println((i + 1) + ") " + availableMeats[i]);
        }
        System.out.print("Enter your choices, separated by commas (e.g. 1,3,5): ");
        String selection = scanner.nextLine();
        if (!selection.isBlank()) {
            String[] selectedMeats = selection.split(",");
            for (String selected : selectedMeats) {
                int index = Integer.parseInt(selected.trim()) - 1;
                if (index >= 0 && index < availableMeats.length) {
                    meats.add(new PremiumTopping(availableMeats[index], 1.00));
                } else {
                    System.out.println("Invalid choice: " + (index + 1));
                }
            }
        }
        return meats;
    }

    private List<Topping> selectCheeses() {
        List<Topping> cheeses = new ArrayList<>();
        String[] availableCheeses = {"American", "Provolone", "Cheddar", "Swiss"};
        System.out.println("Choose cheeses you want to add (Leave blank and press Enter to skip):");
        for (int i = 0; i < availableCheeses.length; i++) {
            System.out.println((i + 1) + ") " + availableCheeses[i]);
        }
        System.out.print("Enter your choices, separated by commas (e.g., 1,3): ");
        String selection = scanner.nextLine();
        if (!selection.isBlank()) {
            String[] selectedCheeses = selection.split(",");
            for (String selected : selectedCheeses) {
                int index = Integer.parseInt(selected.trim()) - 1;
                if (index >= 0 && index < availableCheeses.length) {
                    cheeses.add(new PremiumTopping(availableCheeses[index], 0.75));
                } else {
                    System.out.println("Invalid choice: " + (index + 1));
                }
            }
        }
        return cheeses;
    }

    private List<Topping> selectRegularToppings() {
        List<Topping> regularToppings = new ArrayList<>();
        String[] availableToppings = {
                "Lettuce", "Peppers", "Onions", "Tomatoes", "Jalapenos",
                "Cucumbers", "Pickles", "Guacamole", "Mushrooms"
        };
        System.out.println("Choose regular toppings you want to add (Leave blank and press Enter to skip):");
        for (int i = 0; i < availableToppings.length; i++) {
            System.out.println((i + 1) + ") " + availableToppings[i]);
        }
        System.out.print("Enter your choices, separated by commas (e.g., 1,3,5): ");
        String selection = scanner.nextLine();
        if (!selection.isBlank()) {
            String[] selectedToppings = selection.split(",");
            for (String selected : selectedToppings) {
                int index = Integer.parseInt(selected.trim()) - 1;
                if (index >= 0 && index < availableToppings.length) {
                    regularToppings.add(new RegularTopping(availableToppings[index]));
                } else {
                    System.out.println("Invalid choice: " + (index + 1));
                }
            }
        }
        return regularToppings;
    }
}
