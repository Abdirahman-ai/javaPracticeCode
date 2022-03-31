package Academy.Learningprogramming;

import java.beans.IntrospectionException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

//       int counter = 1; // you don't need this variable since you have and endless loop
        while(true){
            System.out.println("Enter Number: ");

            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int number = scanner.nextInt();
                if(number > max){
                    max = number;
                }

                if(number < min){
                    min = number;
                }

            } else{
                break;
            }

            scanner.nextLine(); // handle
        }
        System.out.println("min = " + min + ", max = " + max);
        scanner.close();
    }
}
