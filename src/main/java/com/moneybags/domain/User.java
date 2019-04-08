package com.moneybags.domain;

public class User {
    private Long userIdSeq;
    private String userName;
    private String password;

    public Long getUserIdSeq() {
        return userIdSeq;
    }

    public void setUserIdSeq(Long userIdSeq) {
        this.userIdSeq = userIdSeq;
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
}
