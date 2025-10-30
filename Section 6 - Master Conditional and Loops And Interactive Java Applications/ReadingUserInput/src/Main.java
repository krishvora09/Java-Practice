import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int currYear = 2025;
        try {
            System.out.println(getInputFromConsole(currYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currYear));
        }
    }

    public static String getInputFromConsole(int currYear) {

        String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hi " + name + " , It's nice to meet you");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currYear) {

        Scanner sc = new Scanner(System.in);

//        String name  = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hi, What's your Name? ");
        String name = sc.nextLine();
        System.out.println("Hi " + name + " , It's nice to meet you");

//        String dateOfBirth  = System.console().readLine("What year were you born? ");
        System.out.println("What year were you born?");

        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >= "
                    + (currYear - 125) + " <= " + currYear);
            try {
                String dateOfBirth = sc.nextLine();
                age = checkDateOfBirth(currYear, dateOfBirth);
                validDOB = (age != -1) ? true : false;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed!!! Try again.");
            }
        } while (!validDOB);

        return "So you are " + age + " years old";
    }

    public static int checkDateOfBirth(int currYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minYear = currYear - 125;

        if((dob < minYear) || (dob > currYear)) {
            return -1;
        }
        return (currYear - dob);
    }
}
