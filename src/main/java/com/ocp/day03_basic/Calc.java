package com.ocp.day03_basic;

public class Calc {
    public static int rect(int h , int w) {
        return h * w;
    }
    public static double circle(int r) {
        return Math.pow(r, 2) * Math.PI;
    }
    public static double bmi(double h, double w) {
        return w / Math.pow(h/100, 2);
    }
}
