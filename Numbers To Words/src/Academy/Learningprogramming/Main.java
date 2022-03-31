package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

        System.out.println("**************************");

        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));

        System.out.println("**************************");

        numberToWords(123);
        System.out.println("**************************");
        numberToWords(1010);
        System.out.println("**************************");
        numberToWords(1000);
        System.out.println("**************************");
        numberToWords(-12);

    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int num = reverse(number);

        int count = 0;
        while (count < getDigitCount(number)) {
            int lastDigit = num % 10;
            count++;

            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }

            num /= 10;

        }

    }

    public static int reverse(int number) {

        int reserved = 0;
        int num = 0;

        if (number == 0) {
            return 0;

        } else {
            int count = 0;
            while (number != 0) {
                num = number % 10;  //Extract the last digit
                reserved *= 10;  //multiply the reserved by 10 to get next place value.
                reserved += num;  // add the last digit to num
                number /= 10; // cut off all the digits
            }
        }

        return reserved;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;

        } else if (number == 0) {
            return 1;
        } else {
            int count = 0;
            while (number > 0) {
                int digit = number%10;
                count++;
                number /= 10; // keep cutting off digit to get the digit count. keep doing this until num/10 = 0

            }

            return count;
        }
    }
}