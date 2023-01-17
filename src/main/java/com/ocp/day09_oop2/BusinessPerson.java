package com.ocp.day09_oop2;

public abstract class BusinessPerson implements Person {
    private int salary;
    private String name;
    private int age;

    public BusinessPerson() {
    }
    
    public BusinessPerson(int salary, String name, int age) {
        this.salary = salary;
        this.name = name;
        this.age = age;
    }
    
    //public abstract int getSalary();
    public int getSalary() {
        return salary;
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
