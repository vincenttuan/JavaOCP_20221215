package com.ocp.day08_oop;

// 多載/超載範例
public class OverloadingDemo {
    
    public static void print(float x) {
        System.out.println("B");
    }
    
    public static void print(double x) {
        System.out.println("C");
    }
    
    public static void print(Integer x) {
        System.out.println("D");
    }
    
    public static void main(String[] args) {
        print(100);
    }
}
