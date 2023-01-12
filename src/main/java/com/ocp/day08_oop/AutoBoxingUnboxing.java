package com.ocp.day08_oop;

// 自動拆裝箱
// 自動裝箱 AutoBoxing 將 int(基本) 轉 Integer(物件)
// 自動拆箱 AutoUnboxing 將 Integer(物件) 轉 int(基本)
public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        int x = Integer.MAX_VALUE;
        System.out.println(x);
        
        String s = "75";
        int y = Integer.parseInt(s); // 將字串 "75" 變成整數 75
        System.out.println(y);
        
        Integer a1 = Integer.valueOf(100);
        System.out.println(a1);
        Integer a2 = 100; // AutoBoxing
        System.out.println(a2);
        
        int a3 = a1.intValue();
        System.out.println(a3);
        int a4 = a1; // 相當於 a1.intValue(); AutoUnboxing
        System.out.println(a4);
        
    }
}
