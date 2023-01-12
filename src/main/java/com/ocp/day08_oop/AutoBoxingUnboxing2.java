package com.ocp.day08_oop;

public class AutoBoxingUnboxing2 {
    public static void main(String[] args) {
        // Java 5 以前
        int x = 10;
        Integer y = Integer.valueOf(20);
        System.out.println(x + y.intValue());
        
        // Java 5 以後 (引進 AutoBoxingUnboxing)
        int a = 10; 
        Integer b = 20; // autoboxing
        System.out.println(a + b); // autounboxing
        
        
    }
}
