package com.doban.domain;

/**
 * Created by Administrator on 2017/6/8.
 */
public class UserVo {
    private int id;
    private String userName;
    private String password;
    private InfoVo info;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public InfoVo getInfo() {
        return info;
    }

    public void setInfo(InfoVo info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", info=" + info +
                '}';
    }
}
