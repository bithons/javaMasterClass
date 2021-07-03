package academy.learnprogramming.methods;

public class Main {

    // This is the main method
    public static void main(String[] args) {
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);
        highScore = calculateScore(true, 10000,8,200);
        System.out.println("Your final score was " + highScore);

        int scoreOne = calculateHighScorePosition(1500);
        int scoreTwo = calculateHighScorePosition(900);
        int scoreThree = calculateHighScorePosition(400);
        int scoreFour = calculateHighScorePosition(50);

        displayHighScorePosition("Mert",scoreOne);
        displayHighScorePosition("Meric", scoreTwo);
        displayHighScorePosition("Merhan", scoreThree);
        displayHighScorePosition("Somun",scoreFour);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " Managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
//        if(score >= 1000) {
//            return 1;
//        } else if(score >= 500) {
//            return 2;
//        } else if(score >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }

        int position = 4; // Assuming position 4 will be returned

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }
}
