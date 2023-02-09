package com.ocp.day14_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo4 {
    public static void main(String[] args) {
        Map<String, Integer> scores = new LinkedHashMap<>();
        scores.put("John", 85);
        scores.put("Mary", 95);
        scores.put("Alen", 65);
        System.out.println(scores);
        // 請問最高分? 最高分是誰 ?
        int max = scores.values()
                        .stream()
                        .mapToInt(Integer::intValue)
                        .max()
                        .getAsInt();
        System.out.println(max);
        
        scores.entrySet()
              .stream()
              .filter(entry -> entry.getValue() == max)
              .forEach(entry -> System.out.println(entry.getKey()));
        
    }
}
