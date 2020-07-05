package traning.errorExceptionsAnotherApproach.Exceptions;

public class InvalidGroupException extends Exception {
    public InvalidGroupException() {
    }

    public InvalidGroupException(String message) {
        super(message);
    }

    public InvalidGroupException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidGroupException(Throwable cause) {
        super(cause);
    }

    public InvalidGroupException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
