package com.ocp.day10_oop;

public abstract class Car {
    public Car() {
        System.out.println("執行 Car 建構子");
    }
    public abstract void move();
}
