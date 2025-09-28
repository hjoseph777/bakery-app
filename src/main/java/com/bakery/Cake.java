package com.bakery;
/**
 * Abstract base class for all cake types in the bakery.
 * Every cake has a name and needs a way to calculate its price.
 * This class cannot be created directly - you must use ReadyCake or CustomCake.
 */
public abstract class Cake {
    
    // Every cake has a name (like "Chocolate Cake" or "Bob's Birthday Cake")
    protected String cakeName;
    
    // Constructor - every cake needs a name when it's created
    public Cake(String cakeName) {
        this.cakeName = cakeName;
    }
    
    // Get the name of this cake
    public String getCakeName() {
        return cakeName;
    }
    
    // Every type of cake calculates its price differently
    // ReadyCake has a fixed price, CustomCake calculates by weight + fee
    public abstract double calculatePrice();
    
    // Helper method to display cake info nicely
    @Override
    public String toString() {
        return cakeName + " - $" + String.format("%.2f", calculatePrice());
    }
}