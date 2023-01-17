package com.ocp.day09_oop;

public class PaperDog extends TDog {

    @Override
    public void eat() {
        System.out.println("吃紙");
    }
    
    @Override
    public void skill() {
        System.out.println("手做訓練");
    }
    
}
