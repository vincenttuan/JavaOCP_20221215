package com.ocp.day04_basic;

public class MultiArrayDemo3 {
    public static void main(String[] args) {
        int[][] m = new int[2][];
        m[0] = new int[3];
        m[1] = new int[1];
        m[0][0] = 100;
        m[0][1] = 90;
        m[0][2] = 80;
        m[1][0] = 70;
        // 請逐筆將陣列元素資料印出
        for(int i=0;i<m.length;i++) {
            for(int k=0;k<m[i].length;k++) {
                System.out.println(m[i][k]);
            }
        }
    }
}
