package com.ocp.day09_oop2;

public class Student extends SchoolPerson {

    @Override
    public int getScore() {
        return 90;
    }

    @Override
    public String getName() {
        return "John";
    }

    @Override
    public int getAge() {
        return 18;
    }
    
}
