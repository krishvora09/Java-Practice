public class BankAccount {

    private String accountNumber = "111222333444";

    private double accountBalance = 5000.00;

    private String customerName = "John Doe";

    private String email = "john.doe@example.com";

    private String phoneNumber = "+91-9998887766";

    public BankAccount() {
        this("56789", 0.00, "Default Name",
                "Default Address", "Default Phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double accountBalance,
                       String customerName, String email, String phoneNumber) {

        System.out.println("BankAccount Constructor with parameters called.");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(int depositAmount) {
        accountBalance += depositAmount;
        System.out.println("Deposited Rs. " + depositAmount + " successfully. " + "Your new balance is Rs. " + accountBalance);
    }

    public void withdraw(int withdrawAmount) {

        if (withdrawAmount > accountBalance) {
            System.out.println("Insufficient Balance! Your balance is Rs. " + accountBalance);
            return;
        }

        accountBalance -= withdrawAmount;
        System.out.println("Withdrawal of Rs. " + withdrawAmount + " successfully. " + "Your new balance is Rs. " + accountBalance);
    }

    public void displayAccountDetails() {
        System.out.println("Account Number = " + accountNumber);
        System.out.println("Account Balance = " + accountBalance);
        System.out.println("Customer Name = " + customerName);
        System.out.println("Email = " + email);
        System.out.println("Phone Number = " + phoneNumber);
    }
}
