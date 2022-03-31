package Academy.Learningprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
	// write your code here

//        class clickListner implements Button.onClickListner {
//            public clickListner() {
//                System.out.println("I've been attacked");
//            }
//            @Override
//            public void onClick(String title){
//                System.out.println(title + " was clicked");
//            }
//
//            @Override
//            public void onClickListner(String title) {
//            }
//        }

//        btnPrint.setOnClickListner(new clickListner());
        btnPrint.setOnClickListner(new Button.onClickListner() {
            @Override
            public void onClick(String title) {
                System.out.println("I've been attacked");
            }

            @Override
            public void onClickListner(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();
//        GearBox mcLaren = new GearBox(6);
////        GearBox.Gear first = mcLaren.new Gear(1,12.3);
////        System.out.println(first.driveSpeed(1000));
////
////        mcLaren.addGear(1,5.3);
////        mcLaren.addGear(2,10.6);
//        mcLaren.addGear(3,15.9);
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));
    }

    private static void listen(){
        boolean quit = false;
        while(!quit){
            int choice = scanner.nextInt();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
                    break;
            }
        }
    }
}
