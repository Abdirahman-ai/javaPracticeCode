package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                count++;
                System.out.println("Found number = " + i);
            }

            if (count == 5) {
                System.out.println("Exiting the for loop");
                break;
            }
        }

        System.out.println("sum = " + sum);
    }
}

