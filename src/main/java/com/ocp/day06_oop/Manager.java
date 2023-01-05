package com.ocp.day06_oop;

public class Manager extends Employee {
    private int budget;
    
    public Manager() {
    }
    
    public Manager(String name, int age, int salary, int budget) {
        super(name, age, salary);
        /*
        setName(name);
        setAge(age);
        setSalary(salary);
        */
        this.budget = budget;
    }
    
    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Manager{" + "budget=" + budget + "} " + super.toString();
    }
    
    
    
}
