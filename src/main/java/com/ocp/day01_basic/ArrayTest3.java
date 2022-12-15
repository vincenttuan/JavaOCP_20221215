package com.ocp.day01_basic;

public class ArrayTest3 {
    
    public static void main(String[] args) {
        int[] aClass = {100, 90, 75}; // A 班
        int[] bClass = {90, 95, 81};  // B 班
        // 試問哪一個班級平均分數較高 ?
        double aAvg = getAvg(aClass);
        double bAvg = getAvg(bClass);
        System.out.printf("A 班平均: %.1f\n", aAvg);
        System.out.printf("B 班平均: %.1f\n", bAvg);
        System.out.println(aAvg > bAvg ? "A班平均高" : "B班平均高");
    }
    // 計算總分的方法
    public static int getSum(int[] scores) {
        int sum = 0;
        for(int x : scores) {
            sum += x;
        }
        return sum;
    }
    
    // 計算平均的方法
    public static double getAvg(int[] scores) {
        int sum = getSum(scores);
        double avg = (double)sum / scores.length;
        return avg;
    }
    
}
