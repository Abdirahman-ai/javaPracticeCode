package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        printSquareStar(5);
//
//        printSquareStar(8);
//
//        printSquareStar(6);
//
        printSquareStar(5);
        printSquareStar(8);
        printSquareStar(10);
        printSquareStar(15);

        trianglePattern(8);

    }

    //
    public static void printSquareStar(int number) {

//        for(int i=1; i<=number; i++){
//            for(int j=1; j<=number; j++){
//                if(j == 1 || i == number || j <= i){
//                    System.out.print("*");
//                }
//
//            }
//            System.out.println();
//        }

        if (number < 5) {
            System.out.println("Invalid Value");

        } else {

            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if (i == 1 || i == number || j == 1 || j == number
                            || i == j || j == (number - i + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }
    }

    public static void trianglePattern(int number) {

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (j == 1 || i == number || j <= i) {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }


    // come back for below code

}