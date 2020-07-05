package traning.errorExceptionsAnotherApproach.Exceptions;

public class InvalidSubjectException extends Exception {
    public InvalidSubjectException() {
    }

    public InvalidSubjectException(String message) {
        super(message);
    }

    public InvalidSubjectException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidSubjectException(Throwable cause) {
        super(cause);
    }

    public InvalidSubjectException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
