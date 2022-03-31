package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println(getLargestPrime(21)); // 7
        System.out.println(getLargestPrime(217)); // 31
        System.out.println(getLargestPrime(0)); // -1
        System.out.println(getLargestPrime(45)); // 5
        System.out.println(getLargestPrime(-1)); // -1
        System.out.println(getLargestPrime(16)); // 2


    }

    public static int getLargestPrime(int number) {

        if (number <= 0 || number == 1) {
            return -1;
        }
        int largestPrime = 0;
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                for (int y = 1; y <= i; y++) {
                    if (i % y == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    largestPrime = i;
                }
                count = 0;
            }
        }
        return largestPrime;
    }
}
