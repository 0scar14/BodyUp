package controller.exceptions;

public class PreExistingEntityException extends Exception {
    public PreExistingEntityException(String message, Throwable cause) {
        super(message, cause);
    }
    public PreExistingEntityException(String message) {
        super(message);
    }
}
