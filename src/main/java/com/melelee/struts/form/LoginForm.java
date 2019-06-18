package com.melelee.struts.form;

import org.apache.struts.action.ActionForm;

/**
 * Created by melelee on 2019/6/18.
 */
public class LoginForm extends ActionForm {
    private String username;
    private String password;

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
}
