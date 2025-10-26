public class DecimalComparator {

    public static void main(String[] args) {

        printAreEqualByThreeDecimalPlaces(-3.1756, -3.175);
        printAreEqualByThreeDecimalPlaces(3.175, 3.1756);
        printAreEqualByThreeDecimalPlaces(3.00, 3.01);
        printAreEqualByThreeDecimalPlaces(-3.1756, 3.175);
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        long numOne = (long)(num1*1000);
        long numTwo = (long)(num2*1000);

        if(numOne == numTwo) {
            return true;
        } else
            return false;

    }

    public static void printAreEqualByThreeDecimalPlaces(double num1, double num2) {

        if(areEqualByThreeDecimalPlaces(num1, num2)) {
            System.out.println(num1 + " and " + num2 + " are equal by three decimal places.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not equal by three decimal places.");
        }
    }
}
