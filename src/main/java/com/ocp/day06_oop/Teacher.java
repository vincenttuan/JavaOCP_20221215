package com.ocp.day06_oop;

public class Teacher extends Person {
    private String subject;
    
    public Teacher() {
    
    }
    
    public Teacher(String name, int age, String subject) {
        setName(name);
        setAge(age);
        this.subject = subject;
    }
    
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" + "subject=" + subject + "} " + super.toString();
    }
    
}
