package com.ocp.day07_oop;

public class VarargDemo {
    
    public static int add(int x, int y) {
        return x + y;
    }
    
    public static int add(int x, int y, int z) {
        return x + y + z;
    }
    
    public static void main(String[] args) {
        int result1 = add(10, 20);
        int result2 = add(10, 20, 30);
        
        System.out.println(result1);
        System.out.println(result2);
        
    }
}
