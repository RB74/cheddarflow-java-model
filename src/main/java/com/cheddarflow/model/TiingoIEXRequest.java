package com.cheddarflow.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@JsonDeserialize
public class TiingoIEXRequest {

    private TiingoIEXRequestType action = TiingoIEXRequestType.load;
    private String subscriptionId;
    private int thresholdLevel = 5;
    private Date createdSince;
    private List<String> symbols = new ArrayList<>();

    @NotNull
    @NotEmpty
    public TiingoIEXRequestType getAction() {
        return this.action;
    }
    public void setAction(TiingoIEXRequestType action) {
        this.action = action;
    }

    public String getSubscriptionId() {
        return this.subscriptionId;
    }
    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public Date getCreatedSince() {
        return this.createdSince;
    }
    public void setCreatedSince(Date createdSince) {
        this.createdSince = createdSince;
    }

    @Min(0)
    @Max(5)
    public int getThresholdLevel() {
        return this.thresholdLevel;
    }
    public void setThresholdLevel(int thresholdLevel) {
        this.thresholdLevel = thresholdLevel;
    }

    public List<String> getSymbols() {
        return this.symbols;
    }
    public void setSymbols(List<String> symbols) {
        if (symbols == null)
            symbols = new ArrayList<>(0);
        this.symbols = symbols;
    }

    @Override
    public String toString() {
        return "TiingoIEXRequest{" +
          "action='" + action + '\'' +
          ", subscriptionId='" + subscriptionId + '\'' +
          ", thresholdLevel=" + thresholdLevel +
          ", createdSince=" + createdSince +
          ", symbols=" + symbols +
          '}';
    }
}
