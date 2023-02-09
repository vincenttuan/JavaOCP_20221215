package com.ocp.day14_list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // 新增元素
        list.add("John");   // 0
        list.add("Mary");   // 1
        list.add("Bob");    // 2
        list.add("Helen");  // 3
        // 查詢元素 1
        list.forEach(e -> System.out.println(e));
        // 查詢元素 2
        System.out.println(list);
        // 修改元素
        System.out.println("將元素[1]修改成 Angle");
        list.set(1, "Angle"); // 將元素[1]修改成 Angle
        // 查詢元素
        System.out.println(list);
        // 刪除元素
        System.out.println("將元素[1]刪除");
        list.remove(1); // 將元素[1]刪除
        // 查詢元素
        System.out.println(list);
        
        
    }
}
