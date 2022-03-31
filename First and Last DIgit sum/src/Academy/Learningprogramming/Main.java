package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }


    public static int sumFirstAndLastDigit(int number){


        if(number < 0){
            return -1;
        }

            int fistNumber = 0;
            int lastNumber = number % 10;
            int sum = 0;

            while(number > 0){
                fistNumber = number % 10;
                number /= 10;
                sum = fistNumber + lastNumber;
            }

            return sum;
    }
}


//
//public class FirstLastDigitSum {
//    public static int sumFirstAndLastDigit(int number) {
//        if(number < 0 ) {
//            return -1;
//        } else {
//            int firstDigit = 0;
//            int lastDigit = number%10;
//            while (number>0) {
//                firstDigit = number%10;
//                number /= 10;
//            } return lastDigit+firstDigit;
//        }
//    }
//}