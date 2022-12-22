package com.ocp.day02_basic;

public class Employee {
    String name;
    int salary;
    
    // 建構子
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", salary=" + salary + '}';
    }
    
}
