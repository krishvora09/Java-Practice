public class Main {

    public static void main(String[] args) {

        BankAccount firstAccount = new BankAccount();
        BankAccount bobsAccount = new BankAccount("12345", 9000.00,
                "Bob Brown","myemail@bob.com", "+91-9876987600");

        bobsAccount.displayAccountDetails();
        firstAccount.displayAccountDetails();
        firstAccount.deposit(3000);
        firstAccount.withdraw(10000);
        firstAccount.withdraw(7000);
    }
}
