package ro.scl.paint;

public class Circle extends Shape {

    private int radius;

    public Circle(Position center, int radius) {
        super(center);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Circle:" + anchor.toString() + ", radius: " + radius + ", color: " + color);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
