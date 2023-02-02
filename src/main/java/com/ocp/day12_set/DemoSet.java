package com.ocp.day12_set;

// Set 不可重複元素的集合

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {
        //Set set = new HashSet();
        Set set = new LinkedHashSet();
        set.add("國文"); // String
        set.add(100);   // Integer
        set.add("數學"); // String
        set.add(90);    // Integer
        set.add("英文"); // String
        set.add(80);    // Integer
        System.out.println(set);
        // 透過 for/in 取得每一個元素
        for(Object item : set) {
            System.out.println(item + ", " + item.getClass().getTypeName());
        }
        // 計算總分
        System.out.println("計算總分:");
        int sum = 0;
        for(Object item : set) {
            if(item instanceof Integer) { // 判斷 item 是否可以轉型成 Integer ?
                //System.out.println(item);
                sum += (Integer)item; // 將 item 由 Object 型別轉型為 Integer, 再給 sum 進行累加
            }
        }
        System.out.println("總分 = " + sum);
    }
}
