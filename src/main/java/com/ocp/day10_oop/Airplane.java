package com.ocp.day10_oop;

public abstract class Airplane {
    public Airplane() {
        System.out.println("執行 Airplane 建構子");
    }
    public abstract void speed(); // 抽象方法
}
