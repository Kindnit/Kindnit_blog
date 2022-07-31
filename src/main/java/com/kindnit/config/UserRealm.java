package com.kindnit.config;

import com.kindnit.pojo.User;
import com.kindnit.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

//自定义的UserRealm
public class UserRealm extends AuthorizingRealm {

    @Autowired
    UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行了=>授权doGetAuthorizationInfo");//这里我们不使用授权,所以return null就好
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("执行了=>认证doGetAuthenticationInfo");
        //用户名、密码从数据库中获取
        UsernamePasswordToken usertoken = (UsernamePasswordToken) authenticationToken;
        //连接数据库
        User user = userService.checkUser(usertoken.getUsername());
        if(user==null){//没有这个人
            return null; //会到LoginController层报出UnknownAccountException用户名不存在异常
        }
        //可以加密、MD5加密，MD5盐值加密
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        session.setAttribute("user", user);
        //密码认证， Shiro 自己做，为了避免和密码的接触
        //最后返回一个 AuthenticationInfo 接口的实现类，这里选择 SimpleAuthenticationInfo
        // 三个参数：获取当前用户的 认证 ； 密码 ； 认证名
        return new SimpleAuthenticationInfo("",user.getPassword(),"");
    }
}
