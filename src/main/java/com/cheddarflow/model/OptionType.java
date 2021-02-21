package com.cheddarflow.model;

public enum OptionType {
    PUT, CALL;

    public static OptionType forString(String s) {
        if ("P".equalsIgnoreCase(s)) return PUT;
        if ("C".equalsIgnoreCase(s)) return CALL;
        return null;
    }

    public String toDbString() {
        if (this == PUT) return "P";
        if (this == CALL) return "C";
        return null;
    }
}
