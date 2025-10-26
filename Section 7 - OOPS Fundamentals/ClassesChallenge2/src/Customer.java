public class Customer {

    private String customerName;

    private double creditLimit;

    private String customerEmail;

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public Customer(String customerName, double creditLimit, String customerEmail) {

        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.customerEmail = customerEmail;
    }

    public Customer() {

        this("Default Name", 10000.00, "Default Address");
    }

    public Customer(String customerName, String customerEmail) {
        this(customerName, 9999.00, customerEmail);
    }

    public void displayDetails() {
        System.out.println("Customer Name = " + customerName);
        System.out.println("Credit Limit = Rs." + creditLimit);
        System.out.println("Customer Email = " + customerEmail);

        System.out.println();
    }
}
