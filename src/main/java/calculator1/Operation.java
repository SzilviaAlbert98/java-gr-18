package calculator1;

/**
 * perform an operation with two numbers
 *
 * @param <T>
 */
public interface Operation<T extends Number> {
    T calculate(T number1, T number2);
}
