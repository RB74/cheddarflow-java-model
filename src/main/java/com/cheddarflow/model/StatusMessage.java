package com.cheddarflow.model;

public class StatusMessage {
    private boolean success;
    private String message;
    private Login login;

    public StatusMessage() {
    }

    public StatusMessage(boolean success) {
        this(success, null);
    }

    public StatusMessage(boolean success, String message) {
        this(success, message, null);
    }

    public StatusMessage(boolean success, String message, Login l) {
        this.success = success;
        this.message = message;
        this.login = l;
    }

    public StatusMessage(Exception e) {
        this(false, e.getMessage());
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() { return message; }

    public void setMessage(String message) { this.message = message; }

    public Login getLogin() { return login; }

    public void setLogin(Login login) { this.login = login; }
}
