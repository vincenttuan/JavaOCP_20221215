package com.ocp.day02_basic;

public class EmployeeDemo2 {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("John", 40000),
            new Employee("Mary", 45000),
            new Employee("Jack", 55000)
        };
        for(Employee emp : employees) {
            System.out.println(emp);
        }
        // 計算總薪資
        int sum = 0;
        for(Employee emp : employees) {
            sum += emp.salary;
        }
        System.out.println(sum);
    }
}
