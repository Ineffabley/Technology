package com.bean;

/**
 * @author ywq
 * @date 2020/10/6 10:33
 */
public class User {
    private int id;              //id

    private String username;        //用户名

    private String password;        //密码

    private String phone;     //手机号码

    private String dw;      //所属单位


    public User() {
    }

    public User(String s, String s1) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDw() {
        return dw;
    }

    public void setDw(String dw) {
        this.dw = dw;
    }
}
