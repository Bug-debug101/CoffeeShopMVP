public class Pastry extends MenuItem {
    private boolean warm;

    public Pastry(String name, double price, boolean warm) {
        super(name, price);
        this.warm = warm;
    }

    public boolean isWarm() {
        return warm;
    }

    public void display() {
        String status = warm ? "Warmed" : "Cold";
        System.out.println("Pastry: " + getName() + " (" + status + ") - $" + getPrice());
    }
}

