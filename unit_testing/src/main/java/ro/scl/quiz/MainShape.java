package ro.scl.quiz;

public class MainShape {
    public static void main(String[] args) {
        MakeShape mainShape = new MakeShape();

        mainShape.addShape(new Circle(1));
        mainShape.addShape(new Rectangle(1,2));
        mainShape.addShape(new Square(2));
        mainShape.addShape(new Triangle(3,4,5));
        mainShape.addShape(new Circle(1));

        System.out.println("Total sum for perimeter: " + mainShape.allPerimeter());
        System.out.println("Total sum for surface: " + mainShape.allArea());
    }
}
