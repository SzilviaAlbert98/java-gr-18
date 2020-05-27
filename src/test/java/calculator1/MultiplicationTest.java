package calculator1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {
    @Test
    public void test_multiplication() {
        Multiplication multiplication = new Multiplication();
        assertEquals(42.0,multiplication.calculate(6.0,7.0));
    }

}