package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("It is not an Alien!");
            System.out.println("And I am scared of Aliens");
        }

        int topScore = 80;
        if(topScore < 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than Top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is true ");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar? true: false;
        if (wasCar){
            System.out.println("wasCar is true");
        }



    }
}
