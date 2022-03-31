package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        boolean leapYear = isLeapYear(-1600);
        System.out.println(leapYear + "," + " is not a leap year");

        leapYear = isLeapYear(1600);
        System.out.println(leapYear + "," + " is a leap year");

        leapYear = isLeapYear(2017);
        System.out.println(leapYear + "," + " is not a leap year");

        leapYear = isLeapYear(2000);
        System.out.println(leapYear + "," + " is a leap year");

        System.out.println(isLeapYear(2018) + "," + " is not a leap year");

    }

    public static boolean isLeapYear(int year) {

        if (!(year >= 1 && year <= 9999)) {
            return false;
        } else {
            if ((year % 4) == 0) {

                if ((year % 100) == 0) {

                    if ((year % 400) == 0) {
                        return true;
                    }
                } else{
                    return true;}
            } else{
                return false;
            }
        }

        return false;
    }
}
