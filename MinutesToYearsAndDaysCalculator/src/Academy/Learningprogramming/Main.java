package Academy.Learningprogramming;

public class Main {

    private static final String INVALID_VALUE = "INVALID VALUE ENTERED!";

    public static void main(String[] args) {
	// write your code here

        printYearsAndDays(2347879);
        printYearsAndDays(-24245);
    }


    public static void printYearsAndDays(long minutes){

        if(minutes < 0){
            System.out.println(INVALID_VALUE);

        } else {

            long hours = minutes/60;
            long days = (hours/24);
            long years = days/365;
            long daysRemaining = days%365;
            System.out.println(minutes + " minutes = " + years + " years and " + daysRemaining + " days");



        }

    }

}
