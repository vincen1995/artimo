package com.skymemo.artimo.entity.sec;

import java.time.LocalDateTime;

public class SecUser {
    private Long id;

    private String username;

    private String nickname;

    private String password;

    private String state;

    private LocalDateTime utcAvailable;

    private String sysRemark;

    private LocalDateTime utcCreate;

    private LocalDateTime utcUpdate;

    private String ex1;

    private String ex2;

    private String ex3;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public LocalDateTime getUtcAvailable() {
        return utcAvailable;
    }

    public void setUtcAvailable(LocalDateTime utcAvailable) {
        this.utcAvailable = utcAvailable;
    }

    public String getSysRemark() {
        return sysRemark;
    }

    public void setSysRemark(String sysRemark) {
        this.sysRemark = sysRemark == null ? null : sysRemark.trim();
    }

    public LocalDateTime getUtcCreate() {
        return utcCreate;
    }

    public void setUtcCreate(LocalDateTime utcCreate) {
        this.utcCreate = utcCreate;
    }

    public LocalDateTime getUtcUpdate() {
        return utcUpdate;
    }

    public void setUtcUpdate(LocalDateTime utcUpdate) {
        this.utcUpdate = utcUpdate;
    }

    public String getEx1() {
        return ex1;
    }

    public void setEx1(String ex1) {
        this.ex1 = ex1 == null ? null : ex1.trim();
    }

    public String getEx2() {
        return ex2;
    }

    public void setEx2(String ex2) {
        this.ex2 = ex2 == null ? null : ex2.trim();
    }

    public String getEx3() {
        return ex3;
    }

    public void setEx3(String ex3) {
        this.ex3 = ex3 == null ? null : ex3.trim();
    }
}