package com.ocp.day07_oop;

public class EmpAndMgrDemo5 {
    
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(30000),
            new Employee(40000),
            new Manager(80000),
            new Employee(45000),
            new Manager(90000),
            new Employee(5000),
        };
        
        // 印出 Employee, Manager 的薪資
        for(Employee emp : employees) {
            if(emp instanceof Manager) {
                System.out.printf("Manager 薪資 $%,d\n", emp.getSalary());
            } else {
                System.out.printf("Employee 薪資 $%,d\n", emp.getSalary());
            }
        }
        
    }
    
}
