package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {

        int sum = 0;

        if (number < 0) {
            return -1;

        }
            while (number != 0) {

                int evenDigit = 0;
                evenDigit = number % 10;

                if (evenDigit % 2 == 0) {
                    sum += evenDigit;
                }

                number /= 10;
            }

            return sum;
    }
}