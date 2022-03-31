package Academy.Learningprogramming;

import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        //for singleNumberI method in main class
        int[] numbers = {2,2,5,2};
        System.out.println(singleNumberI(numbers));
        //end singleNumberI method

        // longestSubstring class
        String str = "abcabcbb";
        LongestSubstringWithoutRepeatingChars l = new LongestSubstringWithoutRepeatingChars();
        int val = l.longestSubstringWithoutRepeatingChars(str);
        System.out.println(val);

        String s = "     -42";
        StringToInteger atoi =  new StringToInteger();
        int result =  atoi.myAtoi(s);
        System.out.println(result);
        // end longestSubstring class

        // for binarySearch class
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int target = 5;
        BinarySearch bs = new BinarySearch();
        int res = bs.binarySearch(array, target);
        if(res == -1)
            System.out.println("target not found");
        else
            System.out.println("target found at index: " + res);
        // end binarySearch class

        // for RemoveDuplicates class
        int[] sortedArray = {1, 2, 3, 3, 3, 4, 5, 6, 6, 7, 8, 9, 9, 10};
       // RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int result1 = RemoveDuplicates.removeDuplicates(sortedArray);
        System.out.println("Length of the hashSet is: " + result1);
        // end RemoveDuplicates class


        //{5,4,10,1,6,2}
        // for insertionSort below
        int[] unsortedArray = {5,4,10,1,6,2};
        int[] sortedAr = insertionSort(unsortedArray);
        System.out.println(Arrays.toString(sortedAr));

    }

    public static int singleNumberI(int[] nums){

        HashSet<Integer> hashSet = new HashSet<>();
        for(int i: nums){
            if(hashSet.contains(i)){
                hashSet.remove(i);
            }
            else
                hashSet.add(i);
        }

        for(int i: hashSet){
            return i;
        }

        return 0;
    }


    String arr[] = {"Now", "is", "the", "time", "for", "all",  "the" ,
            "good",  "men",  "to" ,"come",  "aid" , " of", "the","country"};

    public static int[] insertionSort(int[] unsortedArray){

        // 0 1 2 3 4 5
        // 5,4,10,1,6,2
        for(int out=1; out<unsortedArray.length; out++){
            int temp = unsortedArray[out];
            int j = out;
            while(j > 0 && unsortedArray[j -1] >= temp){
                unsortedArray[j] = unsortedArray[j -1];
                j--;
            }
            unsortedArray[j] = temp;
        }

        return unsortedArray;

    }
}
