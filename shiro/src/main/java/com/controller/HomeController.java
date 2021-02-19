package com.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

    @RequestMapping({"/", "/index"})
    public String index() {
        return "/index";
    }

//    @RequestMapping("/login")
//    public String login(HttpServletRequest request, Map<String, Object> map) throws Exception {
//        System.out.println("HomeController.login()");
//        // 登录失败从request中获取shiro处理的异常信息。
//        // shiroLoginFailure:就是shiro异常类的全类名.
//        String exception = (String) request.getAttribute("shiroLoginFailure");
//        System.out.println("exception=" + exception);
//        String msg = "cheng";
//        if (exception != null) {
//            if (UnknownAccountException.class.getName().equals(exception)) {
//                System.out.println("UnknownAccountException -- > 账号不存在：");
//                msg = "UnknownAccountException -- > 账号不存在：";
//            } else if (IncorrectCredentialsException.class.getName().equals(exception)) {
//                System.out.println("IncorrectCredentialsException -- > 密码不正确：");
//                msg = "IncorrectCredentialsException -- > 密码不正确：";
//            } else if ("kaptchaValidateFailed".equals(exception)) {
//                System.out.println("kaptchaValidateFailed -- > 验证码错误");
//                msg = "kaptchaValidateFailed -- > 验证码错误";
//            } else {
//                msg = "else >> " + exception;
//                System.out.println("else -- >" + exception);
//            }
//        }
//        // 此方法不处理登录成功,由shiro进行处理
//        return "/login";
//    }

    @RequestMapping("/login")
    public String login(String name, String password) {
        Logger log = LoggerFactory.getLogger("登录界面日志");
        //获得当前登录对象
        Subject subject = SecurityUtils.getSubject();
        //封装用户名，密码
        UsernamePasswordToken token = new UsernamePasswordToken(name, password);


        try {
            subject.login(token);
            log.info("登录成功");
            return "/index";
        } catch (UnknownAccountException e) {
            log.info("用户名不存在");
            return "/login";
        } catch (IncorrectCredentialsException e) {
            log.info("密码错误");
            return "/login";
        }catch (AuthenticationException e){
            log.info("未知异常");
            return "/login";
        }

    }

    @RequestMapping("/403")
    public String unauthorizedRole() {
        System.out.println("------没有权限-------");
        return "/403";
    }
}
