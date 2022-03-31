package Academy.Learningprogramming;

import java.util.Scanner;

public class Main {

//    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        int[] sorted = sorIntegers(myIntegers);
        printArray(sorted);

        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted)



        System.out.println("The average is " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " Integers");
        int[] values = new int[number];
        for(int i=0; i<values.length; i++){

            values[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i=0; i<array.length-1; i++){
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println("index " + i + " value was " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {

        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }





    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " Integers: ");
        int[] arrays = new int[number];

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = scanner.nextInt();
        }
        return arrays;
    }

    public static void printArray(int[] arrayContent) {
        for (int i = 0; i < arrayContent.length; i++) {
            System.out.println("Element " + i + ", sorted number is  " + arrayContent[i]);
        }
    }

    public static int[] sorIntegers(int[] array) {

        for (int i = 0; i < array.length-1; i++){
            for (int j=0; j < array.length-1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}

