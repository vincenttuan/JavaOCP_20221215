package com.ocp.day13_set;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeTest {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee(1, "John", 32, 55000);
        Employee emp2 = new Employee(2, "Alen", 28, 45000);
        Employee emp3 = new Employee(3, "Mary", 30, 75000);
        
        Set<Employee> employees = new TreeSet<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        
        System.out.println(employees);
    }
}
