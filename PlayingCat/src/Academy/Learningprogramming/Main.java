package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(isCatPlaying(true,10));

        System.out.println(isCatPlaying(false,36));

        System.out.println(isCatPlaying(false,35));

        System.out.println(isCatPlaying(true,47));
    }

//    public static boolean isCatPlaying(boolean summer, int temperature){
//
//        if(temperature >= 25 && temperature <= 35){
//            return true;
//        } else {
//            return false;
//        }
//    }



    public static boolean isCatPlaying(boolean summer, int temperature){


        if (summer && temperature >= 25 && temperature <= 45){
            return true;
        }else if (!summer) {

            if ((temperature >= 25) && (temperature <= 35)) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }
}

