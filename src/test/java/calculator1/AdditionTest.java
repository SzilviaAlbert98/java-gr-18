package calculator1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {
    @Test
    public void test_addition() {
        Addition addition = new Addition();
        assertEquals(15.0,addition.calculate(10.0,5.0));
    }

}