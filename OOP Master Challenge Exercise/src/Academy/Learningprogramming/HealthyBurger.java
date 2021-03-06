package Academy.Learningprogramming;

public class HealthyBurger extends Burger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;


    public HealthyBurger(String meat, double price){
        super("healthy", "Brown rye", meat, price);
    }

    public void healthAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void healthAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double ItemizeBurger() {
      double burgerPrice =  super.ItemizeBurger();
      if(this.healthyExtra1Name != null){
          burgerPrice += this.healthyExtra1Price;
          System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
      }
        if(this.healthyExtra2Name != null){
            burgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }
        return burgerPrice;
    }
}
