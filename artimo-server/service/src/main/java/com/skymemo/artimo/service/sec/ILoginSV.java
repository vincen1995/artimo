package com.skymemo.artimo.service.sec;

import com.skymemo.artimo.entity.sec.SecUser;

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
     * @param username 用户名
     * @param password 密码
     * @throws Exception
     */
    void login(String username, String password) throws Exception;

    /**
     * 注销登录
     *
     * @throws Exception
     */
    void logout() throws Exception;

    /**
     * 用户注册
     *
     * @param user
     * @throws Exception
     */
    void register(SecUser user) throws Exception;
}
