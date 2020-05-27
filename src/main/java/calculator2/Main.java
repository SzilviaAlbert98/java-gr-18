package calculator2;

import calculator1.InvalidOperation;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator2 calculator2 = new Calculator2();
        try {
            calculator2.start();
        } catch (InvalidSequence invalidSequence) {
            invalidSequence.printStackTrace();
        } catch (InvalidOperation invalidOperation) {
            invalidOperation.printStackTrace();
        }

    }
}

