package com.ocp.day02_basic;

public class ExamDemo {
    public static void main(String[] args) {
        Exam exam1 = new Exam();
        exam1.chinese = 100;
        exam1.english = 87;
        exam1.math = 42;
        //exam1.calcSum();
        exam1.calcAvg();
        //System.out.println(exam1.toString());
        System.out.println(exam1);
        
        
    }
}
