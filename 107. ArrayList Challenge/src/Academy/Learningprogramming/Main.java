package Academy.Learningprogramming;
import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("612-806-2458");


    public static void main(String[] args) {
	// write your code here

        boolean quit = false;
        startPhone();
        printAction();
        while(!quit){ // while quit is not true
            System.out.println("\nEnter actions: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("\nShutting down. . .");
                    quit = true;
                    break;
                case 1:
                   mobilePhone.printContacts();
                   break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printAction();
                    break;

            }

        }
    }

    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new phone number: ");
        String phone = scanner.nextLine();
        Contacts newContact = Contacts.createContact(name,phone);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added " + name + ", phone = " + phone);
        } else{
            System.out.println("Cannot add, " + name + ", already on file");
        }
    }

    private static void updateContact(){
        System.out.println("Enter exiting contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number");
        String newNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContact(newName,newNumber);
       if(mobilePhone.updateContact(existingContactRecord, newContact)){
           System.out.println("Successfully updated");
       } else {
           System.out.println("Error updating record");
       }
    }

    private static void removeContact() {
        System.out.println("Enter exiting contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Successfully deleted ");

        } else {
            System.out.println("Error deleting contact");
        }
    }



    private static void queryContact() {
        System.out.println("Enter exiting contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() + " Phone number is " + existingContactRecord.getPhoneNumber());

    }


    private static void startPhone(){
        System.out.println("Starting phone. . .");
    }

    private static void printAction(){
        System.out.println("\nAvailable actions: \npress");
        System.out.println("0 - to shutdown\n" +
                "1 - to print Contacts\n" +
                "2 - to add new contact\n" +
                "3 - to update an existing contact\n" +
                "4 - to remove existing contact\n" +
                "5 - query if an existing contact exists\n" +
                "6 - to print a list of available actions.");
        System.out.println("choose your actions: ");
    }
}
