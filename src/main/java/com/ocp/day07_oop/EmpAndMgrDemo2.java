package com.ocp.day07_oop;

public class EmpAndMgrDemo2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.job();
        if(emp1 instanceof Manager) {
            ((Manager)emp1).report();
        }
        
        Employee emp2 = new Manager();
        emp2.job();
        if(emp2 instanceof Manager) {
            ((Manager)emp2).report();
        }
    }
}
