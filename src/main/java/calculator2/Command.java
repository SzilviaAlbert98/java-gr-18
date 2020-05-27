package calculator2;

import calculator1.InvalidOperation;

public interface Command {
    public void calc() throws InvalidOperation;
}
