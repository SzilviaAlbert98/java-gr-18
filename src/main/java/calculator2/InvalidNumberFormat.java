package calculator2;

public class InvalidNumberFormat extends Exception {
    private int statusCode;

    public InvalidNumberFormat(int statusCode, String message) {
        super(message);
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
