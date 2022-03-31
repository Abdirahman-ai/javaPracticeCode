package Academy.Learningprogramming;

public class DeluxeHamburger extends Burger{

    public DeluxeHamburger() {
        super("Deluxe", "sausage & bacon", "white", 14.56);
        super.addBurgerAddition1("Chips", 2.87);
        super.addBurgerAddition2("drink", 1.84);
    }


    @Override
    public void addBurgerAddition1(String addition1, double price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void addBurgerAddition2(String addition2, double price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void addBurgerAddition3(String addition3, double price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void addBurgerAddition4(String addition4, double price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }
}
