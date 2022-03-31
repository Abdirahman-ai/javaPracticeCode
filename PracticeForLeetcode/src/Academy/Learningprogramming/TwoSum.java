package Academy.Learningprogramming;

import java.util.HashMap;


public class TwoSum {

    //{3, 4, 6, 5, 10, 11, 15} target = 11

    public static int[] twoSum(int[] nums, int target){

        if(nums == null || nums.length<2){
            throw new IllegalArgumentException("Invalid nums array");
        }


        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int result = target - nums[i];
            if(hashmap.containsKey(result)){
                return new int[]{hashmap.get(result),i};
            }
            hashmap.put(nums[i], i);
        }

        throw new IllegalArgumentException("Invalid array, No two sum is found. . ");
    }





}
