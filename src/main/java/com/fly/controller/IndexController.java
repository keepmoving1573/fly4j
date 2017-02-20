package com.fly.controller;

import com.fly.bean.LoginBean;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author <a href="mailto:huanhuan_com@yeah.net">詹欢欢</a>
 * @since 2017/2/19 - 20:47
 */
@Controller
public class IndexController {

    @RequestMapping(value = {"/", "index"}, method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "user/reg.html", method = RequestMethod.GET)
    public String toRegister(){
        return "/user/reg";
    }

    @RequestMapping(value = {"user/login.html", "user/login"}, method = RequestMethod.GET)
    public String toLogin(){
        return "/user/login";
    }

    @RequestMapping(value = {"user/login.html", "user/login"}, method = RequestMethod.POST)
    public String login(LoginBean loginBean, ModelMap modelMap){
        modelMap.put("uid", "123");
        modelMap.put("msg", 1);
        return "index";
    }

    @RequestMapping(value = "logout", method = RequestMethod.GET)
    public String logout(){
        return "logout";
    }

}
