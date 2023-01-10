package com.ocp.day07_oop;

public class EmpAndMgrDemo4 {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(),
            new Employee(),
            new Manager(),
            new Manager(),
            new Employee(),
            new Employee(),
        };
        
        // 員工總數
        System.out.println("員工總數: " + employees.length);
        
        // 管理者人數
        int count = 0;
        for(Employee emp : employees) {
            System.out.println(emp instanceof Manager);
            if(emp instanceof Manager) {
                count++;
            }
        }
        System.out.println("管理者人數: " + count);
    }
}
