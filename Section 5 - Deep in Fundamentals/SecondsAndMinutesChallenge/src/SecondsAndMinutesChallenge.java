public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {

        int seconds = 43252;

        System.out.println(seconds + "s = " + getDurationString(seconds));
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "Invalid Value";
        }
        int minutes = seconds/60;
        seconds %= 60;

        return getDurationString(minutes, seconds);
    }

    public static String getDurationString(int minutes, int seconds) {

        if((minutes < 0) || (seconds < 0 || seconds > 59)) {
            return "Invalid value";
        }
        int hours = minutes/60;
        minutes %=60;

        return hours + "h " + minutes + "m " + seconds + "s";
    }
}
