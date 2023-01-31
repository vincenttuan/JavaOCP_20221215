package com.ocp.java11_lambda;

public class CompareTest {
    public static void main(String[] args) {
        
        Compare compare1 = (x, y) -> {
            if(x > y) {
                return x;
            } else {
                return y;
            }
        };
        System.out.println(compare1.max(15, 30));
        
        Compare compare2 = (x, y) -> (x > y) ? x : y;
        System.out.println(compare2.max(15, 30));
        
        Compare compare3 = (x, y) -> Integer.max(x, y);
        System.out.println(compare3.max(15, 30));
        
        Compare compare4 = Integer::max;
        System.out.println(compare4.max(15, 30));
        
    }
}



