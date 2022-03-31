package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        byte byteValue = 30;
        short shortValue = 1000;
        int intValue = 300;
        long longTotal = (50000L) + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);

        short shortTotal = (short) (1000 + 10 *
                (byteValue + shortValue + intValue));
     }
}
