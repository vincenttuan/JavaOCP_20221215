package com.ocp.day06_oop;

public class Employee extends Person {
    private int salary;
    
    public Employee() {
    }
    
    public Employee(String name, int age, int salary) {
        setName(name);
        setAge(age);
        this.salary = salary;
    }
    
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "salary=" + salary + "} " + super.toString();
    }
    
    
}
