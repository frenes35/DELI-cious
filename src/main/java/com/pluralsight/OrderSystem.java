package com.pluralsight;

public class OrderSystem {
    public static void main(String[] args) {

        boolean running = true;
        while (running) {
            System.out.println("---- DELI-cious Order System ----");
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.print("Your choice: ");

        }

    }

    private static void startNewOrder() {
        Order order = new Order();
        OrderMenu orderMenu = new OrderMenu(order);
        orderMenu.displayOrderMenu();
    }
}
