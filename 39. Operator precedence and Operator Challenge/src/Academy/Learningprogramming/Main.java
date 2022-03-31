package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here


        double doubleValueOne = 20.00d;
        double doubleValueTwo = 80.00d;
        int addValues = 100 * (int)(doubleValueOne + doubleValueTwo);
        System.out.println("addValue = " + addValues);
        double remainder = addValues % 40.00d;
        System.out.println("Remainder = " + remainder);

        boolean isRemainder = (remainder == 0)? true: false;
        System.out.println("isRemainder = " + isRemainder);
        if(!isRemainder){
            System.out.println(" Got some remainder");
        }

        }
    }
