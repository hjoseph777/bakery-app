package com.bakery;

/**
 * Welcome to our Bakery Management System!
 * This program shows how different types of cakes can be stored together
 * and have their prices calculated in different ways (that's polymorphism!).
 */
public class BakeryApp {
    
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("=== Welcome to Sweet Dreams Bakery ===");
        System.out.println("Today's Available Cakes:\n");
        
        // Create our cake inventory - mix of ready-made and custom cakes
        Cake[] todaysCakes = createBakeryCakeInventory();
        
        // Show each cake and its price (polymorphism in action!)
        displayAllCakesWithPrices(todaysCakes);
        
        // Calculate and show the total value of our inventory
        double totalInventoryValue = calculateTotalValue(todaysCakes);
        
        System.out.println("\n" + "=".repeat(50));
        System.out.println("TOTAL INVENTORY VALUE: $" + String.format("%.2f", totalInventoryValue));
        System.out.println("Total Cakes Available: " + todaysCakes.length);
        System.out.println("=".repeat(50));
    }
    
    // Create our bakery's cake inventory with 20 different cakes
    private static Cake[] createBakeryCakeInventory() {
        
        // Array to hold all our cakes (both ReadyCake and CustomCake objects)
        Cake[] cakeInventory = new Cake[20];
        
        // Add 10 ready-made cakes (sitting in our display case)
        cakeInventory[0] = new ReadyCake("Carrot Cake", 30.0);
        cakeInventory[1] = new ReadyCake("Chocolate Cake", 35.0);
        cakeInventory[2] = new ReadyCake("Vanilla Cake", 25.0);
        cakeInventory[3] = new ReadyCake("Red Velvet Cake", 40.0);
        cakeInventory[4] = new ReadyCake("Lemon Cake", 28.0);
        cakeInventory[5] = new ReadyCake("Marble Cake", 32.0);
        cakeInventory[6] = new ReadyCake("Coffee Cake", 30.0);
        cakeInventory[7] = new ReadyCake("Black Forest Cake", 45.0);
        cakeInventory[8] = new ReadyCake("Cheesecake", 38.0);
        cakeInventory[9] = new ReadyCake("Tiramisu Cake", 42.0);
        
        // Add 10 custom-order cakes (made specially for customers)
        cakeInventory[10] = new CustomCake("Bob's Birthday Cake", 40.0, 2.5, 15.0);
        cakeInventory[11] = new CustomCake("Wedding Cake", 50.0, 5.0, 25.0);
        cakeInventory[12] = new CustomCake("Anniversary Cake", 45.0, 3.0, 20.0);
        cakeInventory[13] = new CustomCake("Baby Shower Cake", 35.0, 2.0, 10.0);
        cakeInventory[14] = new CustomCake("Graduation Cake", 42.0, 4.0, 18.0);
        cakeInventory[15] = new CustomCake("Custom Chocolate", 38.0, 1.5, 12.0);
        cakeInventory[16] = new CustomCake("Custom Vanilla", 36.0, 2.2, 14.0);
        cakeInventory[17] = new CustomCake("Theme Park Cake", 48.0, 3.5, 22.0);
        cakeInventory[18] = new CustomCake("Cartoon Cake", 44.0, 2.8, 16.0);
        cakeInventory[19] = new CustomCake("Special Order Cake", 52.0, 6.0, 30.0);
        
        return cakeInventory;
    }
    
    // Display each cake with its calculated price
    private static void displayAllCakesWithPrices(Cake[] cakes) {
        
        // Show ready-made cakes first (indexes 0-9)
        System.out.println("📋 READY-MADE CAKES (sitting in our display case):");
        for (int i = 0; i < 10; i++) {
            // This is polymorphism! Each cake calculates its price differently
            // but we call calculatePrice() the same way on all of them
            System.out.println((i + 1) + ". " + cakes[i].toString());
        }
        
        System.out.println("\n");
        
        // Show custom-order cakes (indexes 10-19)
        System.out.println("🎂 CUSTOM-ORDER CAKES (made specially for customers):");
        for (int i = 10; i < 20; i++) {
            // This is polymorphism again! Same method call, different calculation
            System.out.println((i + 1) + ". " + cakes[i].toString());
        }
    }
    
    // Calculate the total value of all cakes in our inventory
    private static double calculateTotalValue(Cake[] cakes) {
        
        double totalValue = 0.0;
        
        // Add up the price of each cake (polymorphism again!)
        for (Cake cake : cakes) {
            totalValue += cake.calculatePrice();
        }
        
        return totalValue;
    }
}
