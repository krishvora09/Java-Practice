public class LeapYear {

    public static void main(String[] args) {

        printToCheckLeap(-1600);
        printToCheckLeap(1600);
        printToCheckLeap(2017);
        printToCheckLeap(1900);
        printToCheckLeap(2004);

    }

    public static boolean isLeapYear(int year) {

        if(year < 1 || year > 9999) {
            return false;
        } else if(year % 4 == 0) {
            if(year % 100 != 0) {
                return true;
            } else {
                if(year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
    }

    public static void printToCheckLeap(int year) {
        if(isLeapYear(year)) {
            System.out.println(year + " is a leap year");
        } else{
            System.out.println(year + " is not a leap year");
        }
    }
}
