package com.ocp.day15_map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByMap3 {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(95, 47, 86, 73, 32);
        System.out.println(scores);
        // 請計算出: 及格=3, 不及格=2
        Map<String, Long> result =  scores.stream().collect(
                Collectors.groupingBy(score -> score >= 60 ? "及格" : "不及格", Collectors.counting())
        );
        System.out.println(result);
        
        Map<String, List<Integer>> result2 =  scores.stream().collect(
                Collectors.groupingBy(
                        score -> score >= 60 ? "及格" : "不及格", 
                        Collectors.mapping(score->score, Collectors.toList()))
        );
        System.out.println(result2);
    }
}
