package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int count = 0;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }

//        for(int count = 0; count <=7; count++){
//            System.out.println("count value is " + count);
//        }


         count = 1;
        do {
            System.out.println("count value was " + count);
            count++;
        } while(count != 6);


        System.out.println("************************");

//        count = 1;
//        while(true) {
//            if(count == 6){
//                break;
//            }
//            System.out.println("count value is " + count);
//            count++;
//        }

        int number = 4;
        int finishNumber = 20;
        int evenNumberFound = 0;


        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even Number = " + number);


            evenNumberFound++;
            if(evenNumberFound >= 5){
                break;
            }

        }
        System.out.println("Total Even Numbers found = " + evenNumberFound);

    }

    public static boolean isEvenNumber(int number){

        if(number % 2 == 0){
            return true;

        } else {
            return false;
        }

    }
}
