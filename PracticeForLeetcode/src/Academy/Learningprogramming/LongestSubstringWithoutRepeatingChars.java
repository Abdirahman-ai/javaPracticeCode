package Academy.Learningprogramming;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingChars {


    //abcabcbb


    public int longestSubstringWithoutRepeatingChars(String str) {


        int pointer1 = 0;
        int pointer2 = 0;
        int max = 0;

        HashSet<Character> hashset = new HashSet<>();

        while(pointer2 < str.length()){
            if(!hashset.contains(str.charAt(pointer2))){
                hashset.add(str.charAt(pointer2));
                pointer2++;

                max = Math.max(hashset.size(), max);

            }
            else{
                hashset.remove(str.charAt(pointer1));
                pointer1++;
            }
        }
        return max;
    }
}