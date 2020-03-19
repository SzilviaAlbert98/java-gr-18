package ro.scl.quiz;


import ro.scl.collegge.Student;

import java.util.*;

public class MakeShape {

    private Set<Shape> shapes = new HashSet<>();



    public void addShape(Shape shape) {
        boolean contain = false;
        for (Shape element : shapes) {
            if (shape.equals(element)) {
                contain = true;
                break;
            }
        }

        if (contain) {
            System.out.println("You can not add this shape: "+ shape.toString() + ", because you have a similar one.");
        } else {
            shapes.add(shape);
        }
    }

    public double allArea() {
        double result = 0;
        for (Shape element : shapes) {
            result += element.getSurface();

        }
        return result;
    }

    public double allPerimeter() {
        double result = 0;

        for (Shape element : shapes) {
            result += element.getPerimeter();
        }
        return result;
    }

    public double allAreaAndAllPerimeter() {
        return this.allArea()+this.allPerimeter();
    }




}
