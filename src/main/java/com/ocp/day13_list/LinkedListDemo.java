package com.ocp.day13_list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

// 一般應用
public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("John");  // 0
        list.add("Mary");  // 1
        list.add("Bob");   // 2
        list.add("John");  // 3 (List 中允許資料重複)
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(1));
        
        ListIterator<String> iter = list.listIterator();
        while (iter.hasNext()) {
            int index = iter.nextIndex();
            String name = iter.next();
            System.out.printf("index: %d, name: %s\n", index, name);
        }
        
        while (iter.hasPrevious()) {
            int index = iter.previousIndex();
            String name = iter.previous();
            System.out.printf("index: %d, name: %s\n", index, name);
        }
        
    }
}
