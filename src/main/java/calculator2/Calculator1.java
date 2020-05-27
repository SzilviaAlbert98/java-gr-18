package calculator2;

import calculator1.InvalidOperation;

import java.math.BigDecimal;

public class Calculator1 {
    private static Calculator1 calculator;
    private BigDecimal current = new BigDecimal(0);

    public static Calculator1 getInstance() {
        if (calculator == null) {
            calculator = new Calculator1();
        }
        return calculator;
    }

    /**
     * it recognizes the mathematical operation signal and performs the correct operation
     *
     * @param leftOperand
     * @param rightOperand
     * @param operation
     * @throws calculator1.InvalidOperation
     */
    public void execute(BigDecimal leftOperand, BigDecimal rightOperand, String operation) throws calculator1.InvalidOperation {
        switch (operation) {
            case "+":
                current = BigDecimal.valueOf(new Addition().calculate(leftOperand, rightOperand));
                break;
            case "-":
                current = BigDecimal.valueOf(new Subtraction().calculate(leftOperand, rightOperand));
                break;
            case "*":
                current = BigDecimal.valueOf(new Multiplication().calculate(leftOperand, rightOperand));
                break;
            case "/":
                current = BigDecimal.valueOf(new Division().calculate(leftOperand, rightOperand));
                break;
            default:
                throw new InvalidOperation(600, "Invalid Operation!");
        }
    }

    public BigDecimal getCurrent() {
        return current;
    }

    public void setCurrent(BigDecimal current) {
        this.current = current;
    }
}
