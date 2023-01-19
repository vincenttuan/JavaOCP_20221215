package com.ocp.day10_employees.dao;

import com.ocp.day10_employees.entity.Employee;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class EmployeeDaoImpl {
    // 利用 ArrayList 動態陣列來模擬資料庫
    private static ArrayList<Employee> employees = new ArrayList<>();
    // 預設資料
    static {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Employee emp1 = new Employee();
            emp1.setName("John");
            emp1.setBirth(format.parse("1990-01-01"));
            emp1.setSalary(70000);
        } catch (ParseException e) {
            System.out.println("生日資料錯誤");
        }
    }
    
    
}
