package com.ocp.day04_basic;

public class StringExam {
    public static void main(String[] args) {
        String a = "Java";
        add(a);
        System.out.println(a);
        
        StringBuffer y = new StringBuffer("Java");
        add(y);
        System.out.println(y);
    }
    
    public static void add(String s) {
        s = s + "SCJP";
    }
    
    public static void add(StringBuffer sb) {
        sb.append("SCJP");
    }
}
