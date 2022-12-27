package com.ocp.day03_basic;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = "Java";
        
        //s2 = s1;
        //s1 = s2;
        s1 = s1.intern(); // 將 s1 所指向的字串放入到 String pool 中
        
        System.out.println(s1 == s2);
        
    }
}
