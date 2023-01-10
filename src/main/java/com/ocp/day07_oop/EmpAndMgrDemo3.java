package com.ocp.day07_oop;

public class EmpAndMgrDemo3 {
    
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        Employee emp4 = new Manager();
        Employee emp5 = new Employee();
        Manager  mgr  = new Manager();
        
        Employee[] employees = {
            emp1, emp2, emp3, emp4, emp5, mgr
        };
        System.out.println("員工總數: " + employees.length);
        
        Manager[] managers = { mgr, (Manager)emp4 };
        System.out.println("管理者人數: " + managers.length);
        
    }
    
}
