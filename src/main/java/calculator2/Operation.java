package calculator2;

public interface Operation<T extends Number> {
    /**
     * perform an operation with two numbers
     *
     * @param number1
     * @param number2
     * @return
     */
    T calculate(T number1, T number2);
}
