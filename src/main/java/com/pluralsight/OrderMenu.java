package com.pluralsight;

import java.util.Scanner;

public class OrderMenu {
    private Order order;
    private Scanner scanner = new Scanner(System.in);

    public OrderMenu(Order order) {
        this.order = order;


    }

    public void displayOrderMenu() {
        boolean ordering = true;
        while (ordering) {
            System.out.println("\n--- Order Menu ---");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Complete Order");
            System.out.println("0) Cancel Order");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                addSandwich();
            } else if (choice == 2) {
                addDrink();
            } else if (choice == 3) {
                addChips();
            } else if (choice == 4) {
                checkout();
                ordering = false;
            } else if (choice == 0) {
                System.out.println("Order canceled.");
                ordering = false;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }


        }
    }

    private void addSandwich() {
        SandwichBuilder sandwichBuilder = new SandwichBuilder();
        Sandwich sandwich = sandwichBuilder.buildSandwich();
        order.addSandwich(sandwich);
        System.out.println("Sandwich added to order.");
    }

    private void addDrink() {
        DrinkBuilder drinkBuilder = new DrinkBuilder();
        Drink drink = drinkBuilder.buildDrink();
        order.addDrink(drink);
        System.out.println("Drink added to order.");
    }

    private void addChips() {
        System.out.print("Select chips type. (Plain/BBQ/Sour Cream): ");
        String type = scanner.nextLine();
        Chips chips = new Chips(type);
        order.addChips(chips);
        System.out.println(type + " Chips added to order.");
    }
    private void checkout() {
        System.out.println("\n--- Order Summary ---");
        System.out.println(order);
        System.out.println("Total Amount: $" + order.calculateTotal());
        Receipt.saveOrder(order);
        System.out.println("Order completed and receipt saved.");
    }


}
