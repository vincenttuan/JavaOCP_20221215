package com.ocp.day09_oop;

// 抽象類別
public abstract class ADog implements Dog {

    @Override
    public void eat() {
        System.out.println("狗糧");
    }
    
}
