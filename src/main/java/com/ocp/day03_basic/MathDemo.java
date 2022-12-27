package com.ocp.day03_basic;

public class MathDemo {
    public static void main(String[] args) {
        
        double pi = Math.PI; // Math.PI 是類別變數
        System.out.println(pi);
        
        // 要計算3的5次方
        double result = Math.pow(3, 5);
        System.out.println(result);
        
        // A(10, 20), B(25, 50)
        // 求 AB 二點間的距離
        int x1=10, y1=20, x2=25, y2=50;
        double dx = Math.pow(x1-x2, 2);
        double dy = Math.pow(y1-y2, 2);
        double d = Math.sqrt(dx + dy); // sqrt 開根號
        System.out.println(d);
        
    }
}
