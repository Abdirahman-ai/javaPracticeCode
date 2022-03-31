package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        boolean byThreeDecimalPlaces = areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println(byThreeDecimalPlaces + " The two double numbers are the same up to three decimal places");

        byThreeDecimalPlaces = areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println( byThreeDecimalPlaces + " The two double numbers are not the same up to three decimal places");

        byThreeDecimalPlaces = areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println(byThreeDecimalPlaces + " The two double numbers are the same up to three decimal places");


        byThreeDecimalPlaces = areEqualByThreeDecimalPlaces(-3.123, 3.123);
        System.out.println(byThreeDecimalPlaces +  " The two double numbers are not the same up to three decimal places");

    }

    public static boolean areEqualByThreeDecimalPlaces(double parameterOne, double parameterTwo){

        if( (int) (parameterOne * 1000) == (int) (parameterTwo * 1000)){
            return true;

        } else {
            return false;
        }
    }
}
