package ro.scl.paint;

public abstract class Shape {
    protected int color = 1;
    protected Position anchor = new Position(0, 0);

    public Shape(Position anchor) {
        this.anchor = anchor;
        System.out.println(this.myToString());
    }

    public void setAnchor(Position anchor) {
        this.anchor = anchor;
    }

//    void draw() {
//        if (this instanceof Circle) {
//            ((Circle) this).drawCircle();
//        }
//
//        if (this instanceof Square) {
//            ((Square) this).drawSquare();
//        }
//    }

    abstract void draw();

    public void move(Position newPosition) {
        int currentColor = this.color;
        setColor(0);
        draw();
        setAnchor(newPosition);
        setColor(currentColor);
        draw();
    }

    public void delete() {
        setColor(0);
        move(new Position(0, 0));
    }

    public void setColor(int color) {
        this.color = color;
    }

    private String myToString() {
        return "Shape{" +
                "color=" + color +
                ", anchor=" + anchor +
                '}';
    }
}
