package com.fly.service.impl;

import com.fly.bean.UserBean;
import com.fly.mapper.UserMapper;
import com.fly.model.User;
import com.fly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        return userMapper.selectOne(user);
    }

    public User selectUserById(String uid) {
        User user = new User();
        user.setId(uid);
        return userMapper.selectByPrimaryKey(user);
    }

    @Transactional
    public void updateInfo(UserBean userBean) {
        User user = new User();
        user.setId(userBean.getUid());
        user.setUserName(userBean.getUserName());
        user.setNickName(userBean.getNickName());
        user.setCity(userBean.getCity());
        user.setSex(userBean.getSex());
        user.setSignature(userBean.getSignature());
        user.setActiveStatus(0);
        userMapper.updateByPrimaryKeySelective(user);
    }
}
