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
 * @since 2017/2/21 - 22:39
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "user/index", method = RequestMethod.GET)
    public String toUserIndex() {
        return "user/index";
    }

    @RequestMapping(value = "user/set", method = RequestMethod.GET)
    public String toUserSet(String uid, ModelMap modelMap) {
        User user = userService.selectUserById(uid);
        modelMap.put("user", user);
        return "user/set";
    }

    @RequestMapping(value = "user/updateInfo", method = RequestMethod.POST)
    public String updateInfo(LoginBean loginBean, ModelMap modelMap) {
        User user = userService.selectUser(loginBean.getUserName(), loginBean.getPassword());
        if (user == null) {
            modelMap.put("msg", "用户名密码错误");
            return "user/login";
        } else {
            modelMap.put("user", user);
            return "/user/home";
        }
    }

}
