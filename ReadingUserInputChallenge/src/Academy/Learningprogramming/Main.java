package Academy.Learningprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 1;
        while (counter <= 10) {
            System.out.println("Enter number #" + counter + ":");

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){

                int number = scanner.nextInt();
                counter++;
                sum += number;

            } else {

                System.out.println("Invalid value");
            }

            scanner.nextLine();
        }

        System.out.println("Your total is " + sum);
        scanner.close();
    }
}

