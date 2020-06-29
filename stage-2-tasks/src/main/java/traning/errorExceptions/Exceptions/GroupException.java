package traning.errorExceptions.Exceptions;

public class GroupException extends Exception {

    public GroupException() {
    }

    public GroupException(String message) {
        super(message);
    }

    public GroupException(String message, Throwable cause) {
        super(message, cause);
    }

    public GroupException(Throwable cause) {
        super(cause);
    }
}
