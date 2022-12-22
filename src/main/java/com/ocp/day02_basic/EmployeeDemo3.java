package com.ocp.day02_basic;

import java.util.ArrayList;

public class EmployeeDemo3 {
    public static void main(String[] args) {
        // 動態陣列
        ArrayList<Employee> employees = new ArrayList<>();
        
        employees.add(new Employee("John", 40000));
        employees.add(new Employee("Mary", 45000));
        
        System.out.println("資料筆數: " + employees.size());
        System.out.println(employees);
        int sum = 0;
        for(Employee emp : employees) {
            System.out.println(emp);
            sum += emp.salary;
        }
        System.out.println("總薪資: " + sum);
        
    }
}
