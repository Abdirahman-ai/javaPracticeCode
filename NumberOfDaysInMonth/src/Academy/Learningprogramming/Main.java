package Academy.Learningprogramming;

public class Main {

    private static final boolean INVALID_VALUE = false;

    public static void main(String[] args) {
        // write your code here

        boolean leapYear = isLeapYear(-1600);
        System.out.println(leapYear + ": " + "-1600 is not a leap year");

        leapYear = isLeapYear(1600);
        System.out.println(leapYear + ": " + "1600 is a leap year");

        leapYear = isLeapYear(2017);
        System.out.println(leapYear + ": " + "2017 is not a leap year");

        leapYear = isLeapYear(2000);
        System.out.println(leapYear + ": " + "2000 is a leap year");

        System.out.println(getDaysInMonths(1,2020));
        System.out.println(getDaysInMonths(2,2020));
        System.out.println(getDaysInMonths(2,2018));
        System.out.println(getDaysInMonths(-1,2020));

    }

    public static boolean isLeapYear(int year) {

        if (year < 0 || year > 9999) {
            return INVALID_VALUE;

        } else if (year % 4 == 0 || year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return INVALID_VALUE;
        } else {
            return INVALID_VALUE;
        }
    }

    public static int getDaysInMonths(int month, int year) {

        if (month < 1 || month > 12 && year < 1 || year > 9999) {
            return -1;

        } switch(month){
            case 4: case 6: case 9: case 11:
                return 30;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
        }
        boolean leapYear = isLeapYear(year);
        if(leapYear){
            return 29;
        } else {
            return 28;
        }
    }
}


//public class NumberOfDaysInMonth {
//    public static boolean isLeapYear(int year){
//        if(year < 1 || year > 9999){
//            return false;
//        }else if(year % 4 == 0 && year % 100 != 0) {
//            return true;
//        }else return year % 400 == 0;
//    }
//
//    public static int getDaysInMonth(int month, int year){
//        if(month < 1 || month > 12 || year < 1 || year > 9999) {
//            return -1;
//        }
//        switch (month) {
//            case 4: case 6: case 9: case 11:
//                return 30;
//            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//                return 31;
//        }
//        boolean limpYear = isLeapYear(year);
//        if (limpYear) {
//            return 29;
//        } else {
//            return 28;
//        }
//    }
//}