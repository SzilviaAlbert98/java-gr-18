package interfaces;

public class ShapeExample {
    public static void main(String[] args) {
        IShape circle = new Circle(2);
        System.out.println(circle.displayArea());

        IShape rectangle = new Rectangle(2,3);
        System.out.println(rectangle.displayArea());
    }
}
