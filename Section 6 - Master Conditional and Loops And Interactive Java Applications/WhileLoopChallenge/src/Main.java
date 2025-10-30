public class Main {

    public static void main(String[] args) {

        int i = 5;
        int countOdd = 0;
        int countEven = 0;

        while(i <= 20) {
            if(countEven == 5) {
                break;
            }

            if(isEvenNumber(i)) {
                System.out.print(i + " ");
                countEven++;
            } else
                countOdd++;
            i++;
        }

        System.out.println();
        System.out.println("Total number of even no. found is: " + countEven);
        System.out.println("Total number of odd no. found is: " + countOdd);
    }

    public static boolean isEvenNumber(int num) {

        if(num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
