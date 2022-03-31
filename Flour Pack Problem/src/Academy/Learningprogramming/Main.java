package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(canPack(1,0,4)); //false
        System.out.println(canPack(1,0,5)); //true
        System.out.println(canPack(0,5,4)); //true
        System.out.println(canPack(2,2,11)); //true
        System.out.println(canPack(-3,2,12)); //false
        System.out.println(canPack(1,0,6));  //false
        System.out.println(canPack(2,1,5));  //true

    }

    public static boolean canPack(int bigCount, int smallCount, int goal){

        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        int sum = ((bigCount * 5) + (smallCount));

        if(sum >= goal && bigCount == 0){
            return true;
        } else if(sum >= goal && smallCount == 0){
            if(goal % 5 == 0){
                return true;
            }

        } else if(sum >= goal && goal % 5<= smallCount){
            return true;
        }
        return false;
    }
}

