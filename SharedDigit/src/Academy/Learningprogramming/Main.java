package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
        System.out.println(hasSharedDigit(12,43));
        System.out.println(hasSharedDigit(234,946));

        System.out.println(hasSharedDigit(12,42));

    }

    public static boolean hasSharedDigit(int firstValue, int secondValue) {

        if (firstValue < 10 || firstValue > 99 || secondValue < 10 || secondValue > 99) {

            return false;

        }

            int variableOne = firstValue % 10;
            firstValue /= 10;
            int variableTwo = secondValue % 10;
            secondValue /= 10;

            if(firstValue == secondValue || firstValue == variableTwo || variableOne == secondValue || variableOne == variableTwo){
                return true;

            }

            return false;
    }
}
