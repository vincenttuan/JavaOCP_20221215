package com.ocp.day02_basic;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDemo3 {
    public static void main(String[] args) {
        // 動態陣列
        ArrayList<Employee> employees = new ArrayList<>();
        
        while (true) {            
            Scanner scanner = new Scanner(System.in);
            System.out.print("請輸入員工姓名 薪資: "); //Ex: John 40000
            String name = scanner.next();
            int salary = scanner.nextInt();
            // 動態加入 Employee 物件
            employees.add(new Employee(name, salary));
            System.out.print("資料加入成功! 是否要繼續(y/n)?");
            String check = scanner.next().intern(); // intern() 將字串放到 String pool 中, 就可以利用 == 來進行字串比較
            if(check == "n") {
                break;
            }
        }
        
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
