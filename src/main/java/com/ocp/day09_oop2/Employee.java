package com.ocp.day09_oop2;

public class Employee extends BusinessPerson {
    private int salary;
    private String name;
    private int age;

    public Employee() {
    }

    public Employee(int salary, String name, int age) {
        this.salary = salary;
        this.name = name;
        this.age = age;
    }
    
    @Override
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
