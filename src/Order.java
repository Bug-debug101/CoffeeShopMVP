import java.util.ArrayList;
import java.util.List;

public class Order {

    private String customerName;
    private List<MenuItem> items;
    private String address;
    private double total;

    public Order( String customerName) {

        this.customerName = customerName;
        this.items = new ArrayList<MenuItem>();
        this.total = 0;
    }

    public void addItem(MenuItem item) {
        items.add(item);
        total = total + item.getPrice();
    }


    public String getCustomerName() {
        return customerName;
    }

    public double getTotal() {
        return total;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void showOrderSummary() {
        System.out.println("\n--- Order Summary ---");
        System.out.println("Customer: " + customerName);
        System.out.println("Items:");
        for (MenuItem item : items) {
            System.out.println("  - " + item.getName() + ": $" + item.getPrice());
        }
        System.out.println("Total: $" + total);
        System.out.println("Address: " + address);
    }
}
