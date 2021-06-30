package com.cheddarflow.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Login {
    private String token;
    private String refreshToken;
    private String idToken;
    private String pnAuthKey; //PubNub client authKey - use with PubNub Access Manager channel grants
    private int expiresIn;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @JsonProperty("refresh_token")
    public String getRefreshToken() {
        return this.refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    @JsonProperty("id_token")
    public String getIdToken() {
        return this.idToken;
    }

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    @JsonProperty("expires_in")
    public int getExpiresIn() {
        return this.expiresIn;
    }

    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }

    @JsonProperty("pn_auth_key")
    public String getPnAuthKey() {
        return this.pnAuthKey;
    }

    public void setPnAuthKey(String pnAuthKey) {
        this.pnAuthKey = pnAuthKey;
    }
}
