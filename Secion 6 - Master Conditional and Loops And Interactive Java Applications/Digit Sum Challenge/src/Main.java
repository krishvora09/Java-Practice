public class Main {

    public static void main(String[] args) {

        int num = 189;

        System.out.println("The sum of digits of " + num + " is " + sumDigits(num));
    }

    public static int sumDigits(int num) {
        if(num < 0)
            return -1;

        int sumOfDigits = 0;
        while(num > 0) {
            sumOfDigits += num % 10;
            num /= 10;
        }

        return sumOfDigits;
    }
}
