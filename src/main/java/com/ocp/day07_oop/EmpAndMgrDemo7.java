package com.ocp.day07_oop;

public class EmpAndMgrDemo7 {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(30000),
            new Employee(40000),
            new Manager(80000),
            new Employee(45000),
            new Manager(90000),
            new Employee(50000),
        };
        
        // 請問非 Manager 的 Employee 總薪資為何 ?
        int sum = 0;
        for(Employee emp : employees) {
            if(emp instanceof Manager) {
                // 不處理
            } else {
                // 處理
                sum += emp.getSalary();
            }
        }
        System.out.println(sum);
        //---------------------------------
        int sum2 = 0;
        for(Employee emp : employees) {
            if(!(emp instanceof Manager)) {
                sum2 += emp.getSalary();
            }
        }
        System.out.println(sum2);
    }
}
