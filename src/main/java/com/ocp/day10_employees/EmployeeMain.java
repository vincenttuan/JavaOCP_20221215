package com.ocp.day10_employees;

import com.ocp.day10_employees.entity.Employee;
import com.ocp.day10_employees.service.EmployeeService;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeMain {
    private static boolean play = true;
    private static EmployeeService service = new EmployeeService();
    
    public static void main(String[] args) {
        while (play) {            
            menu();
        }
        System.out.println("系統結束");
    }
    
    public static void menu() {
        System.out.println("-------------------");
        System.out.println("1. 新增員工");
        System.out.println("2. 查詢所有員工");
        System.out.println("3. 修改員工薪資");
        System.out.println("4. 刪除員工");
        System.out.println("0. Exit");
        System.out.println("-------------------");
        action();
    }
    
    public static void action() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請選擇 ==> ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: // 新增員工
                addEmployee();
                break;
            case 2: // 查詢所有員工
                printAllEmployees();
                break;
            case 3: // 修改員工薪資
                break;
            case 4: // 刪除員工
                break;
            case 0: // Exit
                play = false;
                break;
        }
    }
    
    public static void addEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入: 員工姓名 出生年-月-日 薪資");
        String name = scanner.next();
        String birth = scanner.next();
        Integer salary = scanner.nextInt();
        service.addEmployee(name, birth, salary);
    }
    
    public static void printAllEmployees() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        ArrayList<Employee> employees = service.findAll();
        System.out.println("-----------------------------");
        for (Employee e : employees) {
            System.out.printf("%5s %10s %8d\n", 
                    e.getName(), sdf.format(e.getBirth()), e.getSalary());
        }
        System.out.println("-----------------------------");
    }
    
}
