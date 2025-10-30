import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int countValid = 1;

        while (countValid <= 5) {
            System.out.println("Enter number #" + countValid + ":");
            String nextNumber = sc.nextLine();
            try{
                int number = Integer.parseInt(nextNumber);
                countValid++;
                sum += number;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            }
        }

        System.out.println("The sum of the 5 numbers = " + sum);
    }

}
