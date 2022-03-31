package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);
        printEqual(2,1,1);

    }

    public static void printEqual(int p1, int p2, int p3) {

        if ((p1 < 0) || (p2 < 0) || (p3 < 0)) {
            System.out.println("Invalid Value");

        } else if (p1 == p2 && p2 == p3) {
            System.out.println("All numbers are equal");

        } else if (((p1 != p2) && (p1 != p3)) && (p2 != p3)) {

            System.out.println("all numbers are different");

        } else {

            System.out.println("Neither all are equal or different ");
        }
    }

}
