package interfaces;

public class Circle implements IShape{
    public static final double PI = 3.15;
    private double raza;

    public Circle(double raza) {
        this.raza = raza;
    }

    @Override
    public void draw() {
        System.out.println("drawing the circle");
    }

    @Override
    public double displayArea() {
        return PI * raza * raza;
    }


}
