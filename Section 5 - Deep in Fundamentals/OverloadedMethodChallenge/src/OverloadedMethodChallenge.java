public class OverloadedMethodChallenge {

    public static void main(String[] args) {

        int inches = 37;
        double centimeters = convertToCentimeters(inches);

        System.out.println(inches + " inches = " + centimeters + " cm");

        int feets = 5;
        inches = 8;
        centimeters = convertToCentimeters(feets, inches);
        System.out.println(feets + " ft and " + inches + " inches = " + centimeters + " cm");
    }

    public static double convertToCentimeters(int inches) {

        return (inches * 2.54);
    }

    public static double convertToCentimeters(int feets, int inches) {

        inches += feets*12;
       return convertToCentimeters(inches);
    }
}
