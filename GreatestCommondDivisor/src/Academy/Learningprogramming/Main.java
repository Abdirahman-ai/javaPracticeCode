package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Greatest common divisor of 25 and 15 = " + getGreatestCommonDivisor(25,15));
        System.out.println("Greatest common divisor of 12 and 30 = " + getGreatestCommonDivisor(12,30));
        System.out.println("Greatest common divisor of 9 and 18 = " + getGreatestCommonDivisor(9,18));
        System.out.println("Greatest common divisor of 81 and 153 = " + getGreatestCommonDivisor(81,153));
    }

    public static int getGreatestCommonDivisor(int first, int second){

        if(first < 10 || second < 10){
            return -1;

        }

        int gcd = 1;

        for(int i=1; i<=first && i<=second; i++){

            if(first % i == 0 && second % i == 0){
                gcd = i;
            }
        }

        return gcd;
    }

}
