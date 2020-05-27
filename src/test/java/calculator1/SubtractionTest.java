package calculator1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtractionTest {
    @Test
    public void test_subtraction() {
        Subtraction subtraction = new Subtraction();
        assertEquals(2.5,subtraction.calculate(4.0,1.5));
    }

}