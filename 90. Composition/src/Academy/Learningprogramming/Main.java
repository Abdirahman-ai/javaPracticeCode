package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Dimensions dimensions = new Dimensions(20,20,5);
        Case theNewCase = new Case("2208", "Dell", "240", dimensions);

        Monitor TheMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540,1440) );

        Motherboard TheMotherboard = new Motherboard("83-200", "Asus",4,6, "v2.44");

        PC thePC = new PC(theNewCase, TheMonitor, TheMotherboard);
        thePC.powerUp();





        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12,55);

        Bed bed = new Bed("modern ", 4,3,2,1 );

        Lamp lamp = new Lamp("classic", false, 75);

        Bedroom bedRoom = new Bedroom("Abdirahman's", wall1, wall2, wall3, wall4, ceiling, bed,lamp);
        bedRoom.makeBed();

        //getter
        bedRoom.getLamp().turnOn();


    }
}
