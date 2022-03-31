package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        printDayOfTheWeek(-1);
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);
        printDayOfTheWeek(12);

    }

    public static void printDayOfTheWeek(int day){


        switch(day){
            case 1:
                System.out.println("it is Sunday");
                break;
            case 2:
                System.out.println("it is Monday");
                break;
            case 3:
                System.out.println("It is a tuesday");
                break;
            case 4:
                System.out.println("it is wednesday");
                break;
            case 5:
                System.out.println("it is thursday");
                break;
            case 6:
                System.out.println("it is friday");
                break;
            case 7:
                System.out.println("it is saturday");
                break;

            default:
                System.out.println("Invalid Day");
        }
    }

//
//    public static void printDayOfTheWeek(int day){
//
//        if(day == 0){
//            System.out.println("it is Sunday");
//        } else if(day == 1){
//            System.out.println("It is monday");
//        } else if(day == 2){
//            System.out.println("it is tuesday");
//        } else if(day == 3){
//            System.out.println("it is wednesday");
//        } else if(day == 4){
//            System.out.println("it is thursday");
//        } else if(day == 5){
//            System.out.println("it is friday");
//        } else if(day == 6){
//            System.out.println("it is saturday");
//    } else {
//            System.out.println("Invalid day");
//        }
//    }
}
