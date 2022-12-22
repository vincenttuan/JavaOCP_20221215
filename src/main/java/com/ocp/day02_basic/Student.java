package com.ocp.day02_basic;

public class Student {
    
    String name;
    int score;
    boolean pass;
    
    void check() {
        if(score >= 60) {
            pass = true;
        } else {
            pass = false;
        }
    }
    
    void print() {
        System.out.printf("%s, %d, %b\n", name, score, pass);
    }
    
}
