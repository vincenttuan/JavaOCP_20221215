package com.ocp.day02_basic;

public class StudentDemo {
    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John";
        s1.score = 75;
        s1.check();
        
        Student s2 = new Student();
        s2.name = "Mary";
        s2.score = 45;
        s2.check();
        
        s1.print();
        s2.print();
        
        
    }
    
}
