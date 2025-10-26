public class ChallengeClass {

    public static void main(String[] args) {

        double firstDouble = 20.00d;
        double secondDouble = 80.00d;

        double result = (firstDouble + secondDouble) * 100.00 % 40.00;

        boolean isRemainderZero = result == 0;

        System.out.println("This is a result: " + result);

        if(isRemainderZero)
            System.out.println("Remainder is zero");
        else
            System.out.println("Remainder is not zero");
    }
}
