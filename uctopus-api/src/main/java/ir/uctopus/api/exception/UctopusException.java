package ir.uctopus.api.exception;

public abstract class UctopusException extends RuntimeException{
    public UctopusException() {
    }

    public UctopusException(String message) {
        super(message);
    }

    public UctopusException(String message, Throwable cause) {
        super(message, cause);
    }

    public UctopusException(Throwable cause) {
        super(cause);
    }
}
