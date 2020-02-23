package ro.scl.paint;

public class Square extends Shape {

    private int width;

    public Square(Position lowLeft, int width) {
        super(lowLeft);
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void draw() {
        System.out.println("Square:" + this.anchor + ", width:" + width + ", Color: " + this.color);
    }

}
