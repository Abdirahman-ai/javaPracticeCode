package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Player player = new Player();
//        player.name = "Abdirahman";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Abdirahman", 50, "sword");
        System.out.println("Initial health is " + player.getHealth());




        Printer printer = new Printer(50,true);
        System.out.println("Initial pages count = " + printer.getNumberOfPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + ", new total print count print for printer = " + printer.getNumberOfPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + ", new total print count print for printer = " + printer.getNumberOfPagesPrinted());



    }
}
