package calculator1;

public class Calculator {
    public void execute(Double number1, String operation, Double number2) throws InvalidOperation {
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();

        switch (operation) {
            case "+":
                System.out.println("Result of addition: " + number1 + " + " + number2 + " = " + addition.calculate(number1, number2));
                break;

            case "-":
                System.out.println("Result of subtraction: " + number1 + " - " + number2 + " = " + subtraction.calculate(number1, number2));
                break;

            case "*":
                System.out.println("Result of multiplication: " + number1 + " * " + number2 + " = " + multiplication.calculate(number1, number2));
                break;

            case "/":
                if (number2 == 0) {
                    System.out.println("Divison by 0 is not interpreted!");
                } else {
                    System.out.println("Result of division: " + number1 + " / " + number2 + " = " + multiplication.calculate(number1, number2));
                }
                break;

            default:
                throw new InvalidOperation(600, "Invalid Operation!");

        }
    }
}
