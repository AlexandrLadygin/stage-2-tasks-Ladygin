package traning.errorExceptionsAnotherApproach.Exceptions;

public class InvalidMarkException extends Exception {
    public InvalidMarkException() {
    }

    public InvalidMarkException(String message) {
        super(message);
    }

    public InvalidMarkException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidMarkException(Throwable cause) {
        super(cause);
    }

    public InvalidMarkException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
