public class Delivery {
    private String driverName;
    private String driverPhone;
    private String address;


    public Delivery( String driverName, String driverPhone, String address) {

        this.driverName = driverName;
        this.driverPhone = driverPhone;
        this.address = address;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public String getAddress() {
        return address;
    }



    public void showDeliveryInfo() {
        System.out.println("\n--- Delivery Information ---");

        System.out.println("Driver: " + driverName);
        System.out.println("Phone: " + driverPhone);
        System.out.println("Delivery Address: " + address);
    }
}
