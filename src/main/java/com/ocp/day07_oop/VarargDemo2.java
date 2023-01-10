package com.ocp.day07_oop;

public class VarargDemo2 {
    
    public static int add(int... values) { // values 要視為 int[]
        int sum = 0;
        for(int x : values) {
            sum += x;
        }
        return sum;
    }
    
    
    public static void main(String[] args) {
        int result1 = add(10, 20);
        int result2 = add(10, 20, 30);
        int result3 = add(10, 20, 30, 40);
        int result4 = add(10, 20, 30, 40, 50);
        int result5 = add(10, 20, 30, 40, 50, 60, 70, 80);
        int result6 = add();
        
        int[] values = {5, 10, 15, 20};
        int result7 = add(values);
        
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
    }
    
}
