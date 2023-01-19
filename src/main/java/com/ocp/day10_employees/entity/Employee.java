package com.ocp.day10_employees.entity;

import java.util.Date;

public class Employee {
    private String name;
    private Date birth;
    private Integer salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", birth=" + birth + ", salary=" + salary + '}';
    }
    
    
}
