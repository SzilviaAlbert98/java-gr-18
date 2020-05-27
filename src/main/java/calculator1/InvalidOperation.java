package calculator1;

/*checked exception*/
public class InvalidOperation extends Exception {
    private int statusCode;

    public InvalidOperation(int statusCode, String message) {
        super(message);
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
