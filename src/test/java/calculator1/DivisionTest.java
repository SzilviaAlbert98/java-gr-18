package calculator1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {
    @Test
    public void test_division() {
        Division division = new Division();
        assertEquals(10.0, division.calculate(100.0, 10.0));
    }
}