package com.fly.bean;

import com.fly.util.MD5Utils;

/**
 * @author <a href="mailto:huanhuan_com@yeah.net">詹欢欢</a>
 * @since 2017/2/19 - 21:17
 */
public class LoginBean {

    private String userName;
    private String password;
    private String vercode;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return MD5Utils.md5String(password);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVercode() {
        return vercode;
    }

    public void setVercode(String vercode) {
        this.vercode = vercode;
    }
}
