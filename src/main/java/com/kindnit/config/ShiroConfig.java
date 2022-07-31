package com.kindnit.config;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {
    //ShiroFillterFactoryBean
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager defaultWebSecurityManager){
        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
        //设置安全管理器
        bean.setSecurityManager(defaultWebSecurityManager);
        //添加shiro的内置过滤器
         /*
            anon：无需认证就可以访问
            authc：必须认证了才能访问
            user：必须拥有记住我才能用
            perms：拥有对某个资源的权限才能访问
            role：拥有某个角色权限才能访问
         */
        Map<String,String> filterMap = new LinkedHashMap<>();
        //设置 /admin下的所有请求,只有认证过才能访问
        filterMap.put("/admin/*","authc");
        //注销请求，走过这个请求后shiro就会注销
        filterMap.put("/logout","logout");
        bean.setFilterChainDefinitionMap(filterMap);
        //设置登录请求
        bean.setLoginUrl("/admin/tologin");
        return bean;
    }

    //DefaultWebSecurityManager
    //使用@Qualifier这个注解和下面的userRealm方法绑定，Spring用的就是方法名
    @Bean(name="securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        //关联UserRealm
        securityManager.setRealm(userRealm); //通过Spirng给他
        return securityManager;
    }
    //创建 realm 对象，需要自定义
    @Bean
    public UserRealm userRealm(){
        return new UserRealm(); //现在我们自定义的这个类就被Spring给托管了
    }

}