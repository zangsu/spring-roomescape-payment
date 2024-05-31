package roomescape.exception;

import org.springframework.http.HttpStatusCode;

public class PaymentException extends RuntimeException {

    private final String errorMessage;
    private final HttpStatusCode httpStatusCode;

    public PaymentException(HttpStatusCode httpStatusCode, String errorMessage) {
        this(httpStatusCode, errorMessage, null);
    }
    public PaymentException(HttpStatusCode httpStatusCode, String errorMessage, Throwable cause) {
        super(cause);
        this.httpStatusCode = httpStatusCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public HttpStatusCode getHttpStatusCode() {
        return httpStatusCode;
    }
}
