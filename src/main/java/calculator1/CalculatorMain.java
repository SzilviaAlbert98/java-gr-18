package calculator1;

public class CalculatorMain {
    public static void main(String[] args) throws InvalidOperation {
        Calculator calculator = new Calculator();
        calculator.execute((double) 2, "*", (double) 3);
        calculator.execute(2.5, "+", 3.6);
        calculator.execute(3.0, "/", 0.0);
        calculator.execute(5.0, "%", 50.0);
    }
}
