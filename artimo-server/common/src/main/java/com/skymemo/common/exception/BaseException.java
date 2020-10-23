package com.skymemo.common.exception;

/**
 * Custom exception
 * @author vc
 * @since JDK1.0
 */
public abstract class BaseException extends RuntimeException {

    protected String errorCode;
    protected String errorMessage;

    // protected BaseException(){}

    protected BaseException(String errorCode, String errorMessage) {
        super("errorCode: " + errorCode + " ,errorMessage: " + errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}
