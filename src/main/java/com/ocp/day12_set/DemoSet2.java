package com.ocp.day12_set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class DemoSet2 {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add("國文"); // String
        set.add(100);   // Integer
        set.add("數學"); // String
        set.add(null); // 空值
        set.add(90);    // Integer
        set.add("英文"); // String
        set.add(null); // 空值
        set.add(null); // 空值
        set.add(80);    // Integer
        System.out.println(set);
        // 利用 Iterator 來走訪每一個元素, 也可以移除不要的元素
        Iterator iter = set.iterator(); // 從集合 set 中提取 iterator 物件
        while (iter.hasNext()) { // 是否有元素 ?           
            Object item = iter.next(); // 取得元素
            System.out.println(item);
            if(item == null) { // 若 item 等於 null
                iter.remove(); // 移除元素
            }
        }
        System.out.println(set);
        
    }
}
