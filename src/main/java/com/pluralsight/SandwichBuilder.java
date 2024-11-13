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
}
