package com.spring5.microbook.domain.exception;

public class CustomerNotFoundException extends RuntimeException {

    private static final long serrialVersionUID = 1L;
    private final String errMsgKey;
    private final String errorCode;

    public CustomerNotFoundException(final String message) {
        super(message);
        this.errMsgKey = "customer Not Found";
        this.errorCode = "101";
    }

    public String getErrMsgKey() {
        return errMsgKey;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
