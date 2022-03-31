package Academy.Learningprogramming;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Customer customer = new Customer("Abdinahmen", 54.66);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.35);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(100);
        intList.add(300);
        intList.add(400);

        for(int i=0; i<intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1,200);

        System.out.println("***********************");

        for(int i=0; i<intList.size(); i++){
            System.out.println(i + ": " +intList.get(i));
        }

    }
}
