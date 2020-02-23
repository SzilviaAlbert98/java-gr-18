package ro.scl.compute;

public class Calculator {

//
    private Operator[] allOperator = FixOperator.values();

    public double compute (double operand1, double operand2, String operator) {
        Operator op = null;

//        switch (operator) {
//            case "+" : op = new Addition(); break;
//            case "*" : op = new Multiply(); break;
//            case "/" : op = new Divide(); break;
//            case "-" : op = new Substraction(); break;
//        }

        for (Operator testOperator : allOperator) {
            if (testOperator.canHandle(operator)) {
                op = testOperator;
                break;
            }
        }

        return op.compute(operand1,operand2);
    }

    public static void main(String[] args) {
        FixOperator.ADDITION.compute(1,1);

        //numele contantei
        FixOperator.ADDITION.name();

        //nu merge fiindca nu am ADDITION cu a mic
//        FixOperator.ADDITION.valueOf("aDDITION").compute(1.,2);

        FixOperator fixOperator
    }
}
