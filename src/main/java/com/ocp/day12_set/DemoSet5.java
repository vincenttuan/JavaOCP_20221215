package com.ocp.day12_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class DemoSet5 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Programmer", 65000);
        Employee emp2 = new Employee("Manager", 85000);
        Employee emp3 = new Employee("Programmer", 55000);
        Employee emp4 = new Employee("Programmer", 75000);
        Employee emp5 = new Employee("Manager", 95000);
        Set<Employee> employees = new LinkedHashSet<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        System.out.println(employees);
        System.out.println("員工人數: " +  employees.size()); // size() 取得集合元素個數
        // 1. 請問 Programmer 的總薪資 = ?
        int sum = employees.stream()
                           .filter(e -> e.getName().equals("Programmer"))
                           .mapToInt(e -> e.getSalary())
                           .sum();
        System.out.printf("Programmer 的總薪資: %,d\n", sum);
        // 2. 請問 Manager 的總薪資 = ?
        
    }
}
