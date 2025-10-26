public class Challenge1 {
    public static void main(String[] args) {


        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Krish", position);

        position = calculateHighScorePosition(1000);
        displayHighScorePosition("Saurabh", position);

        position = calculateHighScorePosition(500);
        displayHighScorePosition("Shubham", position);

        position = calculateHighScorePosition(100);
        displayHighScorePosition("Shashank", position);

        position = calculateHighScorePosition(25);
        displayHighScorePosition("Nemish", position);
    }

    public static void displayHighScorePosition(String name, int highScorePosition) {
        System.out.println(name + " managed to get into position " + highScorePosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {

        int position = 0;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        } else {
            position = 4;
        }

        return position;
    }
}
