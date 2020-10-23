package com.skymemo.common.exception;

/**
 * Custom error info of system.
 * <p>
 * Rules:
 *     00000 - success
 *     A**** - special error
 *     B**** - biz error
 *     C**** - client error
 *     S**** - server internal error
 *     O**** - outer service call error
 * @author vc
 * @since JDK1.5
 */
public enum ErrorCode {
    /* special code */
    SUCCESS("00000", "success"),
    UNKNOWN_ERROR("99999", "未知错误"),

    /* A**** - special error */

    /* B**** - biz error **/
    /* C**** - client error */
    /* S**** - server internal error */
    /* O**** - outer service call error */

    ;

    private String code;
    private String message;
    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        // this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        // this.message = message;
    }
}
