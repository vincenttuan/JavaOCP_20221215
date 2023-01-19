package com.ocp.day10_oop;

public class Fighter extends Airplane implements Weapon {

    @Override
    public void speed() {
        System.out.println("時速 1200 km/h");
    }

    @Override
    public void shoot() {
        System.out.println("發射響尾蛇飛彈");
    }
    
}
