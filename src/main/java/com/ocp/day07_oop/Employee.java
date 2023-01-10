package com.ocp.day07_oop;

public class Employee {
    private int salary;

    public Employee() {
    }

    public Employee(int salary) {
        this.salary = salary;
    }
    
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public void job() {
        System.out.println("打雜");
    }
    
}
