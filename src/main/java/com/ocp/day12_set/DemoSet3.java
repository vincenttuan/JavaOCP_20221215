package com.ocp.day12_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class DemoSet3 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 50000);
        Employee emp2 = new Employee("Mary", 65000);
        Employee emp3 = new Employee("Bobo", 80000);
        Set<Employee> employees = new LinkedHashSet<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        System.out.println(employees);
        for(Employee emp : employees) {
            System.out.printf("姓名: %s 薪資: $%,d\n", emp.getName(), emp.getSalary());
        }
        // Java 8 stream
        // 每一個集合在 Java 8 之後都預設支援 stream()
        employees.forEach(emp -> System.out.printf("姓名: %s 薪資: $%,d\n", emp.getName(), emp.getSalary()));
        
        employees.stream()
                 .forEach(emp -> System.out.printf("姓名: %s 薪資: $%,d\n", emp.getName(), emp.getSalary()));
        
    }
}
