public class Main {

    public static void main(String[] args) {

        Customer first = new Customer("Krish Vora", 50000.00,
                "krish@email.com");
        Customer second = new Customer("Jenil Savani", "jenil@email.com");
        Customer third = new Customer();

        first.displayDetails();
        second.displayDetails();
        third.displayDetails();
    }
}
