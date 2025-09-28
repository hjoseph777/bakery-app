package com.bakery;

/**
 * Custom-order cakes that we bake specially for each customer.
 * These cakes are priced by weight plus an extra fee for customization.
 * 
 * Examples: Bob's Birthday Cake, Wedding Cake, Anniversary Cake, etc.
 * Price = (cost per kg × weight in kg) + customization fee
 */
public class CustomCake extends Cake {
    
    // How much we charge per kilogram for this type of cake
    private double pricePerKg;
    
    // How heavy this cake is (in kilograms)
    private double weightInKg;
    
    // Extra fee for custom decorations, special designs, etc.
    private double customizationFee;
    
    // Constructor - create a custom cake with all the pricing details
    public CustomCake(String cakeName, double pricePerKg, double weightInKg, double customizationFee) {
        super(cakeName);  // Call parent constructor to set the name
        this.pricePerKg = pricePerKg;
        this.weightInKg = weightInKg;
        this.customizationFee = customizationFee;
    }
    
    // Get the price per kilogram
    public double getPricePerKg() {
        return pricePerKg;
    }
    
    // Get the weight of this cake
    public double getWeightInKg() {
        return weightInKg;
    }
    
    // Get the customization fee
    public double getCustomizationFee() {
        return customizationFee;
    }
    
    // Calculate the total price: (price per kg × weight) + customization fee
    @Override
    public double calculatePrice() {
        double baseCost = pricePerKg * weightInKg;
        double totalPrice = baseCost + customizationFee;
        return totalPrice;
    }
    
    // Display detailed info about this custom cake
    @Override
    public String toString() {
        return cakeName + " (Custom: " + weightInKg + "kg @ $" + 
               String.format("%.2f", pricePerKg) + "/kg + $" + 
               String.format("%.2f", customizationFee) + " fee) - $" + 
               String.format("%.2f", calculatePrice());
    }
}
