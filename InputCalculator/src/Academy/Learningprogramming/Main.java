package Academy.Learningprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);

        long sum = 0;
        long avg = 0;

        int count = 0;
        while(true){
           System.out.println("Enter A value: ");

            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                int number = scanner.nextInt();
//                count++;
                sum += number;
                avg = (int) Math.round((double)sum/count);

            }else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM =" + sum + " AVG=" + avg);
        scanner.close();
    }
}

//    public static void inputThenPrintSumAndAverage(){
//
//        Scanner scanner = new Scanner(System.in);
//
//        int count = 0;
//        int sum = 0;
//        long avg = 0;
//
//        while(true){
//
//            boolean isAnInt = scanner.hasNextInt();
//
//            if(isAnInt){
//                int number = scanner.nextInt();
//                sum += number;
//                count++;
//            } else {
//
//                long average = Math.round(((double)sum/(double)count));
//
//                System.out.println("SUM = " + sum + "AVG = " + average);
//
//                break;
//
//            }
//
//        }
//
//        scanner.close();
//    }