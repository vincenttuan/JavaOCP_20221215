package com.ocp.day01_basic;

import java.util.Arrays;

public class ArrayTest2 {

    public static void main(String[] args) {
        int[] scores = {100, 85, 74};
        System.out.println(scores);
        System.out.println(Arrays.toString(scores));
        // 想要計算總分 = ?
        int sum = 0;
        for (int x : scores) {
            sum += x; // sum = sum + x;
        }
        System.out.println(sum);
        // 印出平均
        double avg = (double) sum / scores.length;
        System.out.println(avg);
    }
}
