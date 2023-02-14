package com.ocp.day15_map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByMap {
    public static void main(String[] args) {
        // 3 apple, 2 banana, 1 papaya, 1  orange
        List<String> fruits = Arrays.asList("apple", "papaya", "apple", "banana", "banana", "apple", "orange");
        System.out.println(fruits);
        
        // output: apple=3, banana=2, orange=1, papaya=1
        Map<String, Long> result = fruits.stream().collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting())
        );
        System.out.println(result);
    }
}
