package calculator2;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Division implements Operation<Number> {
    @Override
    /*
       calculates the integer part of the quotient of two numbers
     */
    public Double calculate(Number number2, Number number1) {
        double nr1 = 0;
        double nr2 = 0;

        try {
            nr1 = Double.parseDouble(String.valueOf(number1));
            nr2 = Double.parseDouble(String.valueOf(number2));
        } catch (NumberFormatException e) {
            log.error("Invalid Number Format!");
        }

        if (validDivisor(nr2)) {
            return nr1 / nr2;
        } else {
            return 0.0;
        }
    }

    public boolean validDivisor(double nr2) {
        if (nr2 == 0) {
            log.info("Division by zero is not interpreted!");
            throw new DivisionByZeroException("Division by zero");
        } else return true;
    }
}
