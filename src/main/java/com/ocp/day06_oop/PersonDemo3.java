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
        // 依序印出每一筆紀錄 for-loop (Java 1.0)
        for(int i=0;i<persons.length;i++) {
            System.out.println(persons[i]);
        }
        // 依序印出每一筆紀錄 for-each (Java 5.0)
        for(Person person : persons) {
            System.out.println(person);
        }
        // 依序印出每一筆紀錄 Arrays.stream() (Java 8.0)
        Arrays.stream(persons).forEach(person -> System.out.println(person));
        
    }
}
