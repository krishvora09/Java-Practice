public class MegaBytesConverter {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(5000);
        printMegaBytesAndKiloBytes(-5);
        printMegaBytesAndKiloBytes(98328);
        printMegaBytesAndKiloBytes(23729842);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int mb = kiloBytes/1024;
            int remainingKB = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + mb + " MB and " + remainingKB + " KB");
        }
    }
}
