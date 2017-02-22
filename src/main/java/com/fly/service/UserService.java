package com.fly.service;

import com.fly.bean.RepassBean;
import com.fly.bean.UserBean;
import com.fly.model.User;

/**
 * @author <a href="mailto:huanhuan_com@yeah.net">詹欢欢</a>
 * @since 2017/2/21 - 0:29
 */
public interface UserService {
    User selectUser(String email, String password);

    User selectUserById(String uid);

    User updateInfo(UserBean userBean);

    void updatePassword(RepassBean repassBean);
}
