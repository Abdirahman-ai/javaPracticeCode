package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));

        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }

    public static boolean hasSameLastDigit(int valueOne, int valueTwo, int valueThree){

        if(valueOne < 10 || valueOne > 1000 || valueTwo < 10 || valueTwo > 1000 || valueThree < 10 || valueThree > 1000){

            return false;

        } else {

            int var1 = valueOne % 10;
            int var2 = valueTwo % 10;
            int var3 = valueThree % 10;

            return(var1 == var2 || var1 == var3 || var2 == var3);
        }
    }

    public static boolean isValid(int number){

        if((number >= 10) && (number <= 1000)){
            return true;

        } else {

            return false;
        }
    }
}
