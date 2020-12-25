package com.skymemo.artimo.service.sec.impl;

import com.skymemo.artimo.service.sec.ILoginSV;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

@Service(value = "iLoginSV")
public class LoginSVImpl implements ILoginSV {


    @Override
    public void login(String username, String password) throws Exception {
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        token.setRememberMe(false);

        Subject user = SecurityUtils.getSubject();
        user.login(token);

    }

}
