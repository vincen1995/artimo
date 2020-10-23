package com.skymemo.common.response;

import com.skymemo.common.exception.BizException;
import com.skymemo.common.exception.ErrorCode;
import com.skymemo.common.response.impl.ResponseData;
import org.apache.commons.lang.StringUtils;

/**
 * A util generate ResponseData
 * @see IResponseData
 * @author vc
 * @since JDK1.5
 */
public class ResponseUtil {

    /**
     * Return data after success.
     * @param data result data
     * @param <T>
     * @return
     * @throws Exception
     */
    public static <T> IResponseData<T> success(T data) throws Exception{
        IResponseData<T> responseData = new ResponseData<T>();

        responseData.setCode(ErrorCode.SUCCESS.getCode());
        responseData.setMessage(ErrorCode.SUCCESS.getMessage());
        responseData.setData(data);

        return responseData;
    }

    /**
     * Return data after error.
     * @param e
     * @param <T>
     * @return
     * @throws Exception
     */
    public static <T> IResponseData<T> error(Exception e) throws Exception{
        if (e.getClass().equals(BizException.class)) {
            BizException ex = (BizException) e;
            return buildResponse(ex.getErrorCode(), ex.getErrorMessage(), null);
        } /*else if (e.getClass().equals(BaseException.class)) {
            BaseException ex = (BaseException) e;
            return buildResponse(ex.getErrorCode(), ex.getErrorMessage(), null);
        }*/ else {
            String message = e.getMessage();
            if (StringUtils.isBlank(message)) {
                message = ErrorCode.UNKNOWN_ERROR.getMessage();
            }
            return buildResponse(ErrorCode.UNKNOWN_ERROR.getCode(), message, null);
        }
    }

    /**
     * Build response data based on params.
     * @param code error code
     * @param message error message
     * @param data result data
     * @param <T>
     * @return
     * @throws Exception
     */
    private static <T> IResponseData<T> buildResponse(String code, String message, T data) throws Exception{
        IResponseData<T> responseData = new ResponseData<T>();

        responseData.setCode(code);
        responseData.setMessage(message);
        responseData.setData(data);

        return responseData;
    }

}


