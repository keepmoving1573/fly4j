package com.fly.controller;

import com.fly.bean.LoginBean;
import com.fly.model.User;
import com.fly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author <a href="mailto:huanhuan_com@yeah.net">詹欢欢</a>
 * @since 2017/2/19 - 20:47
 */
@Controller
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/", "index"}, method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "user/reg.html", method = RequestMethod.GET)
    public String toRegister(){
        return "/user/reg";
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String toLogin(){
        return "user/login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(LoginBean loginBean, ModelMap modelMap){
        User user = userService.selectUser(loginBean.getUserName(), loginBean.getPassword());
        if (user == null) {
            modelMap.put("msg", "用户名密码错误");
            return "user/login";
        } else {
            modelMap.put("user", user);
            return "/user/home";
        }
    }

    @RequestMapping(value = "logout", method = RequestMethod.GET)
    public String logout(){
        return "logout";
    }

}
