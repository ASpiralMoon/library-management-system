package com.ts.library.entity;

import java.util.Date;

/**
 * Created by ASpiralMoon on 2017/1/6.
 * 读者实体类
 */
public class Reader {

    private Short userId;
    private String username;
    private String password;
    private String nickname;
    private Date registrationTime;
    private Date lastUpdatedTime;
    private Byte whetherAdministrator;
    private Byte validity;

    public Short getUserId() {
        return userId;
    }

    public void setUserId(Short userId) {
        this.userId = userId;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    public Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public Byte getWhetherAdministrator() {
        return whetherAdministrator;
    }

    public void setWhetherAdministrator(Byte whetherAdministrator) {
        this.whetherAdministrator = whetherAdministrator;
    }

    public Byte getValidity() {
        return validity;
    }

    public void setValidity(Byte validity) {
        this.validity = validity;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", registrationTime=" + registrationTime +
                ", lastUpdatedTime=" + lastUpdatedTime +
                ", whetherAdministrator=" + whetherAdministrator +
                ", validity=" + validity +
                '}';
    }
}
