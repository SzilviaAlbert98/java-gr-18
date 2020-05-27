package calculator2;

import calculator1.InvalidOperation;

public class Invoker {
    public void comp(Command command) throws InvalidOperation {
        command.calc();
    }
}
