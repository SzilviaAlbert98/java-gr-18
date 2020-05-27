package calculator2;

public class InvalidSequence extends Exception {
    private final int statusCode;

    public InvalidSequence(String message) {
        super(message);
        this.statusCode = 900;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
