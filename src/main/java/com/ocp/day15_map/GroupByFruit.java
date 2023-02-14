package com.ocp.day15_map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupByFruit {
    public static void main(String[] args) {
        List<Fruit> fruits = Arrays.asList(
                new Fruit("apple", 10, 9.99),
                new Fruit("banana", 20, 19.99),
                new Fruit("orange", 10, 29.99),
                new Fruit("watermelon", 10, 29.99),
                new Fruit("papaya", 20, 9.99),
                new Fruit("apple", 10, 9.99),
                new Fruit("banana", 10, 19.99),
                new Fruit("apple", 20, 9.99)
        );
        System.out.println(fruits);
        // 請計算出 19.99=[banana], 29.99=[orange, watermelon], 9.99=[papaya, apple]
        Map<Double, Set<String>> result = fruits.stream().collect(
                Collectors.groupingBy(
                        fruit->fruit.getPrice(),
                        Collectors.mapping(fruit -> fruit.getName(), Collectors.toSet())
                )
        );
        System.out.println(result);
        
        Map<Double, Set<String>> result2 = fruits.stream().collect(
                Collectors.groupingBy(
                        Fruit::getPrice,
                        Collectors.mapping(Fruit::getName, Collectors.toSet())
                )
        );
        System.out.println(result2);
    }
}
