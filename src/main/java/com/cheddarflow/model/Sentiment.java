package com.cheddarflow.model;

public enum Sentiment {
    BULLISH, BEARISH;

    public String toString() {
        if (this == BULLISH) return "+";
        else if (this == BEARISH) return "-";
        return null;
    }
}
