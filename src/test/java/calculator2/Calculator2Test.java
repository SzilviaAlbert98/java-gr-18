package calculator2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Calculator2Test {

    @Test
    void test_InvalidNumberFormat_exception() {
        Calculator2 calculator2 = new Calculator2();
        Assertions.assertThrows(InvalidNumberFormat.class, () -> {
            calculator2.numberFormatter("12a");
        });
    }

}