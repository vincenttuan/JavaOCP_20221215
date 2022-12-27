package com.ocp.day03_basic;

public class StringDemo3 {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");
        System.out.println(s1 == s2);
        System.out.println(s1.intern() == s2.intern());
        
    }
}
