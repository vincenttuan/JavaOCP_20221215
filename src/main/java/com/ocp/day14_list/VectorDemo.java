package com.ocp.day14_list;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        // synchronized 同步集合
        // 支援多執行緒存取
        Vector v = new Vector();
        System.out.println("size(已用空間數): " + v.size());
        System.out.println("capacity(總空間數): " + v.capacity());
        
        for(int i=1;i<=9;i++) {
            v.add(i);
        }
        System.out.println(v);
        System.out.println("size(已用空間數): " + v.size());
        System.out.println("capacity(總空間數): " + v.capacity());
        
        
    }
}
