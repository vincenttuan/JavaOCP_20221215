package com.ocp.day10_oop;

public class Truck extends Car {

    @Override
    public void move() {
        System.out.println("卡車是用輪子走的, 時速: 90 km/h");
    }
    
}
