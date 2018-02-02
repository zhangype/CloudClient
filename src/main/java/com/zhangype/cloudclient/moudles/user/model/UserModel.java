package com.zhangype.cloudclient.moudles.user.model;

/**
 * 用户Model
 *
 * @author 1141404898@qq.com
 * @version V1.0.0
 * @date 2018/1/10
 */
public class UserModel {
    /**
     * 账号
     */
    private String account;
    /**
     * 密码
     */
    private String passWord;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
