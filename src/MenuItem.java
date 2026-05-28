// MenuItem.java
public class MenuItem {
    // Encapsulation: Private fields protect data from direct outside modification
    private String name;
    private double basePrice;

    // Constructor
    public MenuItem(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    // Encapsulation: Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getBasePrice() { return basePrice; }
    public void setBasePrice(double basePrice) {
        if (basePrice >= 0) { // Simple data validation
            this.basePrice = basePrice;
        }
    }

    // Method to be overridden by subclasses
    public void displayInfo() {
        System.out.println("Item: " + name + " | Price: $" + basePrice);
    }

    // Polymorphism (Compile-time): Method Overloading
    // Version 1: Standard cost calculation
    public double calculateCost(int quantity) {
        return basePrice * quantity;
    }

    // Version 2: Overloaded cost calculation applying a dollar-off discount
    public double calculateCost(int quantity, double discount) {
        double total = (basePrice * quantity) - discount;
        return total > 0 ? total : 0; // Ensures total doesn't go negative
    }
}
