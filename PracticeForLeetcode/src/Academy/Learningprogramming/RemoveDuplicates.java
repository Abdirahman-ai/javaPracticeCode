package Academy.Learningprogramming;

import java.util.HashSet;

public class RemoveDuplicates {

    // Given a sorted array remove duplicate elements from the array
    public static int removeDuplicates(int[] sortedArray){

        HashSet<Integer> hashSet = new HashSet<>();
        if(sortedArray.length == 1){
            return 1;
        }
        else
        {
            for(int i=0; i<sortedArray.length; i++){
                if(!hashSet.contains(sortedArray[i])){
                    hashSet.add(sortedArray[i]);
                }
            }
        }
        System.out.println("After duplicates removed: ");
        for(int i: hashSet) System.out.print(i + " ");
        System.out.println(" ");

        int len = hashSet.size();
        return len;
    }
}
