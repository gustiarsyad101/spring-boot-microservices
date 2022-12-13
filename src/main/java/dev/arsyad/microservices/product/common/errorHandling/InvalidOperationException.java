package dev.arsyad.microservices.product.common.errorHandling;

public class InvalidOperationException extends RuntimeException {

    public InvalidOperationException(String message) {
        super(message);
    }

}
