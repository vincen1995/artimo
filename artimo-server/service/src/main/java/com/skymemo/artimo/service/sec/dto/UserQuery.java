package com.skymemo.artimo.service.sec.dto;

/**
 * 查询对象 用户
 * @author vc
 * @date 2020-11-20
 */
public class UserQuery {

    private String searchStr;
    private String username;
    private String password;
    private String state;

    public String getSearchStr() {
        return searchStr;
    }

    public void setSearchStr(String searchStr) {
        this.searchStr = searchStr;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
