package com.ocp.day12_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class DemoSet4 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 50000);
        Employee emp2 = new Employee("Mary", 65000);
        Employee emp3 = new Employee("Bobo", 80000);
        Set<Employee> employees = new LinkedHashSet<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        System.out.println(employees);
        // 請計算總薪資 = ?
        
    }
}
