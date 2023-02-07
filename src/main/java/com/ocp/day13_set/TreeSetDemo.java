package com.ocp.day13_set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        
        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(2);
        set.add(5);
        set.add(8);
        System.out.println(set);
        
        Set<String> names = new TreeSet<>();
        names.add("Vincent");
        names.add("Anita");
        names.add("Howard");
        names.add("Joanna");
        System.out.println(names);
                
    }
}
