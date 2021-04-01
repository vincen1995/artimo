package com.skymemo.artimo.util.shiro.config;

import com.skymemo.artimo.util.shiro.ShiroAuthorizingRealm;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ShiroConfig
 *
 * @since JDK*.*
 * @author vc
 * @date 2021/3/29 17:39
 */
@Configuration
public class ShiroConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(ShiroConfig.class);

    @Bean
    public ShiroFilterFactoryBean shiroFilter() {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();

        shiroFilterFactoryBean.setSecurityManager(getSecurityManager());
        shiroFilterFactoryBean.setFilterChainDefinitionMap(getShiroFilterChainDefinition().getFilterChainMap());

        return shiroFilterFactoryBean;
    }

    @Bean
    public ShiroFilterChainDefinition getShiroFilterChainDefinition() {
        DefaultShiroFilterChainDefinition shiroFilterChainDefinition = new DefaultShiroFilterChainDefinition();

        shiroFilterChainDefinition.addPathDefinition("/**", "anon");

        return shiroFilterChainDefinition;
    }

    @Bean
    public Realm getRealm() {
        Realm realm = null;
        try {
            realm = new ShiroAuthorizingRealm();
        } catch (Exception e) {
            LOGGER.error("ShiroConfig.getRealm -> Shiro获取Realm错误", e);
        }
        return realm;
    }

    @Bean
    public SecurityManager getSecurityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(getRealm());
        return securityManager;
    }

}
