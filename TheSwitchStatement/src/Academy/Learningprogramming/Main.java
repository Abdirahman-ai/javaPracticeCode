package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
//
//        int value = 3;
//        if(value == 1){
//            System.out.println("Value was 1");
//        } else if(value == 2){
//            System.out.println("value was 2");
//        } else {
//            System.out.println("was not 1 or 2");
//        }


        int switchValue = 2;
        switch(switchValue){
            case 1:
                System.out.println("value was 1");
               break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3 or 4 or 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("was not 1 or 2");
                break;
        }

        //challenge time

        char letter = 'G';
        switch(letter){
            case 'D':
            System.out.println("letter was D");
                break;
            case 'C':
                System.out.println("letter was C");
                break;
            case 'B': case 'A': case 'E':
                System.out.println(letter + " was found");
                break;

            default:
                System.out.println("could not found A, B, C, D, E");
                break;
        }

        //Second Challenge

        String month = "janUary";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("It is january");
                break;
            case "february":
                System.out.println("it is february");
                break;
            case "march":
                System.out.println("it is march");
                break;
            default:
                System.out.println("it is neither");
                break;
        }

    }



}
