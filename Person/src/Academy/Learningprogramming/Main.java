package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Person person = new Person();
        person.setFirstName(" ");
        person.setLastName(" ");
        person.setAge(10);
        System.out.println("Full name = " + person.getFullName());
        System.out.println("Teen = " + person.isTeen());
        person.setFirstName("Abdirahman");
        person.setAge(18);
        System.out.println("Full name = " + person.getFullName());
        System.out.println("Teen = " + person.isTeen());
        person.setLastName("Ahmed");
        System.out.println("Full name = " + person.getFullName());

    }
}
