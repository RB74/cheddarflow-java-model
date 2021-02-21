package com.cheddarflow.model;

public class CognitoUser {
    private String name;
    private String lastName;
    private String phoneNumber;
    private String score;
    private String plan;
    private boolean emailVerified;
    private String email;
    private Credentials credentials = new Credentials();
    private Permission permission = Permission.STANDARD;

    private String accessToken;
    private String refreshToken;
    private String idToken;

    public Permission getPermission() {
        return this.permission;
    }
    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    public Credentials getCredentials() { return credentials; }

    public void setCredentials(Credentials credentials) { this.credentials = credentials; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public String getAccessToken() { return accessToken; }
    public void setAccessToken(String accessToken) { this.accessToken = accessToken; }

    public String getRefreshToken() {
        return this.refreshToken;
    }
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getIdToken() {
        return this.idToken;
    }
    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    public String getScore() {
        return this.score;
    }

    public String getPlan() {
        return this.plan;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
