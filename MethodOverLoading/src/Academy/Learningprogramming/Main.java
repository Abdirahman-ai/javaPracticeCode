package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here

        calculateScore(75);
        calculateScore();
        double centimeters = calcFeetAndInchesToCentimeters(6,0);
        if(centimeters < 0){
            System.out.println("Invalid parameters! ");
        }

        calcFeetAndInchesToCentimeters(32,13);
        calcFeetAndInchesToCentimeters(7,5);
        calcFeetAndInchesToCentimeters(0,1);

        calcFeetAndInchesToCentimeters(-10,-5);

        calcFeetAndInchesToCentimeters(157);
        calcFeetAndInchesToCentimeters(-10);


    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {

        System.out.println("unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    public static String calculateScore(String personal) {
        System.out.println("My personal name is " + personal);
        return personal;


    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if ((feet < 0) && (inches < 0) || (inches > 12)) {
            System.out.println("Invalid Inches and feet parameters entered! ");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " + centimeters + " centimeters");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {


        if (inches < 0) {
            System.out.println("A negative number was entered! ");
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet " + "and remainingInches " + remainingInches);
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

}

