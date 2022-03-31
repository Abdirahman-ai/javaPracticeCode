package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println(isTeen(9));
        System.out.println(isTeen(13));

    }

    public static boolean hasTeen(int p1, int p2, int p3) {

        if(p1 >= 13 && p1 <= 19){
            return true;

        } else if (p2 >= 13 && p2 <= 19) {
            return true;

        } else if(p3 >= 13 && p3 <= 19){
            return true;

        }

        return false;
    }


    public static boolean isTeen(int numberOne){

        if(numberOne >= 13 && numberOne <= 19){

            return true;
        }

        return false;
    }

}