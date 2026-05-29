import java.util.Scanner;

public class Main {

    static String[] driverNames = {"Ahmed", "Zainab", "Tariku", "Fatima", "Abebe"};
    static String[] driverPhones = {"+251-911-111-111", "+251-912-222-222", "+251-913-333-333",
            "+251-914-444-444", "+251-915-555-555"};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Coffee Shop");

        System.out.print("Enter your name: ");
        String customerName = scan.nextLine();

        String orderId = "ORD" + System.currentTimeMillis();
        Order order = new Order( customerName);

        showMenu();

        boolean ordering = true;
        while (ordering) {
            System.out.print("\nSelect item (1-6) or 0 to finish: ");
            int choice = scan.nextInt();

            MenuItem item = null;

            if (choice == 1) {
                item = new Drink("Espresso", 2.50, "Small");
            } else if (choice == 2) {
                item = new Drink("Latte", 4.50, "Large");
            } else if (choice == 3) {
                item = new Drink("Cappuccino", 3.75, "Medium");
            } else if (choice == 4) {
                item = new Pastry("Croissant", 3.50, true);
            } else if (choice == 5) {
                item = new Pastry("Donut", 2.00, false);
            } else if (choice == 6) {
                item = new Pastry("Bagel", 4.00, true);
            } else if (choice == 0) {
                ordering = false;
            } else {
                System.out.println("Invalid choice");
                continue;
            }

            if (item != null) {
                order.addItem(item);
                item.display();
                System.out.println("Added to order");
            }
        }

        scan.nextLine();

        System.out.print("\nEnter delivery address: ");
        String address = scan.nextLine();
        order.setAddress(address);

        order.showOrderSummary();

        int randomDriver = (int)(Math.random() * driverNames.length);
        Delivery delivery = new Delivery(

                driverNames[randomDriver],
                driverPhones[randomDriver],
                address
        );

        delivery.showDeliveryInfo();

        System.out.println("\nOrder confirmed!");

        scan.close();
    }

    static void showMenu() {
        System.out.println("\n--- Menu ---");
        System.out.println("1. Espresso - $2.50");
        System.out.println("2. Latte - $4.50");
        System.out.println("3. Cappuccino - $3.75");
        System.out.println("4. Croissant - $3.50");
        System.out.println("5. Donut - $2.00");
        System.out.println("6. Bagel - $4.00");
    }
}