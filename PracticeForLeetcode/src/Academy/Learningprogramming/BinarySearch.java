package Academy.Learningprogramming;

import java.sql.SQLOutput;

public class BinarySearch {

    // {1,2,3,4,5,6,7,8,9,10}
    public int binarySearch(int[] array, int target){

        int lowerBound = 0;
        int upperBound = array.length-1;

        while(lowerBound < upperBound){

            int mid = lowerBound + ( (upperBound - lowerBound) / 2 ) ;

            if(array[mid] == target){
                return mid;

            } else if(array[mid] > target){
                 upperBound = mid - 1;

            } else if(array[mid] < target){
                lowerBound = mid + 1;
            }
        }

        return -1;
    }
}
