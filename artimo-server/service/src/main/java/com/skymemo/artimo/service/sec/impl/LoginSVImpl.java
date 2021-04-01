package com.skymemo.artimo.service.sec.impl;

import com.skymemo.artimo.entity.sec.SecUser;
import com.skymemo.artimo.service.sec.ILoginSV;
import com.skymemo.artimo.service.sec.ISecUserSV;
import com.skymemo.common.exception.ErrorCode;
import com.skymemo.common.exception.ExceptionHelper;
import com.skymemo.common.util.encrypt.MD5Util;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "iLoginSV")
public class LoginSVImpl implements ILoginSV {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginSVImpl.class);

    @Resource(name = "iSecUserSV")
    private ISecUserSV iSecUserSV;

    @Override
    public void login(String username, String password) throws Exception {
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        token.setRememberMe(false);
        Subject user = SecurityUtils.getSubject();

        try {
            user.login(token);

            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("LoginSVImpl.login -> 用户登录成功");
            }
        } catch (UnknownAccountException | IncorrectCredentialsException e) {
            LOGGER.error("LoginSVImpl.login -> 用户名或密码错误", e);
            ExceptionHelper.throwException(ErrorCode.USER_LOGIN_INFO_ERROR);
        } catch (ExcessiveAttemptsException e) {
            LOGGER.error("LoginSVImpl.login -> 用户登录信息错误上限", e);
            ExceptionHelper.throwException(ErrorCode.USER_LOGIN_ERROR_LIMIT);
        } catch (LockedAccountException e) {
            LOGGER.error("LoginSVImpl.login -> 账户被系统封禁", e);
            ExceptionHelper.throwException(ErrorCode.USER_BEEN_LOCKED);
        } catch (Exception e) {
            LOGGER.error("LoginSVImpl.login -> 登录错误", e);
            ExceptionHelper.throwException(ErrorCode.USER_LOGIN_ERROR, e);
        }
    }

    @Override
    public void logout() throws Exception {
        Subject user = SecurityUtils.getSubject();
        user.logout();
    }

    @Override
    public void register(SecUser user) throws Exception {
        // 添加用户数据
        iSecUserSV.addUser(user);
        // todo 其它处理
    }

}
