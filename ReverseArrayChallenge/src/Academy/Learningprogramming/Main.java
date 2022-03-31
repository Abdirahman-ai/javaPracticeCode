package Academy.Learningprogramming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] testArray = {1,2,3,4,5};

        reverse(testArray);

        System.out.println("Reversed array is " + Arrays.toString(testArray));

    }

    public static void reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < reversedArray.length; i++) {
            reversedArray[i] = array[i];
        }
        System.out.println("Original array is " + Arrays.toString(reversedArray));
        int lastElement = array.length-1;
        int halfLength = array.length / 2;

        for(int i=0; i<halfLength; i++){
            int temp = array[i];
            array[i] = array[lastElement - i];
            array[lastElement - i] = temp;

        }
    }

}
