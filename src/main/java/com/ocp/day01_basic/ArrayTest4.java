package com.ocp.day01_basic;

public class ArrayTest4 {
    public static void main(String[] args) {
        int[] cClass = {89, 91, 69}; // A 班
        int[] dClass = {92, 65, 80};  // B 班
        // 試問哪一個班級平均分數較高 ?
        double cAvg = ArrayTest3.getAvg(cClass);
        double dAvg = ArrayTest3.getAvg(dClass);
        System.out.printf("C 班平均: %.1f\n", cAvg);
        System.out.printf("D 班平均: %.1f\n", dAvg);
        System.out.println(cAvg > dAvg ? "C 班平均高" : "D 班平均高");
    
    }
    
    
}
