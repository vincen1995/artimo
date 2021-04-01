package com.skymemo.artimo.util.shiro;

import com.skymemo.artimo.entity.sec.SecUser;
import com.skymemo.artimo.service.sec.ISecUserSV;
import com.skymemo.artimo.service.sec.dto.UserConst;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**
 * ShiroAuthorizingRealm
 *
 * @since JDK*.*
 * @author vc
 * @date 2021/3/29 17:47
 */
public class ShiroAuthorizingRealm extends AuthorizingRealm {

    private static final Logger LOGGER = LoggerFactory.getLogger(ShiroAuthorizingRealm.class);

    @Resource(name = "iSecUserSV")
    ISecUserSV secUserSV;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        if (authenticationToken == null ||
                authenticationToken.getPrincipal() == null ||
                authenticationToken.getCredentials() == null) {
            return null;
        }

        String username = String.valueOf(authenticationToken.getPrincipal());
        String passwd = new String((char[]) authenticationToken.getCredentials());
        SecUser user = null;
        try {
            user = secUserSV.getUserByUsernameAndPassword(username, passwd);
        } catch (Exception e) {
            LOGGER.error("ShiroAuthorizingRealm.doGetAuthenticationInfo -> 查询用户信息错误", e);
            throw new AuthenticationException("查询用户信息错误", e);
        }

        if (user == null
                || UserConst.STATE_CLOSED.equals(user.getState())
                || UserConst.STATE_SYS_DEL.equals(user.getState())) {
            throw new IncorrectCredentialsException();
        } else if (UserConst.STATE_EXCESSIVE_ATTEMPTS.equals(user.getState())) {
            throw new ExcessiveAttemptsException();
        }

        ShiroUser shiroUser = new ShiroUser(user.getUsername(), passwd, user.getNickname());
        SessionUtil.cacheUserInfo(shiroUser);
        return shiroUser;
    }
}
