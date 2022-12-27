package com.ocp.day03_basic;

public class StringDemo {
    public static void main(String[] args) {
        /*
        char c1 = 'A';
        char c2 = 'A';
        int x = 65;
        System.out.println(c1 == c2);
        System.out.println(c1 == x);
        System.out.println('B' == 66);
        */
        String s1 = new String("Java");
        String s2 = new String("Java");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        String s3 = "Java";
        String s4 = "Java";
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        
    }
}
