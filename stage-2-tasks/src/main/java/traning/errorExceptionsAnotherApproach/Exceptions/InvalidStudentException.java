package traning.errorExceptionsAnotherApproach.Exceptions;

public class InvalidStudentException extends Exception {
    public InvalidStudentException() {
    }

    public InvalidStudentException(String message) {
        super(message);
    }

    public InvalidStudentException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidStudentException(Throwable cause) {
        super(cause);
    }

    public InvalidStudentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
