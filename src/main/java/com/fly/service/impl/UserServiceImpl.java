package com.fly.service.impl;

import com.fly.mapper.UserMapper;
import com.fly.model.User;
import com.fly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:huanhuan_com@yeah.net">詹欢欢</a>
 * @since 2017/2/21 - 0:29
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User selectUser(String email, String password) {
        User user = new User();
        user.setUserName(email);
        user.setPassword(password);
        return userMapper.selectUser(user);
    }

    public User selectUserById(String uid) {
        User user = new User();
        user.setId(uid);
        return userMapper.selectUser(user);
    }
}
