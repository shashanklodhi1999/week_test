package com.example.userManagement;

public class User {
private Integer userId ;
private String userName;
private String userAddress;
private Integer userPN ;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Integer getUserPN() {
        return userPN;
    }

    public void setUserPN(Integer userPN) {
        this.userPN = userPN;
    }
}
