package com.skymemo.common.response;

/**
 * The return data structure of API.
 * @author vc
 * @since JDK1.0
 */
public interface IResponseData<T> {

    String getCode();

    void setCode(String code);

    String getMessage();

    void setMessage(String message);

    T getData();

    void setData(T data);

}
