package dev.arsyad.microservices.product.common.errorHandling;

import lombok.AllArgsConstructor;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
public class ErrorResponse {
    private String message;
    private String code;
}
