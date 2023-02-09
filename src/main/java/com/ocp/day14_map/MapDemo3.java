package com.ocp.day14_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<String, Double> map = new LinkedHashMap<>();
        map.put("半徑1", 10.5);
        map.put("半徑2", 12.0);
        map.put("半徑3", 7.5);
        System.out.println(map);
        // 請計算每一個半徑的圓面積
        map.values() // Collection<Double>
           .forEach(r -> System.out.println(r*r*Math.PI));
       
        // 請計算圓面積總和
        
    }
}
