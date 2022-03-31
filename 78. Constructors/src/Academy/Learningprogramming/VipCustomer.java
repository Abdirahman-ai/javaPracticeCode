package Academy.Learningprogramming;

public class VipCustomer {

    private String name;
    private int creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("default", "default@gmail.com", 1000);
    }

    public VipCustomer(String name, String emailAddress){
        this(name, emailAddress, 2000);
    }

    public VipCustomer(String name, String emailAddress, int creditLimit){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
