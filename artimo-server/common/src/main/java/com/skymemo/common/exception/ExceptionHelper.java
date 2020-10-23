package com.skymemo.common.exception;

/**
 * A util to throw custom exception.
 * @see BizException
 * @author vc
 * @since JDK1.5
 */
public class ExceptionHelper {

    /**
     * throw BaseException
     * @param errorCode
     * @param args
     * @return
     * @throws Exception
     */
    public static BaseException throwException(ErrorCode errorCode, Object... args) throws Exception{
        if (errorCode == null) {
            errorCode = ErrorCode.UNKNOWN_ERROR;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(errorCode.getMessage());
        if (args != null && args.length > 0) {
            for (Object item : args) {
                sb.append(item.toString());
            }
        }

        throw new BizException(errorCode.getCode(), sb.toString());
    }

}
