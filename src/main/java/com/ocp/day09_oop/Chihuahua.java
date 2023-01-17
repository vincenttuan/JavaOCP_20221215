package com.ocp.day09_oop;

public class Chihuahua implements Dog {

    @Override
    public void eat() {
        System.out.println("狗糧");
    }

    @Override
    public void skill() {
        System.out.println("接球");
    }
    
}
