package com.ocp.day15_map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByMap2 {
    public static void main(String[] args) {
        List<String> scores = Arrays.asList("A", "A", "B", "E", "D", "C", "C", "A", "B", "B", "E");
        System.out.println("全班成績等第: " + scores);
        // 請寫出每個等第有幾人 ?
        Map<String, Long> result = scores.stream().collect(
                Collectors.groupingBy(key -> getLevelName(key), Collectors.counting())
        );
        System.out.println(result);
    }
    
    public static String getLevelName(String key) {
        switch (key) {
            case "A":
                return "甲";
            case "B":
                return "乙";
            case "C":
                return "丙";
            case "D":
                return "丁";
            default:
                return "戊";
        }
    }
}
