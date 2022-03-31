package Academy.Learningprogramming;

public class Car {

    private boolean engine;
    private int cylinder;
    private int wheels;
    private String name;

    public Car(String name, int cylinder){
        this.engine = true;
        this.cylinder = cylinder;
        this.wheels = 4;
    }

    public String getName() {
        return this.name;
    }

    public int getCylinder(){
        return this.cylinder;
    }

    public String startEngine(){
        return "Car -> startEngine()";
    }

    public String accelerate(){
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
    }
}

class Toyota extends Car{

    public Toyota(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public String startEngine() {
        return "Toyota -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Toyota -> accelerate()";
    }

    @Override
    public String brake() {
        return "Toyota -> brake()";
    }
}

class Honda extends Car{

    public Honda(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public String startEngine() {
        return "Honda -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Honda -> accelerate()";
    }

    @Override
    public String brake() {
        return "Honda -> brake()";
    }
}

class Nissan extends Car{

    public Nissan(String name, int cylinder){
        super(name, cylinder);
    }

    @Override
    public String startEngine() {
        return "Nissan -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Nissan -> accelerate()";
    }

    @Override
    public String brake() {
        // Using getClass to get the class name for you
//        So the you don't have to type nissan all the time
        return getClass().getSimpleName() + " -> brake()";
    }

}
