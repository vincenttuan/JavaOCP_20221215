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
        
    }
}
