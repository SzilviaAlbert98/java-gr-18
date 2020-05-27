package calculator2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {
    @Test
    void test_divisionByZero_exception() {
        Division division = new Division();
        Assertions.assertThrows(DivisionByZeroException.class, () -> {
            division.validDivisor(0);
        });
    }
}