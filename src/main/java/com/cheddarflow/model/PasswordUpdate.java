package com.cheddarflow.model;

public class PasswordUpdate {
    private String username;
    private String code;
    private String password;

    public PasswordUpdate() { }

    public PasswordUpdate(String username, String code, String password) {
        setUsername(username);
        setCode(code);
        setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
