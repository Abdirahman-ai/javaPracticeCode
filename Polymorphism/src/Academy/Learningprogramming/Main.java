package Academy.Learningprogramming;


class Movie{

    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName(){
        return this.name;
    }

}

class  Jaws extends Movie{

    public Jaws(){
        super("jaws");
    }


    public String plot(){
        return "A sharks eats lots of people";
    }
}

class IndependenceDay extends Movie{

    public IndependenceDay(String name){
        super("Independence Day ");
    }

    @Override
    public String plot(){
        return "Alliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie{
    public MazeRunner(String name){
        super("Maze Runner");
    }

    @Override
    public String plot(){
        return "Kids try and escape a maze. ";
    }
}

class StarWars extends Movie{
    public StarWars(){
        super("Star Wars");
    }

    @Override
    public String plot(){
        return "Imperial forces try to take over the universe";
    }
}

class Forgettable extends Movie{
    public Forgettable(){
        super("Forgettable ");
    }

    // No plot method here
}


// Main class below


public class Main {

    public static void main(String[] args) {
        // write your code here
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
//            assert movie != null;
            System.out.println("Movie # " + i +
                    " : " + movie.getName() + "\n" +
                    "plot:  " + movie.plot() + "\n");
        }

        Car car = new Car("Base car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake() + "\n");


        Toyota toyota = new Toyota("camary 4WD", 4);
        System.out.println(toyota.startEngine());
        System.out.println(toyota.accelerate());
        System.out.println(toyota.brake() + "\n");


        Honda honda = new Honda("Accord 4WD", 6);
        System.out.println(honda.startEngine());
        System.out.println(honda.accelerate());
        System.out.println(honda.brake() + "\n");


        Nissan nissan = new Nissan("Altima  4WD", 4);
        System.out.println(nissan.startEngine());
        System.out.println(nissan.accelerate());
        System.out.println(nissan.brake() + "\n");
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5 +1);
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay("Independence Day ");

            case 3:
                return new MazeRunner("Maze Runner");

            case 4:
                return new StarWars();

            case 5:
                return new Forgettable();
        }
        return null;
    }
}
