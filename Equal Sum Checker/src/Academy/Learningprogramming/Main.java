package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(1,-1,0));


    }

    public static boolean hasEqualSum(int valueOne, int valueTwo, int valueThee){

        if(valueOne + valueTwo == valueThee){
            return true;

        } else {
            return  false;
        }
    }

}
