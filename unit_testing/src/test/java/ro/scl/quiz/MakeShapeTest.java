package ro.scl.quiz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ro.scl.collegge.Classroom;
import ro.scl.collegge.Student;

import static org.junit.jupiter.api.Assertions.*;

class MakeShapeTest {
    MakeShape makeShape;

    @BeforeEach
    public void setUp() {
        makeShape = new MakeShape();
    }

    @Test
    public void test_add_same_shape() {
        Shape s1 = new Circle(1);
        Shape s2 = new Circle(1);

//        assertTrue(makeShape.addShape(s1));
//        assertFalse(makeShape.addShape(s2));

    }

}