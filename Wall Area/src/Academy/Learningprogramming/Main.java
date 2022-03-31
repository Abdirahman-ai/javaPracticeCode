package Academy.Learningprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Wall wallArea = new Wall(-1.25,-1.25);
        System.out.println("Area = " + wallArea.getArea());

        wallArea.setHeight(-1.5);
        System.out.println("width = " + wallArea.getWidth());
        System.out.println("height = " + wallArea.getHeight());
        System.out.println("area = " + wallArea.getArea());

    }
}
