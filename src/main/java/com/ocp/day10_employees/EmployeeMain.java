package com.ocp.day10_employees;

import java.util.Scanner;

public class EmployeeMain {
    private static boolean play = true;
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
                break;
            case 2: // 查詢所有員工
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
}
