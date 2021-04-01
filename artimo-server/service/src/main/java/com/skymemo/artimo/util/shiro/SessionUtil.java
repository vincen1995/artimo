package com.skymemo.artimo.util.shiro;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description here.
 *
 * @since JDK*.*
 * @author vc
 * @date 2021/3/31 17:45
 */
public class SessionUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(SessionUtil.class);

    private static final String KEY_USER = "KEY_USER";
    private static final String KEY_LOGIN_COUNT = "KEY_LOGIN_COUNT";

    public static void cacheUserInfo(ShiroUser user) {
        addToSession(KEY_USER, user);
    }

    public static ShiroUser getUserFromSession() {
        return (ShiroUser) getFromSession(KEY_USER);
    }

    public static Object getFromSession(String key) {
        if (StringUtils.isBlank(key)) {
            return null;
        }
        return getSession().getAttribute(key);
    }

    public static void addToSession(String key, Object obj) {
        if (StringUtils.isBlank(key)) {
            return;
        }
        getSession().setAttribute(key, obj);
    }

    private static Session getSession() {
        return getSubject().getSession();
    }

    private static Subject getSubject() {
        return SecurityUtils.getSubject();
    }

}
