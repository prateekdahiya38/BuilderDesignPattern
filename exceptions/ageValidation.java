package builderDesignPattern.exceptions;

public class ageValidation extends RuntimeException{
    public ageValidation() {
    }

    public ageValidation(String message) {
        super(message);
    }

    public ageValidation(String message, Throwable cause) {
        super(message, cause);
    }

    public ageValidation(Throwable cause) {
        super(cause);
    }

    public ageValidation(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
