public class Main {

    public static void main(String[] args) {
        char ch = 'A';

        displayNATO('A');
        displayNATO('B');
        displayNATO('C');
        displayNATO('D');
        displayNATO('E');
        displayNATO('Z');
    }

    public static void displayNATO(char ch) {
        switch(ch) {
            case 'A':
                System.out.println("A is Able");
                break;
            case 'B':
                System.out.println("B is Baker");
                break;
            case 'C':
                System.out.println("C is Charlie");
                break;
            case 'D':
                System.out.println("D is Dog");
                break;
            case 'E':
                System.out.println("E is Easy");
                break;

            default:
                System.out.println(ch + " not found");
                break;
        }
    }
}