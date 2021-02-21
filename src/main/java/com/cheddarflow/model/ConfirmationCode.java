package com.cheddarflow.model;

public class ConfirmationCode {
    private String code;
    private String email;

    public ConfirmationCode() { }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
