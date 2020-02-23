package ro.scl.paint;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Canvas {

    //ismetlodhetnek az elemek es nem fontosak az indexei
    private List<Shape> shapes = new LinkedList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public boolean deleteShape(Shape shape) {
        boolean result = shapes.remove(shape);
        if (result) {
            shape.delete();
        }
        draw();

        return result;
    }

    public void draw() {
        for (Shape shape : shapes) {
            shape.draw();
        }

    }

}
