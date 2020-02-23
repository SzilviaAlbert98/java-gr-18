package ro.scl.compute;

public interface Operator {

    double compute(double operand1, double operand2);

    boolean canHandle(String operator);
}
