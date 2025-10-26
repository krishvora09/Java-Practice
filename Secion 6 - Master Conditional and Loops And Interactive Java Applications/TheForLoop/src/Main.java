public class Main {

    public static void main(String[] args) {

        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }

        for (double rate = 7.50; rate <= 10; rate += 0.25) {
            System.out.println("$100.00 at " + rate + " interest = $" + calculateInterest(100.00, rate));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate/100));
    }
}
