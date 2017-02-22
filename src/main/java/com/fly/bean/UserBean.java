package com.fly.bean;

public class UserBean {
    /**
     * 主键
     */
    private String id;

    private String uid;

    /**
     * 登录名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 性别,0女1男
     */
    private Integer sex;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 签名
     */
    private String signature;

    /**
     * 城市
     */
    private String city;

    /**
     * 飞吻数量
     */
    private Integer kissNumber;

    /**
     * 头像图片路径
     */
    private String headImage;

    /**
     * 页面显示语言
     */
    private String language;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 最后修改时间
     */
    private String lastModifyTime;

    private Integer activeStatus;

    /**
     * 获取主键
     *
     * @return ID - 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * 获取登录名
     *
     * @return USER_NAME - 登录名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置登录名
     *
     * @param userName 登录名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取密码
     *
     * @return PASSWORD - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取昵称
     *
     * @return NICK_NAME - 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称
     *
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取性别,0女1男
     *
     * @return SEX - 性别,0女1男
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置性别,0女1男
     *
     * @param sex 性别,0女1男
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取手机号
     *
     * @return MOBILE - 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号
     *
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取签名
     *
     * @return SIGNATURE - 签名
     */
    public String getSignature() {
        return signature;
    }

    /**
     * 设置签名
     *
     * @param signature 签名
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * 获取城市
     *
     * @return CITY - 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置城市
     *
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取飞吻数量
     *
     * @return KISS_NUMBER - 飞吻数量
     */
    public Integer getKissNumber() {
        return kissNumber;
    }

    /**
     * 设置飞吻数量
     *
     * @param kissNumber 飞吻数量
     */
    public void setKissNumber(Integer kissNumber) {
        this.kissNumber = kissNumber;
    }

    /**
     * 获取头像图片路径
     *
     * @return HEAD_IMAGE - 头像图片路径
     */
    public String getHeadImage() {
        return headImage;
    }

    /**
     * 设置头像图片路径
     *
     * @param headImage 头像图片路径
     */
    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    /**
     * 获取页面显示语言
     *
     * @return LANGUAGE - 页面显示语言
     */
    public String getLanguage() {
        return language;
    }

    /**
     * 设置页面显示语言
     *
     * @param language 页面显示语言
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取最后修改时间
     *
     * @return LAST_MODIFY_TIME - 最后修改时间
     */
    public String getLastModifyTime() {
        return lastModifyTime;
    }

    /**
     * 设置最后修改时间
     *
     * @param lastModifyTime 最后修改时间
     */
    public void setLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public Integer getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Integer activeStatus) {
        this.activeStatus = activeStatus;
    }
}