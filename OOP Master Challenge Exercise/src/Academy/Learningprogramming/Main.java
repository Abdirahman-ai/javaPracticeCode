package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Burger burger = new Burger("cheeseBurger","wheat","beef",4.00);
//        burger.ItemizeBurger();
        burger.addBurgerAddition1("Tomato", 0.27);
        burger.addBurgerAddition2("lettuce", 0.75);
        burger.addBurgerAddition3("onion",0.50);
        burger.addBurgerAddition4("pickles", 0.30);
        System.out.println("Total price is " + burger.ItemizeBurger() + "\n");


        HealthyBurger healthyBurger = new HealthyBurger("bacon", 2.67);
        healthyBurger.ItemizeBurger();
        healthyBurger.addBurgerAddition1("egg", 4.68);
        System.out.println("Total price is " + healthyBurger.ItemizeBurger() + "\n");


        DeluxeHamburger deluxeHamburger = new DeluxeHamburger();
        deluxeHamburger.ItemizeBurger();
        deluxeHamburger.addBurgerAddition3("Chipotle Sauce", 50.32);

    }
}
