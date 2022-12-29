package com.ocp.day04_basic;

public class StringExam2 {
    public static void main(String[] args) {
        String a = "Java";
        a = add(a);
        System.out.println(a); // JavaSCJP
    }
    
    public static String add(String s) {
        s = s + "SCJP";
        return s;
    }
}
