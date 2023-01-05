package com.ocp.day06_oop;

public class Student extends Person {
    private int score;
    
    public Student() {
    
    }
    
    public Student(String name, int age, int score) {
        setName(name);
        setAge(age);
        this.score = score; // setScore(score);
    }
    
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" + "score=" + score + '}';
    }

    
}
