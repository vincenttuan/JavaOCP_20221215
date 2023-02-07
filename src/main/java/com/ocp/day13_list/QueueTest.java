package com.ocp.day13_list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> names = new LinkedList<>();
        names.offer("John");
        names.offer("Mary");
        names.offer("Bob");
        System.out.println(names);
        
        while (!names.isEmpty()) {
            String name = names.poll(); // 將 name 取出
            System.out.println("得到 " + name);
            System.out.println("names: " + names);
        }
        
        
    }
}
