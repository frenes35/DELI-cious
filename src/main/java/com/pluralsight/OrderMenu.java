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


        }
    }
}
