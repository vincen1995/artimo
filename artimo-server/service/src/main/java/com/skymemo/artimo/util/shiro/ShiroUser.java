package com.skymemo.artimo.util.shiro;

import com.skymemo.artimo.entity.sec.SecUser;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.subject.SimplePrincipalCollection;

/**
 * Description here.
 *
 * @since JDK*.*
 * @author vc
 * @date 2021/3/30 21:40
 */
public class ShiroUser extends SimpleAuthenticationInfo {

    public ShiroUser(Object principals, Object credentials, String nickName) {
        this.principals = new SimplePrincipalCollection(principals, nickName);
        this.credentials = credentials;
    }

}
