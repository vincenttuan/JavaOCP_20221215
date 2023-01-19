package com.ocp.day10_oop;

public class Tank extends Car implements Weapon {

    @Override
    public void move() {
        System.out.println("坦克是用履帶走的, 時速 60km/h");
    }

    @Override
    public void shoot() {
        System.out.println("發射榴彈砲");
    }
    
}
