package ir.uctopus.api.exception;

public class UctopusConfigurationException extends UctopusException {
    public UctopusConfigurationException(String message) {
        super(message);
    }

    public UctopusConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }

    public UctopusConfigurationException(Throwable cause) {
        super(cause);
    }
}
