package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("The sum of the digits in 125 is " + sumDigits(125));
        System.out.println("The sum of the digits in -125 is " + sumDigits(-125));
        System.out.println("The sum of the digits in 4 is " + sumDigits(4));
        System.out.println("The sum of the digits in 32123 is " + sumDigits(32123));
    }

    public static int sumDigits(int number){

        int sum = 0;

        if(number < 10){

            return -1;
        }

        //125 -> 125 /10 = 12 -> 12 * 10 = 120 -> 125 -120 = 5
        while (number > 0){

            // Extract the least significant digit
            int digit = number % 10;
            sum += digit;


           //drop the least-significant digit
            number /= 10;    // same as number = number / 10;

        }

        return sum;
    }

}
