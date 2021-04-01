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
    SPECIAL_ERROR("A0000", "特殊错误集"),

    /* B**** - biz error **/
    BIZ_ERROR("B0000", "业务异常"),
    MULTI_RECORD_ERROR("B0001", "存在多条匹配数据"),
    NOT_FOUND_RECORD("B0002", "未查询到相应纪录"),
    USER_LOGIN_ERROR("B0100", "登录错误"),
    MULTI_USER_RECORD_ERROR("B0101", "存在多条用户纪录"),
    USER_LOGIN_INFO_ERROR("B0102", "用户名或密码错误"),
    USER_LOGIN_ERROR_LIMIT("B0103", "用户登录信息错误上限"),
    USER_BEEN_LOCKED("B0104", "账户被系统封禁"),
    USER_ALREADY_EXISTS("B0105", "用户名已存在"),

    /* C**** - client error */
    CLIENT_ERROR("C0000", "用户端错误"),
    CLIENT_REQUEST_PARAMS_ERROR("C0001", "请求参数校验失败"),

    /* S**** - server internal error */
    SERVER_INTERNAL_ERROR("S0000", "程序内部异常"),

    /* O**** - outer service call error */
    OUTER_SERVICE_CALL_ERROR("O0000", "外部服务调用异常"),

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
