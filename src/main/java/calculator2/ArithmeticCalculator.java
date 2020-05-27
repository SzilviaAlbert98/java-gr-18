package calculator2;

import calculator1.InvalidOperation;

import java.math.BigDecimal;

public class ArithmeticCalculator implements Command {
    private char operator;
    private BigDecimal leftOperand;
    private BigDecimal rightOperand;
    private Calculator1 calculator;

    public ArithmeticCalculator(char operator, BigDecimal leftOperand, BigDecimal rightOperand, Calculator1 calculator) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
        this.calculator = calculator;
    }

    @Override
    public void calc() throws InvalidOperation {
        calculator.execute(leftOperand, rightOperand, String.valueOf(operator));
    }
}
