package com.skymemo.common.exception;

/**
 * Custom Exception.
 * @author vc
 * @since JDK1.0
 */
public class BizException extends BaseException {
    // private BizException() {}

    public BizException(String errorCode, String errorMessage) {
        super(errorCode, errorMessage);
    }
}
