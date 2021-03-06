package Academy.Learningprogramming;


public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
	// write your code here

        // calling the methods
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));
    }

    public static String getDurationString(long minutes, long seconds){

        if(minutes < 0 || seconds < 0 || seconds > 59){
            return INVALID_VALUE_MESSAGE;
        }

        long hours = (minutes / 60);
        long remainingMinutes = minutes % 60;


        String hoursString = hours + "h";
        if(hours < 10){
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingMinutes + "m";
        if(remainingMinutes < 10) {
            minutesString = "0" + minutesString;
        }


        String secondString = seconds + "s";
        if(seconds < 10) {
            secondString = "0" + secondString;
        }

        return hoursString + " " + minutesString + " " + secondString + "";

    }

    public static String getDurationString(long seconds){
        if(seconds < 0){
            return INVALID_VALUE_MESSAGE;

        }

        long Minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(Minutes, remainingSeconds);
    }

}
