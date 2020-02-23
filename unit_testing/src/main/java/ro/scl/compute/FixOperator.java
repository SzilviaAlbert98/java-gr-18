package ro.scl.compute;

public enum FixOperator implements Operator {
    ADDITION {
        @Override
        public double compute(double operand1, double operand2) {
            return operand1+operand2;
        }

        @Override
        public boolean canHandle(String operator) {
            return "+".equals(operator);
        }
    },
    SUBSTRACT {
        @Override
        public double compute(double operand1, double operand2) {
            return operand1-operand2;
        }

        @Override
        public boolean canHandle(String operator) {
            return "-".equals(operator);
        }
    },
    DIVIDE {
        @Override
        public double compute(double operand1, double operand2) {
            return operand1/operand2;
        }

        @Override
        public boolean canHandle(String operator) {
            return "/".equals(operator);
        }
    },
    MULTIPLY{
        @Override
        public double compute(double operand1, double operand2) {
            return operand1*operand2;
        }

        @Override
        public boolean canHandle(String operator) {
            return "*".equals(operator);
        }
    };

}
