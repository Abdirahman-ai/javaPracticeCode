package Academy.Learningprogramming;

public class Burger {

    private String name;
    private String breadRollType;
    private double price;
    private String meat;

    private String addition1;
    private double addition1Price;

    private String addition2;
    private double addition2Price;

    private String addition3;
    private double addition3Price;

    private String addition4;
    private double addition4Price;


    public Burger(String name, String breadRollType, String meat, double price){
        this.name = name;
        this.breadRollType = breadRollType;
        this.price = price;
        this.meat = meat;
    }

    public void addBurgerAddition1(String addition1, double price){
        this.addition1 = addition1;
        this.addition1Price = price;
    }

    public void addBurgerAddition2(String addition2, double price){
        this.addition2 = addition2;
        this.addition2Price = price;
    }

    public void addBurgerAddition3(String addition3, double price){
        this.addition3 = addition3;
        this.addition3Price = price;
    }

    public void addBurgerAddition4(String addition4, double price){
        this.addition4 = addition4;
        this.addition4Price = price;
    }

    public double ItemizeBurger(){
        double burgerPrice = this.price;
        System.out.println(this.name + " burger " + "on a " + this.breadRollType + " roll " + "price is " +  this.price);
        if(this.addition1 != null){
            burgerPrice += this.addition1Price;
            System.out.println("added " + this.addition1 + " for an extra " +  this.addition1Price);
        }
        if(this.addition2 != null){
            burgerPrice += this.addition2Price;
            System.out.println("added " + this.addition2 + " for an extra " +  this.addition2Price);
        }
        if(this.addition3 != null){
            burgerPrice += this.addition3Price;
            System.out.println("added " + this.addition3 + " for an extra " +  this.addition3Price);
        }
        if(this.addition4 != null){
            burgerPrice += this.addition4Price;
            System.out.println("added " + this.addition4 + " for an extra " +  this.addition4Price);
        }
        return burgerPrice;
    }
}
