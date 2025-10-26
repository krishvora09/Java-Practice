public class BarkingDog {

    public static void main(String[] args) {

        printShouldWakeUp(true, 1);
        printShouldWakeUp(false, 2);
        printShouldWakeUp(true, 8);
        printShouldWakeUp(true, 21);
        printShouldWakeUp(true, 23);
        printShouldWakeUp(true, -1);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if(hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        } else {
            return false;
        }
    }

    public static void printShouldWakeUp(boolean barking, int hourOfDay) {

        if(shouldWakeUp(barking,hourOfDay)) {
            System.out.println("You need to wake up");
        } else {
            System.out.println("No need to wake up");
        }
    }
}
