package calculator2;

import calculator1.InvalidOperation;
import lombok.extern.log4j.Log4j2;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.*;
import java.util.stream.Stream;

@Log4j2
public class Calculator2 {
    /**
     * scans a sequence of operations with single- digit numbers
     * and writes the result, if the given expression is correct
     * space, tab are also accepted
     * other valid characters:0,1,2,3,4,5,6,7,8,9,*,/,+,-
     *
     * @throws InvalidSequence
     * @throws InvalidOperation
     */
    public void start() throws InvalidSequence, InvalidOperation {
        Scanner scanner = new Scanner(System.in);
        log.info("\n\t Please input expression to calculate (ex. 5 * 5 + 3) :");
        String line = scanner.nextLine();

        String mathOperation = line.replaceAll("\\s+", "");

        List<String> list = Arrays.asList(Stream.of(mathOperation).map(String::valueOf).toArray(String[]::new));

        int priority = 0;
        String postfixBuffer = "";
        Stack<Character> stack = new Stack<Character>();
        List<String> postfixArray = new ArrayList<String>();
        Calculator1 calculator = Calculator1.getInstance();
        calculator.setCurrent(new BigDecimal(0));
        List<String> postfixString = infixToPostfixConvert(mathOperation);

        if (sequenceValidator(postfixString) == true) {
            count(calculator, postfixString);
            log.info("Result is " + calculator.getCurrent());
        } else {
            InvalidSequence e = new InvalidSequence("Invalid Sequence!");
            log.error("Error message: " + e.getMessage());
        }

    }

    /**
     * this method calculates the result for valid operations
     *
     * @param calculator1
     * @param postfix
     * @throws InvalidOperation
     */
    public void count(Calculator1 calculator1, List<String> postfix) throws InvalidOperation {
        Stack<BigDecimal> stack = new Stack<BigDecimal>();
        for (int i = 0; i < postfix.size(); i++) {
            String next = postfix.get(i);

            if (next.equals("+") || next.equals("-") || next.equals("*") || next.equals("/")) {
                ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(
                        next.charAt(0), stack.pop(), stack.pop(), calculator1);
                Invoker invoker = new Invoker();
                invoker.comp(arithmeticCalculator);
                stack.push(calculator1.getCurrent());
            } else {
                stack.push(new BigDecimal(next.trim()));
            }

        }
    }

    /**
     * makes a list of Strings based on the priority of the operations
     *
     * @param mathOperation
     * @return
     */
    public List<String> infixToPostfixConvert(String mathOperation) {
        int priority = 0;
        String postfixBuffer = "";
        Stack<Character> stack = new Stack<Character>();
        List<String> postfixArray = new ArrayList<String>();

        for (int i = 0; i < mathOperation.length(); i++) {
            char ch = mathOperation.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                if (postfixBuffer.length() > 0) {
                    postfixArray.add(postfixBuffer);
                }
                postfixBuffer = "";
                if (stack.size() <= 0) {
                    stack.push(ch);
                } else {
                    Character chTop = (Character) stack.peek();
                    if (chTop == '*' || chTop == '/') {
                        priority = 1;
                    } else {
                        priority = 0;
                    }

                    if (priority == 1) {
                        if (ch == '+' || ch == '-') {
                            postfixArray.add(String.valueOf(stack.pop()));
                            i--;
                        } else {
                            postfixArray.add(String.valueOf(stack.pop()));
                            i--;
                        }
                    } else {
                        if (ch == '+' || ch == '-') {
                            postfixArray.add(String.valueOf(stack.pop()));
                            stack.push(ch);
                        } else {
                            stack.push(ch);
                        }
                    }
                }
            } else {
                postfixBuffer += ch;
            }
        }
        postfixArray.add(postfixBuffer);
        int len = stack.size();
        for (int j = 0; j < len; j++)
            postfixArray.add(stack.pop().toString());

        return postfixArray;
    }

    /**
     * this method decides that the sequence contains only correct characters
     *
     * @param list
     * @return
     */
    public boolean sequenceValidator(List<String> list) {
        List<String> validList = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "*", "/", "");

        for (int i = 0; i < list.size(); i++) {
            if (!validList.contains(list.get(i))) {
                return false;
            }
        }

        return true;
    }

    public double numberFormatter(String number) throws InvalidNumberFormat {
        double doubleValue;
        try {
            doubleValue = Double.parseDouble(number);
        } catch (NumberFormatException e) {
            throw new InvalidNumberFormat(700, "Invalid Number Format!");
        }
        return doubleValue;
    }
}
