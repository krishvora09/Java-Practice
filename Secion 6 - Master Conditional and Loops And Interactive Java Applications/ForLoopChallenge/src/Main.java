public class Main {

    public static void main(String[] args) {

        printPrimeOrNot(13);
        printPrimeOrNot(15);
        printPrimeOrNot(17);
        printPrimeOrNot(19);
        printPrimeOrNot(21);

        primeCounter(10);
    }

    public static boolean isPrime(int num) {

        if(num <= 2) {
            return (num ==2);
        }

        for (int i = 2; i <= num/2; i++) {
            if(num % i == 0)
                return false;
        }
        return true;
    }

    public static void printPrimeOrNot(int num) {
        if(isPrime(num)) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println((num + " is not a prime number"));
        }
    }

    public static void primeCounter(int num) {
        if(num > 1000) {
            System.out.println("Invalid Value");
            return;
        }

        int counter = 0;
        for(int i=1; i<=num; i++) {
            if(counter == 3)
                break;

            if(isPrime(i)) {
                System.out.println(i + " is a prime number");
                counter++;
            }
        }
    }
}
