package com.skymemo.artimo.controller.login;

import com.fasterxml.jackson.databind.JsonNode;
import com.skymemo.artimo.entity.sec.SecUser;
import com.skymemo.artimo.service.sec.ILoginSV;
import com.skymemo.common.exception.ErrorCode;
import com.skymemo.common.exception.ExceptionHelper;
import com.skymemo.common.response.IResponseData;
import com.skymemo.common.response.ResponseUtil;
import com.skymemo.common.util.JsonNodeUtil;
import com.skymemo.common.util.encrypt.MD5Util;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/common")
public class LoginController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @Resource(name = "iLoginSV")
    private ILoginSV iLoginSV;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public IResponseData login(@RequestBody JsonNode jsonNode) {
        try {
            String username = JsonNodeUtil.getString(jsonNode, "key9");
            String passwd = JsonNodeUtil.getString(jsonNode, "key1");
            if (StringUtils.isBlank(username) || StringUtils.isBlank(passwd)) {
                ExceptionHelper.throwException(ErrorCode.CLIENT_REQUEST_PARAMS_ERROR);
            }

            passwd = MD5Util.encrypt(passwd);
            iLoginSV.login(username, passwd);
            return ResponseUtil.success("登录成功");
        } catch (Exception e) {
            LOGGER.error("LoginController.login -> 登录异常", e);
            return ResponseUtil.error(e);
        }
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public IResponseData logout() {
        try {
            iLoginSV.logout();
            return ResponseUtil.success("注销登录成功");
        } catch (Exception e) {
            LOGGER.error("LoginController.logout -> 注销登录异常", e);
            return ResponseUtil.error(e);
        }
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public IResponseData register(@RequestBody JsonNode jsonNode) {
        try {
            String username = JsonNodeUtil.getString(jsonNode, "username");
            String nickname = JsonNodeUtil.getString(jsonNode, "nickname");
            String password = JsonNodeUtil.getString(jsonNode, "password");
            if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
                ExceptionHelper.throwException(ErrorCode.CLIENT_REQUEST_PARAMS_ERROR);
            }

            SecUser user = new SecUser();
            user.setUsername(username);
            user.setNickname(nickname);
            user.setPassword(MD5Util.encrypt(password));
            user.setSysRemark("用户注册");
            iLoginSV.register(user);

            return ResponseUtil.success("注册成功");
        } catch (Exception e) {
            LOGGER.error("LoginController.register -> 注册异常", e);
            return ResponseUtil.error(e);
        }
    }

}
