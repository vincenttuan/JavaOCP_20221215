package com.ocp.day04_basic;

import java.util.Arrays;

public class MultiArrayDemo2 {
    public static void main(String[] args) {
        int[][] m = new int[2][3];
        // 將資料逐筆加入
        m[0][0] = 100;
        m[0][1] = 90;
        m[0][2] = 80;
        m[1][0] = 70;
        m[1][1] = 60;
        m[1][2] = 50;
        // 將資料逐筆印出
        for(int i=0;i<m.length;i++) {
            System.out.println(Arrays.toString(m[i]));
        }
        
        
    }
}
