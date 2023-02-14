package com.ocp.day15_map;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GroupByMap4 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Random r = new Random();
        for(int i=0;i<10;i++) {
            nums.add(r.nextInt(100) + 1); // 1~100 的隨機數
        }
        System.out.println(nums);
        // 1: 請計算出奇數, 偶數各有幾個?
        
        // 2: 請計算出奇數, 偶數各有那些?
    }
}
