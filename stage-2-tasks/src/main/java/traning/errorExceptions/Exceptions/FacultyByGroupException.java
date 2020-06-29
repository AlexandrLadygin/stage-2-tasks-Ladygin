package traning.errorExceptions.Exceptions;

public class FacultyByGroupException extends Exception {
    public FacultyByGroupException() {
    }

    public FacultyByGroupException(String message) {
        super(message);
    }

    public FacultyByGroupException(String message, Throwable cause) {
        super(message, cause);
    }

    public FacultyByGroupException(Throwable cause) {
        super(cause);
    }
}
