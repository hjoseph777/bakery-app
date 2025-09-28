package com.bakery;

/**
 * Ready-made cakes that are already baked and sitting in our display case.
 * These cakes have a fixed price - no calculations needed!
 * 
 * Examples: Carrot Cake ($30), Chocolate Cake ($35), etc.
 */
public class ReadyCake extends Cake {
    
    // The fixed price for this ready-made cake
    private double fixedPrice;
    
    // Constructor - create a ready-made cake with a name and fixed price
    public ReadyCake(String cakeName, double fixedPrice) {
        super(cakeName);  // Call parent constructor to set the name
        this.fixedPrice = fixedPrice;
    }
    
    // Get the fixed price of this cake
    public double getFixedPrice() {
        return fixedPrice;
    }
    
    // For ready-made cakes, the price is simple - just return the fixed price
    @Override
    public double calculatePrice() {
        return fixedPrice;
    }
    
    // Display extra info about this being a ready-made cake
    @Override
    public String toString() {
        return cakeName + " (Ready-Made) - $" + String.format("%.2f", calculatePrice());
    }
}
