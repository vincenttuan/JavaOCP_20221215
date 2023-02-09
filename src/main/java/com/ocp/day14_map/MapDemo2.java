package com.ocp.day14_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, Integer> employees = new LinkedHashMap<>();
        employees.put("John", 55000);
        employees.put("Mary", 85000);
        employees.put("Alen", 60000);
        System.out.println(employees);
        // 請計算總分與平均
        
    }
}
