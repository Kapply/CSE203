public class CustomerInfor {
    public static void main(String[] args) {
        Customer customer = new Customer("Austin ", "7086 settle.CA", "90-394849284", "Cus027", false);
        System.out.println(customer);

        PreferredCustomer preferredCustomer = new PreferredCustomer("Austin ", "7086 settle.CA", "90-394849284",
                "Cus027", false, 1000);
        System.out.println(preferredCustomer + ", Price: " + preferredCustomer.buyProduct(500));

    }
}
