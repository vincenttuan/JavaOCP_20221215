package com.ocp.day15_map;

// java 8 走訪 Map 集合資料

import java.util.LinkedHashMap;
import java.util.Map;

public class LoopMap {
    public static void main(String[] args) {
        
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("D", 40);
        map.put("E", 50);
        map.put("F", 60);
        System.out.println(map);
        // java 8 走訪 Map 集合資料
        // Map 中每一個元素 Map.Entry<String, Integer>
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
