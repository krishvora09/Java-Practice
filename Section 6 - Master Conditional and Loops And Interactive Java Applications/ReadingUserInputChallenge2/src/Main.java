import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        boolean isChar = false;

        do {
            System.out.println("Enter a number if you want to continue or " +
                    "a character if you want to quit");
            String nextNumber = sc.nextLine();
            try {
                double number = Double.parseDouble(nextNumber);
                if (number > max)
                    max = number;
                if (number < min)
                    min = number;
            } catch (NumberFormatException e) {
                isChar = true;
            }
        } while (!isChar);

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }

}
