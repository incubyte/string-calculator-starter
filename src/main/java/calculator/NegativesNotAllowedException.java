package calculator;

public class NegativesNotAllowedException extends Exception {
    public NegativesNotAllowedException(String message) {
        super(message);
    }
}