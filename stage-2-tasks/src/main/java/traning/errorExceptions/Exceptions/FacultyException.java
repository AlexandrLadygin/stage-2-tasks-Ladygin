package traning.errorExceptions.Exceptions;

public class FacultyException extends Exception {
    public FacultyException() {
    }

    public FacultyException(String message) {
        super(message);
    }

    public FacultyException(String message, Throwable cause) {
        super(message, cause);
    }

    public FacultyException(Throwable cause) {
        super(cause);
    }
}
