package com.ocp.day07_oop;

import java.util.Arrays;

public class EmpAndMgrDemo5 {
    
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(30000),
            new Employee(40000),
            new Manager(80000),
            new Employee(45000),
            new Manager(90000),
            new Employee(50000),
        };
        
        // 印出 Employee, Manager 的薪資
        for(Employee emp : employees) {
            if(emp instanceof Manager) {
                System.out.printf("Manager 薪資 $%,d\n", emp.getSalary());
            } else {
                System.out.printf("Employee 薪資 $%,d\n", emp.getSalary());
            }
        }
        // 總薪資與平均薪資? 利用 Java 8 Stream
        int sum = Arrays.stream(employees)
                        .mapToInt(emp -> emp.getSalary()) // [30000, 40000, 80000 , 45000, 90000, 50000
                        .sum();
        System.out.printf("總薪資: %,d\n", sum);
        
        double avg = Arrays.stream(employees)
                           .mapToInt(emp -> emp.getSalary()) // [30000, 40000, 80000 , 45000, 90000, 50000
                           .average() // 得到平均物件資料
                           .getAsDouble(); // 取出平均的 double 值
        System.out.printf("平均薪資: %,.1f\n", avg);
    }
    
}
