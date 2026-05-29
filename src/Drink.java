public class Drink extends MenuItem {
    private String size;

    public Drink(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void display() {
        System.out.println("Drink: " + size + " " + getName() + " - $" + getPrice());
    }
}

