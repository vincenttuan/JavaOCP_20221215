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
            // m[i] 是一個一維陣列
            System.out.println(Arrays.toString(m[i]));
            // 將陣列元素資料逐筆印出
            for(int k=0;k<m[i].length;k++) {
                System.out.println(m[i][k]);
            }
        }
        
        
    }
}
