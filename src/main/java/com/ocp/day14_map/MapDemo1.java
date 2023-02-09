package com.ocp.day14_map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
        // Map 是一種 (key/value) 的集合
        // key 不可重複, value 可以重複
        Map<String, Integer> exams = new LinkedHashMap<>();
        exams.put("國文", 100);
        exams.put("數學", 75);
        exams.put("英文", 100);
        System.out.println(exams);
        // 單獨把所有的 key 取出
        Set<String> keys = exams.keySet();
        System.out.println(keys);
        // 單獨把所有內容取出
        Collection<Integer> values = exams.values();
        System.out.println(values);
        // 根據 key 取 value
        System.out.println(exams.get("英文"));
        System.out.println(exams.get("數學"));
    }
}
