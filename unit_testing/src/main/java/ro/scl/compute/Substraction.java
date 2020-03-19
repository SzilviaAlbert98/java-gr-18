package ro.scl.compute;

public class Substraction implements Operator {
    @Override
    public double compute(double operand1, double operand2) {
        return operand1 - operand2;
    }

    @Override
    public boolean canHandle(String operator) {
        return "-".equals(operator);
    }
}
