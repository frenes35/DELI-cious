package com.pluralsight;

import java.util.Scanner;

public class OrderSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        boolean running = true;
        while (running) {
            System.out.println("---- DELI-cious Order System ----");
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.print("Your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                startNewOrder();
            } else if (choice == 0) {
                System.out.println("Exiting...");
                running = false;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        }



    private static void startNewOrder() {
        Order order = new Order();
        OrderMenu orderMenu = new OrderMenu(order);
        orderMenu.displayOrderMenu();
    }
}
