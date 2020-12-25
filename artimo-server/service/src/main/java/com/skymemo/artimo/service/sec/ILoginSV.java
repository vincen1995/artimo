package com.skymemo.artimo.service.sec;

/**
 * 用户登录
 *
 * @since JDK
 * @author vc
 * @date 2020/11/21 16:31
 */
public interface ILoginSV {

    /**
     * 用户登录
     *
     * @param username
     * @param password
     * @throws Exception
     */
    void login(String username, String password) throws Exception;

}
