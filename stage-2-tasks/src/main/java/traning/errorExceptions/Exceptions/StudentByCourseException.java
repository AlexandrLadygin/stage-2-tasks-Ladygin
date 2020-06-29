package traning.errorExceptions.Exceptions;

public class StudentByCourseException extends Exception {
    public StudentByCourseException() {
    }

    public StudentByCourseException(String message) {
        super(message);
    }

    public StudentByCourseException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentByCourseException(Throwable cause) {
        super(cause);
    }
}
