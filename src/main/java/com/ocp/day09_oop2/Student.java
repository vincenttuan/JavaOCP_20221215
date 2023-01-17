package com.ocp.day09_oop2;

public class Student extends SchoolPerson {
    private int score;
    private String name;
    private int age;
    
    public Student() {
    
    }

    public Student(int score, String name, int age) {
        this.score = score;
        this.name = name;
        this.age = age;
    }
    
    @Override
    public int getScore() {
        return score;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
    
}
