package com.ocp.day19_exception;

public class Calculator {
    // 三角形面積
    public int triangleArea(int w, int h) {
        int area = w * h / 2;
        return area;
    }
    
    // 矩形周長
    public int rectMeter(int w, int h) {
        int result = 2 * (w + h);
        return result;
    }
}
