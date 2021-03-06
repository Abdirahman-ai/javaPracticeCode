package Academy.Learningprogramming;

public class ContainerWithTheMostWater {


    public int maxArea(int[] height) {
        int max = Integer.MAX_VALUE;

        for(int i=0; i<height.length; i++){
            for(int j=i+1; j<height.length; j++){
                int min = Math.min(height[i], height[j]);
                max = Math.max(max, min * (j-i));
            }
        }

        return max;
    }
}
