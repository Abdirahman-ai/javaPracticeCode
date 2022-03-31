package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(30003));

        System.out.println(isPalindrome(-300893));

    }

    public static boolean isPalindrome(int number){

        int initialNumber = number;
        int reverse = 0;

        while(number > 0)
        {
            int lastDigit = number % 10;
            number = number / 10;
            reverse = reverse * 10 + lastDigit;

        }
        if(initialNumber != reverse){

            System.out.println(number + " is not a palindrome number");
        }

        return (reverse == initialNumber);

    }
}


//public class NumberPalindrome {
//    public static boolean isPalindrome(int number) {
//        int reverse = 0;
//        int initialNumber = number;
//        while(number != 0){
//            int lastDigit = number % 10;
//            reverse *= 10;
//            reverse += lastDigit;
//            number /= 10;
//        }
//        return (reverse == initialNumber);
//    }
//
//}