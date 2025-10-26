public class Main {

    public static void main(String[] args) {

        int sum = 0;
        int counter = 0;

        for (int num = 1; num <= 1000 ; num++) {
            if(counter == 5) {
                break;
            }

            if(num % 3 == 0 && num % 5 == 0) {
                sum += num;
                System.out.println(num + " is divisble by both 3 and 5");
                counter++;
            }
        }

        System.out.println("The sum of the numbers between 1 to 1000 " +
                "which are divisible by both 3 and 5 is " + sum);
    }

}
