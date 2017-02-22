package com.fly.controller;

import com.fly.bean.RepassBean;
import com.fly.bean.UserBean;
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
    public String updateInfo(UserBean userBean, ModelMap modelMap) {
        User user = userService.updateInfo(userBean);
        modelMap.put("user", user);
        modelMap.put("msg", "修改成功");
        return "user/set";
    }

    @RequestMapping(value = "/user/repass", method = RequestMethod.POST)
    public String repass(RepassBean repassBean, ModelMap modelMap) {
        userService.updatePassword(repassBean);
        modelMap.put("msg", "修改成功");
        return "user/set";
    }

}
