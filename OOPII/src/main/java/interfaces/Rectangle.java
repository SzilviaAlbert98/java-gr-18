package interfaces;

public class Rectangle implements IShape{
    private final double lungime; //dupa constructor nu pot sa modific valoarea
    private final double latime;

    public Rectangle(double lungime, double latime) {
        this.latime = latime;
        this.lungime = lungime;
    }

    @Override
    public void draw() {
        System.out.println("the rectangle is drawing...");
    }

    @Override
    public double displayArea() {
        return lungime * latime;
    }
}
