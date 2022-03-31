package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if(score < 5000 && score > 1000){
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        } else if (score < 1000){
//            System.out.println("your score is less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score is " + finalScore);
        }

        // challenge time

        boolean newGameOver = true;
        int newSore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        if(newGameOver) {
            int FinalScore = newSore + (newLevelCompleted * newBonus);
            System.out.println("Your FinalScore is " + FinalScore);
        }

    }
}
