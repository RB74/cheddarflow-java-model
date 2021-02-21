package com.cheddarflow.model;

public class NumberUtilities {
    private static final double e = 0.000000001;

    public static boolean compareDoubles(double a, double b) {
        return !(Math.abs(a - b) > e);
    }
}
