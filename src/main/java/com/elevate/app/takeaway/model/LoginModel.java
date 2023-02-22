package com.elevate.app.takeaway.model;

import javax.validation.constraints.NotEmpty;

public class LoginModel {
    @NotEmpty(message = "UserName Is Require")
    private String userName;
    @NotEmpty(message = "Password Is Require")
    private String password;

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
