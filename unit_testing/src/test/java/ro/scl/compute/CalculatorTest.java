package ro.scl.compute;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void test_multiply () {
        Calculator c = new Calculator();
        assertEquals(10,c.compute(2,5,"*"));
    }

    @Test
    public void test_additon () {
        Calculator c = new Calculator();
        assertEquals(10,c.compute(5,5,"+"));
    }

    @Test
    public void test_substraction () {
        Calculator c = new Calculator();
        assertEquals(10,c.compute(15,5,"-"));
    }

    @Test
    public void test_divide () {
        Calculator c = new Calculator();
        assertEquals(20,c.compute(100,5,"/"));
    }
}