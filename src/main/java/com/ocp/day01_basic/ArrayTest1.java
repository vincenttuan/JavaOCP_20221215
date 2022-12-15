package com.ocp.day01_basic;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] scores = {100, 85, 74};
               // 位置:  0    1   2
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores.length);
        // 利用 for-loop 印出陣列元素內容
        for(int i=0;i<scores.length;i++) {
            System.out.println(scores[i]);
        }
    }
}
