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
        // java 8 走訪 Map 集合資料 I
        // Map 中每一個元素 Map.Entry<String, Integer>
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // java 8 走訪 Map 集合資料 II (使用 lambda)
        // (k, v) 指的就是 Entry.Key 與 Entry.Value
        map.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
        
    }
}
