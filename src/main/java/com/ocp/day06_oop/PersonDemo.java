package com.ocp.day06_oop;

public class PersonDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        student.setAge(18);
        student.setScore(90);
        
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getScore());
        
        //Teacher teacher = new Teacher();
        
        
        
    }
}