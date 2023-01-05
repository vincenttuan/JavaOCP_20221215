package com.ocp.day06_oop;

import java.util.Arrays;

public class PersonDemo3 {
    public static void main(String[] args) {
        Person p1 = new Person("John", 18);
        Person p2 = new Person("Jack", 19);
        Person p3 = new Person("Anita", 17);
        Person p4 = new Person("Bobo", 21);
        Person p5 = new Person("Candy", 20);
        // 建立 Person[] 陣列
        Person[] persons = {p1, p2, p3, p4, p5};
        System.out.println(persons);
        // 呼叫每一個 person 物件的 toString() 方法
        System.out.println(Arrays.toString(persons));
        
    }
}
