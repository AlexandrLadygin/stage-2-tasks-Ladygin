package traning.errorExceptions.Exceptions;

public class MarkException extends Exception {
    public MarkException() {
    }

    public MarkException(String message) {
        super(message);
    }

    public MarkException(String message, Throwable cause) {
        super(message, cause);
    }

    public MarkException(Throwable cause) {
        super(cause);
    }

    public MarkException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
