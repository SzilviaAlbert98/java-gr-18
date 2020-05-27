package calculator2;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Multiplication implements Operation<Number> {
    @Override
    public Double calculate(Number number1, Number number2) {
        double nr1 = 0;
        double nr2 = 0;

        try {
            nr1 = Double.parseDouble(String.valueOf(number1));
            nr2 = Double.parseDouble(String.valueOf(number2));
        } catch (NumberFormatException e) {
            log.error("Invalid Number Format!");
        }

        return nr1 * nr2;
    }
}
