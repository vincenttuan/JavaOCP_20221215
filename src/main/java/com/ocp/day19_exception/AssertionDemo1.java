package com.ocp.day19_exception;

public class AssertionDemo1 {
    public static void main(String[] args) {
        
        int score = -70;
        
        assert(score >= 0 && score <= 100): "分數錯誤: " + score;
        
        if(score >= 60) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        
    }
}
