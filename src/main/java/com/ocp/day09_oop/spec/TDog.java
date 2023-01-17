package com.ocp.day09_oop.spec;

import com.ocp.day09_oop.spec.Dog;

public abstract class TDog implements Dog {

    @Override
    public void eat() {
        System.out.println("吃電");
    }
    
}
