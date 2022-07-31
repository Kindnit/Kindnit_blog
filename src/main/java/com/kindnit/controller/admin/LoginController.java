package com.kindnit.controller.admin;

import com.kindnit.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/admin")
    public String loginPage(){
        return "admin/login01";
    }

    @RequestMapping("/admin/tologin")
    public String toLogin(){
        return "admin/login01";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        RedirectAttributes attributes){
        System.out.println("用户名：" + username + "   密码：" + password);
        //获取当前用户
        Subject subject = SecurityUtils.getSubject();
        //封装用户的登录数据
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        System.out.println(token);
        try {
            subject.login(token);   //执行登录的方法，没有异常就OK
            return "admin/index";
        } catch (UnknownAccountException e) {   //用户名不存在
            attributes.addFlashAttribute("message","用户名错误");
            return "redirect:/admin";
        } catch (IncorrectCredentialsException e){  //密码不存在
            attributes.addFlashAttribute("message","密码错误");
            return "redirect:/admin";
        }
    }

    @GetMapping("/logout")
    public String logOut(){
        // session.removeAttribute("user"); Shiro自动清除了session
        return "redirect:/admin";
    }


}
