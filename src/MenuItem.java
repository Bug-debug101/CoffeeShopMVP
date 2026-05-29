public class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display() {
        System.out.println(name + " - $" + price);
    }

    // standard cost calculation
    public double getCost(int qty) {
        return price * qty;
    }

    // cost with discount
    public double getCost(int qty, double discount) {
        double total = (price * qty) - discount;
        return total < 0 ? 0 : total;
    }
}

