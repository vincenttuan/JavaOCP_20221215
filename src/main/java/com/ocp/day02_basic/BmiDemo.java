package com.ocp.day02_basic;

public class BmiDemo {
    
    public static void main(String[] args) {
        Bmi b1 = new Bmi();
        Bmi b2 = new Bmi();
        b1.name = "John";
        b1.weight = 60.0;
        b1.height = 170.0;
        b1.calcBmi();
        b1.print();
        
    }
    
}
