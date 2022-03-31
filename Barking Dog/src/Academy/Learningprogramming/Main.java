package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        boolean wakeUp = shouldWakeUp(true, 1);
        System.out.println(wakeUp);
        wakeUp = shouldWakeUp(false, 2);
        System.out.println("dog is not parking ");
        wakeUp = shouldWakeUp(true, 8);
        System.out.println(wakeUp);
        wakeUp = shouldWakeUp(true, -1);
        System.out.println(wakeUp);

        wakeUp = shouldWakeUp(false, 6);
        System.out.println(wakeUp);

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfTheDay) {

        if (hourOfTheDay < 0 || hourOfTheDay > 23) {
            return false;

        } else if (hourOfTheDay < 8 || hourOfTheDay > 22) {
            return true;

        } else {

            return false;
        }
    }
}
