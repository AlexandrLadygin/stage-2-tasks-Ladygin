package traning.errorExceptionsAnotherApproach.Exceptions;

public class InvalidFacultyException extends Exception {
    public InvalidFacultyException() {
    }

    public InvalidFacultyException(String message) {
        super(message);
    }

    public InvalidFacultyException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidFacultyException(Throwable cause) {
        super(cause);
    }

    public InvalidFacultyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
