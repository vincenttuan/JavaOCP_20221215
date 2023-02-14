package com.ocp.day15_map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByMap4 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Random r = new Random();
        for(int i=0;i<10;i++) {
            nums.add(r.nextInt(100) + 1); // 1~100 的隨機數
        }
        System.out.println(nums);
        // 1: 請計算出奇數, 偶數各有幾個?
        Map<String, Long> result = nums.stream().collect(
                Collectors.groupingBy(x -> x % 2 == 0?"偶數":"奇數", Collectors.counting())
        );
        System.out.println(result);
        
        // 2: 請計算出奇數, 偶數各有那些?
        Map<String, List<Integer>> result2 = nums.stream().collect(
                Collectors.groupingBy(
                            x -> x % 2 == 0?"偶數":"奇數", 
                           Collectors.mapping(Function.identity(), Collectors.toList())
                        )
        );
        System.out.println(result2);
    }
}
