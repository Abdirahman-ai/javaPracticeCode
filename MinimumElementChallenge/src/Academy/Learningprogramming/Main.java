package Academy.Learningprogramming;

import java.util.Scanner;

public class Main {

   private static Scanner  scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here

       int[] count =  readIntegers(5);
        int min = findMin(count);
        System.out.println("Minimum element in the array is " + min);
    }

    public static int[] readIntegers(int count){
        int[] array = new int[count];
        System.out.println("Enter " + count + " integers: ");
        for(int i=0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array){
        int minValue = array[0];
        for(int i=1; i<array.length-1; i++){
            if(array[i] < minValue){
                minValue= array[i];
            }
        }
        return minValue;
    }
}
