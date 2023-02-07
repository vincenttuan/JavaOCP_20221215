package com.ocp.day13_list;

import java.util.LinkedList;
import java.util.List;

public class DrinkTest {
    public static void main(String[] args) {
        Drink coffee = new Drink("Coffee", 100);
        Drink tea = new Drink("Tea", 50);
        Drink milk = new Drink("Milk", 60);
        
        List<Drink> orders = new LinkedList<>();
        orders.add(coffee);
        orders.add(tea);
        orders.add(tea);
        orders.add(coffee);
        orders.add(milk);
        orders.add(coffee);
        System.out.println(orders);
        System.out.println(orders.size());
        
        // 此筆訂單多少錢?
        int sum = 0;
        for(Drink drink : orders) {
            sum += drink.getPrice();
        }
        System.out.println(sum);
        
        // Java 8 Stream
        int sum2 = orders.stream()
                         .mapToInt(drink -> drink.getPrice())
                         .sum();
        System.out.println(sum2);
        
        int sum3 = orders.stream()
                         .mapToInt(Drink::getPrice)
                         .sum();
        System.out.println(sum3);
    }
}
