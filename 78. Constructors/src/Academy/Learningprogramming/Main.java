package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        BankAccount bobsAccount = new BankAccount(); // "12345",0.0,"Mohamed Ali","aabdinah@amazon.com","612- 806- 2458");
//
//        System.out.println(bobsAccount.getAccountNumber());
//        System.out.println(bobsAccount.getBalance());
//
//
//        bobsAccount.withdraw(100);
//
//        bobsAccount.deposit(50);
//        bobsAccount.withdraw(100);
//
//        bobsAccount.deposit(51);
//        bobsAccount.withdraw(100);
//
//        BankAccount abdiAccount = new BankAccount("Abdirahman", "abdi@gmail.com", "1736173681");
//        System.out.println("Name: " + abdiAccount.getCustomerName() + " Phone number: " + abdiAccount.getPhoneNumber());


        VipCustomer jimAccount = new VipCustomer();
        System.out.println("Name = " + jimAccount.getName() + ", " +  " Email address = " + jimAccount.getEmailAddress() + ", " + " Credit limit = " + jimAccount.getCreditLimit());

        VipCustomer davidAccount = new VipCustomer("David ", "david@email.com");
        System.out.println(davidAccount.getName());

        VipCustomer tomAccount = new VipCustomer("Tommy", "tom@email.com", (int) 100.00);
        System.out.println(tomAccount.getName() + " " + tomAccount.getEmailAddress() + " " + tomAccount.getCreditLimit());
    }
}
