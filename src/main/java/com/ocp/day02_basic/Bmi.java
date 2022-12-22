package com.ocp.day02_basic;

public class Bmi {
    String name;
    double weight;
    double height;
    double bmi;
    
    void print() {
        System.out.printf("name: %s, weight: %.1f, height: %.1f, bmi: %.2f\n", 
                        name, weight, height, bmi);
    }
}
