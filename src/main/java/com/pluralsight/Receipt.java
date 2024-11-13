package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Receipt {
    public static void saveOrder(Order order) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String timestamp = LocalDateTime.now().format(formatter);
        String fileName = "receipts/" + timestamp + ".txt";
        java.io.File directory = new java.io.File("receipts");
        if (!directory.exists()) {
            directory.mkdir();
        }
        try (FileWriter writer = new FileWriter(fileName)) {
            System.out.println("Order Summary:\n------------------- ");
            writer.write(order.toString());
            writer.write("\nTotal Cost: $" + order.calculateTotal() + "\n");
            System.out.println("Receipt saved as " + fileName);
        } catch (IOException e) {
            System.err.println("Error saving receipt: " + e.getMessage());
        }
    }
}