package com.spring5.microbook.domain.exception;

public class SeatUnavailable extends RuntimeException {
    private static final long serrialVersionUID = 1L;
    private final String errMsgKey;
    private final String errorCode;

    public SeatUnavailable(String errMsgKey, String errorCode) {
        this.errMsgKey = errMsgKey;
        this.errorCode = errorCode;
    }

    public SeatUnavailable(String message, String errMsgKey, String errorCode) {
        super(message);
        this.errMsgKey = errMsgKey;
        this.errorCode = errorCode;
    }

    public String getErrMsgKey() {
        return errMsgKey;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
